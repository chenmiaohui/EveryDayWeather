package weather.hanwei.com.model;

import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;

import okhttp3.Call;
import okhttp3.Response;
import weather.hanwei.com.bean.Weather;

/**
 * Created by cmh on 2017/3/20.
 */
public class WeatherImp implements WeatherModel {
    @Override
    public void load(final String city, final OnLoginListener loginListener) {
        //模拟子线程
        new Thread(){
            @Override
            public void run() {
                super.run();
                String url = "http://v.juhe.cn/weather/index?format=1&cityname="+city+"&key=d6257f63e0384eba477a218cc63c9a45";
                OkGo.get(url)
                        .tag(this)
                        .execute(new StringCallback() {
                            @Override
                            public void onSuccess(String result, Call call, Response response) {
                               if (result!=null){
                                    Gson gson = new Gson();
                                    Weather weather = gson.fromJson(result, Weather.class);
                                    loginListener.loginSuccess(weather);
                                }else{
                                    loginListener.loginFailed("服务器里面的数据为空...");
                                }
                            }
                        });
//                OkHttpUtils.get()
//                           .url(url)
//                           .build()
//                           .execute(new StringCallback() {
//                               @Override
//                               public void onError(Call call, Exception e, int id) {
//                                   loginListener.loginFailed("解析数据异常");
//                               }
//
//                               @Override
//                               public void onResponse(String response, int id) {
//                                   if (response!=null){
//                                       Gson gson = new Gson();
//                                       Weather weather = gson.fromJson(response, Weather.class);
//                                       loginListener.loginSuccess(weather);
//                                   }else{
//                                       loginListener.loginFailed("服务器里面的数据为空...");
//                                   }
//
//                               }
//                           });
            }
        }.start();
    }
}

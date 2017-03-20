package weather.hanwei.com.model;

import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;

import okhttp3.Call;
import okhttp3.Response;
import weather.hanwei.com.bean.ListTest;

/**
 * Created by cmh on 2017/3/20.
 */
public class ListImp implements ListModel{
    @Override
    public void loadList(final OnListListener listListener) {

        new Thread(){
            @Override
            public void run() {
                super.run();
                String url = "http://env.scsoft.com.cn:8023/dam/s/login/app/getAQIRankListByAreaId?format=json";
                OkGo.post(url)
                        .tag(this)
                        .params("areaId","C157")
                        .execute(new StringCallback() {
                            @Override
                            public void onSuccess(String s, Call call, Response response) {
                                if (s!=null){
                                    Gson gson = new Gson();
                                    ListTest listTest = gson.fromJson(s, ListTest.class);
                                    listListener.listSuccess(listTest);
                                }
                            }
                        });
            }
        }.start();
    }
}

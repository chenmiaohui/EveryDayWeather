package weather.hanwei.com.view;

import weather.hanwei.com.bean.Weather;

/**
 * Created by cmh on 2017/3/20.
 */
public interface loadView {

    //获取城市
    String getCity();
    //获取的数据展示
    void toMainActivity(Weather weather);
    //弹出的Toast
    void ShowToast(String msg);
    //加载失败
    void showFailedError();

}

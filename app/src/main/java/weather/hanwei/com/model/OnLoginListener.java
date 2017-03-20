package weather.hanwei.com.model;

import weather.hanwei.com.bean.Weather;

/**
 * Created by cmh on 2017/3/20.
 */
public interface OnLoginListener {

    void loginSuccess(Weather weather);

    void loginFailed(String s);
}

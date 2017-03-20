package weather.hanwei.com.presenter;

import android.os.Handler;

import weather.hanwei.com.bean.Weather;
import weather.hanwei.com.model.OnLoginListener;
import weather.hanwei.com.model.WeatherImp;
import weather.hanwei.com.view.loadView;

/**
 * Created by cmh on 2017/3/20.
 */
public class WeatherPresener{

    private loadView loadView;
    private WeatherImp weatherImp;
    private Handler handler = new Handler();
    public WeatherPresener(loadView loadView){
        this.loadView = loadView;
        weatherImp = new WeatherImp();
    }

    public void load(){
        weatherImp.load(loadView.getCity(), new OnLoginListener() {
            @Override
            public void loginSuccess(final Weather weather) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        loadView.toMainActivity(weather);
                    }
                });
            }

            @Override
            public void loginFailed(String s) {
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            loadView.showFailedError();
                        }
                    });
            }
        });
    }


}

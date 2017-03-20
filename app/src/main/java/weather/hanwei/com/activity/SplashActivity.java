package weather.hanwei.com.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import weather.hanwei.com.R;

//闪屏页面
public class SplashActivity extends AppCompatActivity {

    @InjectView(R.id.weather_img)
    ImageView weatherImg;
    @InjectView(R.id.second_time)
    Button secondTime;
    private CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.inject(this);
        initTime();
    }

    private void initTime() {

        timer = new CountDownTimer(3500,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                secondTime.setText(String.format(getResources().getString(R.string.skip), (int) (millisUntilFinished / 1000 + 0.1)));
            }

            @Override
            public void onFinish() {
                secondTime.setText(String.format(getResources().getString(R.string.skip), 0));
                Intent intent = new Intent(SplashActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        };
        timer.start();
    }

    @OnClick(R.id.second_time)
    public void onClick() {
       if (timer!=null){
           timer.cancel();
           Intent intent = new Intent(SplashActivity.this,HomeActivity.class);
           startActivity(intent);
           finish();
       }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (timer!=null){
            timer.cancel();
        }
    }
}

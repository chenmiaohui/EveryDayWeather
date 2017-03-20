package weather.hanwei.com.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import weather.hanwei.com.R;
import weather.hanwei.com.base.BaseActivity;
import weather.hanwei.com.bean.Weather;
import weather.hanwei.com.presenter.WeatherPresener;
import weather.hanwei.com.view.loadView;

/**
 * Created by cmh on 2017/3/20.
 */
public class HomeActivity extends BaseActivity implements loadView {

    @InjectView(R.id.city)
    TextView city;

    private WeatherPresener presener = new WeatherPresener(this);

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_home);
        presener.load();
    }

    @Override
    public void initViews() {

    }


    @Override
    public String getCity() {
        return "郑州";
    }

    //获取的数据更新UI
    @Override
    public void toMainActivity(Weather weather) {
        city.setText(weather.getResult().getToday().getCity());
    }

    @Override
    public void showFailedError() {
        ShowToast("加载失败...");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.inject(this);
    }

    @OnClick(R.id.city)
    public void onClick() {
        Intent intent = new Intent(HomeActivity.this,ListViewActivity.class);
        startActivity(intent);
        finish();
    }
}

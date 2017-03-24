package weather.hanwei.com.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.widget.FrameLayout;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import weather.hanwei.com.R;
import weather.hanwei.com.base.BaseActivity;
import weather.hanwei.com.bean.Weather;
import weather.hanwei.com.fragment.WeatherFragmentP;
import weather.hanwei.com.presenter.WeatherPresener;
import weather.hanwei.com.view.loadView;

/**
 * Created by cmh on 2017/3/20.
 */
public class HomeActivity extends BaseActivity implements loadView {

    @InjectView(R.id.city)
    TextView city;
    @InjectView(R.id.fragment)
    FrameLayout fragment;

    private WeatherPresener presener = new WeatherPresener(this);

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_home);
        ButterKnife.inject(this);
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
//        Fragment[] fragments = new Fragment[1];
//        fragments[0]  = new WeatherFragment(weather);
//        viewPager.setAdapter(new ContentPagerAdapter(getSupportFragmentManager(),fragments));
//        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });

        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        WeatherFragmentP fr = new WeatherFragmentP(weather);
        transaction.replace(R.id.fragment, fr);
        transaction.commit();
    }

    @Override
    public void showFailedError() {
        ShowToast("加载失败...");
    }


    @OnClick(R.id.city)
    public void onClick() {
        Intent intent = new Intent(HomeActivity.this, ListViewActivity.class);
        startActivity(intent);
        finish();
    }

}

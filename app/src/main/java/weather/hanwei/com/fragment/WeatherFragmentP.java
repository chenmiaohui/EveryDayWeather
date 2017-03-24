package weather.hanwei.com.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import weather.hanwei.com.R;
import weather.hanwei.com.bean.Weather;

/**
 * Created by cmh on 2017/3/24.
 */
public class WeatherFragmentP extends Fragment {

    Weather weather;
    public WeatherFragmentP(Weather weather) {

        this.weather = weather;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_weather, container, false);
        TextView city = (TextView) view.findViewById(R.id.tv_city);
        city.setText(weather.getResult().getToday().getCity());
        return view;
    }
}

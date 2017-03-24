package weather.hanwei.com.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import weather.hanwei.com.R;
import weather.hanwei.com.bean.Weather;

/**
 * Created by cmh on 2017/3/24.
 */
public class WeatherFragment extends Fragment {

    private Weather weather;
    public WeatherFragment(Weather weather) {
        this.weather = weather;
//        Toast.makeText(getActivity(),"有数据"+weather,Toast.LENGTH_SHORT).show();
        Log.e("ee","="+weather.getResult().getToday().getCity());
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    private TextView city;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weather, container, false);
        city = (TextView) view.findViewById(R.id.tv_city);
        city.setText(weather.getResult().getToday().getCity());
        return view;
    }
}

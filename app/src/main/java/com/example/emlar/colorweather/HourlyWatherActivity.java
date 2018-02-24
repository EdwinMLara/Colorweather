package com.example.emlar.colorweather;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.emlar.colorweather.Adapters.hourlyWeatherAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HourlyWatherActivity extends Activity {
    @BindView(R.id.hourlyListView) ListView hourlyListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_wather);
        ButterKnife.bind(this);

        Hour hour = new Hour();
        hour.setTitle("11:00pm");
        hour.setWeatherDescription("there is a storm");

        Hour hour2 = new Hour();
        hour2.setTitle("12:00pm");
        hour2.setWeatherDescription("there is not a storm");

        ArrayList<Hour> hours = new ArrayList<Hour>();
        hours.add(hour);
        hours.add(hour2);

        hourlyWeatherAdapter hourlyWeatherAdapter1 = new hourlyWeatherAdapter(this,hours);
        hourlyListView.setAdapter(hourlyWeatherAdapter1);
    }
}

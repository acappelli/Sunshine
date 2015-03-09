package org.acappelli.sunshine;

/**
 * @author Andrea Cappelli
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import org.acappelli.sunshine.response.Weather;

import adapter.SevenDaysWeatherAdapter;

public class WeatherFragment extends Fragment {

    View rootView;
    ListView mWeatherList;
    SwipeRefreshLayout mSwipeRefreshLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        return rootView;


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mWeatherList = (ListView) rootView.findViewById(R.id.listview_forecast);
        mSwipeRefreshLayout = (SwipeRefreshLayout) rootView.findViewById(R.id.swipeRefresh);
        mSwipeRefreshLayout.setColorScheme(android.R.color.holo_blue_bright,
                android.R.color.holo_red_light, android.R.color.holo_green_light);
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                updateData();
            }
        });
        updateData();
    }

    private void updateData() {
        Ion.with(getActivity())
                .load("http://api.openweathermap.org/data/2.5/forecast/daily?q=Fiumicino&mode=json&units=metric&cnt=7&lang=it")
                .asJsonObject()
                .setCallback(new FutureCallback<JsonObject>() {
                    @Override
                    public void onCompleted(Exception e, JsonObject result) {
                        if (e != null) {
                            return;
                        }
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        Gson gson = gsonBuilder.create();
                        Weather response = gson.fromJson(result, Weather.class);
                        SevenDaysWeatherAdapter sevenDaysWeatherAdapter = new SevenDaysWeatherAdapter(getActivity(), response);
                        mWeatherList.setAdapter(sevenDaysWeatherAdapter);
                        mSwipeRefreshLayout.setRefreshing(false);
                    }
                });

    }
}

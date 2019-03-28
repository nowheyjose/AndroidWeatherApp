package com.example.jose_diaz.androidweatherapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TodaysWeatherFrag extends Fragment {

    static TodaysWeatherFrag instance;

    public static TodaysWeatherFrag getInstance() {
        if(instance == null) {
            instance = new TodaysWeatherFrag();
        }
        return instance;
    }

    public TodaysWeatherFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_todays_weather, container, false);
    }

}

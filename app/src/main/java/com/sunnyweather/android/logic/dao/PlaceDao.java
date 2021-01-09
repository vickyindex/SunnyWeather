package com.sunnyweather.android.logic.dao;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.sunnyweather.android.SunnyWeatherApplication;
import com.sunnyweather.android.logic.model.Place;

public class PlaceDao {
    //用于将Place对象存储到SharedPreferences中
    public static void savePlace(Place place)
    {
        sharedPreferences().edit().putString("place",new Gson().toJson(place));
    }

    public static Place getSavedPlace()  {
        String place=sharedPreferences().getString("place","");

        return new Gson().fromJson(place,Place.class);
    }

    public static boolean isPlaceSaved(){
        return sharedPreferences().contains("place");
    }

    private static SharedPreferences sharedPreferences() {
        return SunnyWeatherApplication.context.getSharedPreferences("sunny_weather",Context.MODE_PRIVATE);
    }
}

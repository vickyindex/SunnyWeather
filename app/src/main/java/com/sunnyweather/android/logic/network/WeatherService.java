package com.sunnyweather.android.logic.network;

import com.sunnyweather.android.SunnyWeatherApplication;
import com.sunnyweather.android.logic.model.DailyResponse;
import com.sunnyweather.android.logic.model.RealtimeResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WeatherService {
    //使用@GET注解声明要访问的API接口
    @GET("v2.5/" + SunnyWeatherApplication.TOKEN + "/{lng},{lat}/realtime.json")
    //getRealtimeWeather()方法用于获取实时的天气信息
    Call<RealtimeResponse> getRealtimeWeather(@Path("lng") String lng, @Path("lat") String lat);

    //使用@Path注解向请求接口中动态传入经纬度的坐标

    @GET("v2.5/" + SunnyWeatherApplication.TOKEN + "/{lng},{lat}/daily.json")
    //getDailyWeather()方法用于获取未来的天气信息
    Call<DailyResponse> getDailyWeather(@Path("lng") String lng, @Path("lat") String lat);
}

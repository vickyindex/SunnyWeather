package com.sunnyweather.android.logic.network;

import com.sunnyweather.android.SunnyWeatherApplication;
import com.sunnyweather.android.logic.model.PlaceResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

//访问城市
public interface PlaceService {
    //声明@GET注解
    @GET("v2/place?token="+ SunnyWeatherApplication.TOKEN+"&lang=zh_CN")
    //发出GET请求，去访问@GET注解中配置的地址
    Call<PlaceResponse> searchPlaces(@Query("query") String query);
    //将服务器返回的JSON数据自动解析成PlaceResponse对象
}

package com.sunnyweather.android.logic.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//单例类
public  class ServiceCreator {
    private static final String BASE_URL = "https://api.caiyunapp.com/";
    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)  //内部定义了BASE_URL常量,用于指定Retrofit的根路径
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    static public <T> T create(Class<T> serviceClass) {//提供外部create()方法，接受Class类型的参数
        return retrofit.create(serviceClass);
    }
}

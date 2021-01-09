package com.sunnyweather.android.logic.model;

//用于将Realtime和Daily对象封装起来
public class Weather {
    RealtimeResponse.Realtime realtime;
    DailyResponse.Daily daily;

    public RealtimeResponse.Realtime getRealtime() {
        return realtime;
    }

    public void setRealtime(RealtimeResponse.Realtime realtime) {
        this.realtime = realtime;
    }

    public DailyResponse.Daily getDaily() {
        return daily;
    }

    public void setDaily(DailyResponse.Daily daily) {
        this.daily = daily;
    }

    public Weather(RealtimeResponse realtime, DailyResponse daily) {
        this.realtime = realtime.result.realtime;
        this.daily = daily.result.daily;
    }
}

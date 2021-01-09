package com.sunnyweather.android.logic.model;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;

public class DailyResponse {
    public RealtimeResponse.Result result;
    public String status;

    public static class Result {
        public Daily daily;
    }

    public static class Daily {
        public List<Temperature> temperatures;
        public List<Skycon> skycon;
        public Float temperature;
        @SerializedName("lift_index")
        public LifeIndex lifeIndex;
    }

    public static class Temperature{
        public Float max;
        public Float min;
    }

    public static class Skycon{
        public String value;
        public Date date;
    }

    public static class LifeIndex{
        public List<LifeDescription> coldRisk;
        public List<LifeDescription> carwashing;
        public List<LifeDescription> ultraviolet;
        public List<LifeDescription> dressing;
    }

    public static class LifeDescription{
        public String desc;
    }
}

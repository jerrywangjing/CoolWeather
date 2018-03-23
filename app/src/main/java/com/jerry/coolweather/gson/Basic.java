package com.jerry.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jerry on 2018/3/22.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}

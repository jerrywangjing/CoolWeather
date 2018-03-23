package com.jerry.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jerry on 2018/3/22.
 */

public class Forecaste {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}

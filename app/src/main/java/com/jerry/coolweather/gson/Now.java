package com.jerry.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jerry on 2018/3/22.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}

package com.jerry.coolweather;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.telephony.SignalStrength;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.jerry.coolweather.db.City;
import com.jerry.coolweather.db.County;
import com.jerry.coolweather.db.Province;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jerry on 2018/3/19.
 */

public class ChooseAreaFragment extends Fragment {

    public static final int LEVEL_PROVINCE   = 0;
    public static final int LEVEL_CITY = 1;
    public static final int LEVEL_COUNTY = 2;

    private ProgressBar progressBar;
    private TextView titleText;
    private Button backButton;
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> dataList = new ArrayList<>();

    // 省列表
    private List<Province> provinceList;
    // 市列表
    private List<City> cityList;
    // 县列表
    private List<County> countyList;
    // 选中的省份
    private Province selectedProvince;
    // 选中的城市
    private City selectedCity;
    // 当前选中的级别
    private int currentLevel;



}

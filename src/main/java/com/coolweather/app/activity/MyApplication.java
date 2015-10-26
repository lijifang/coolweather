package com.coolweather.app.activity;

import android.app.Application;
import android.content.Context;

/**
 * Created by xiao on 2015/10/23.
 */
public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate(){
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }
}

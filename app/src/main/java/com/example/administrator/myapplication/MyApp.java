package com.example.administrator.myapplication;

import android.app.Application;

/**
 * Created by Administrator on 2016/6/3.
 */
public class MyApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        //收集错误日志
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }
}

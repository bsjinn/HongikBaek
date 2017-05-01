package com.example.sojin.baekproject.main;

/**
 * Created by sojin on 2017-05-01.
 */
import android.app.Application;

import com.sendbird.android.SendBird;

public class BaseApplication extends Application {

    private static final String APP_ID = "90B30FDF-0D2A-4BB6-9A3F-68F0F08DF160"; // US-1 Demo
    public static final String VERSION = "3.0.30";

    @Override
    public void onCreate() {
        super.onCreate();
        SendBird.init(APP_ID, getApplicationContext());
    }
}
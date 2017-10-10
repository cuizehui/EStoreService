package com.example.cuizehui.estoredataservice;

import android.app.Application;

import org.litepal.LitePal;

/**
 * Created by cuizehui on 17-10-9.
 */

public class App extends Application {

    public App() {
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        LitePal.initialize(this);
    }
}

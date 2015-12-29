package com.chriszou.dagger2inaardemo;

import android.app.Application;

import com.chriszou.dagger2inaarlib.DGComponent;

/**
 * Created by xiaochuang on 12/29/15.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DGComponent.init(this);
    }
}

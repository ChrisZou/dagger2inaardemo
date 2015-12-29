package com.chriszou.dagger2inaarlib;

import android.app.Application;

/**
 * Created by xiaochuang on 12/29/15.
 */
public class DGComponent {

    private static AppComponent sComponent;

    public static void init(Application app) {
        sComponent = DaggerAppComponent.builder().appModule(new AppModule(app)).build();
    }

    public static AppComponent getComponent() {
        return sComponent;
    }


}

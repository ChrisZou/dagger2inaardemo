package com.chriszou.dagger2inaarlib;

import android.app.Application;
import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by xiaochuang on 12/11/15.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    Application app();
    void inject(LibActivity activity);
}

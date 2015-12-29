package com.chriszou.dagger2inaarlib;

import android.app.Application;
import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xiaochuang on 12/29/15.
 */
@Module
public class AppModule {
    private Application app;
    public AppModule(Application app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public Application provideApplication() {
        return app;
    }

    @Provides
    @Singleton
    public Resources provideResources() {
        return app.getResources();
    }
}

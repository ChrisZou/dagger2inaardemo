package com.chriszou.dagger2inaarlib;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

/**
 * Created by xiaochuang on 12/29/15.
 */
public class LibActivity extends AppCompatActivity {
    @Inject
    Resources mResources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lib_activity);

        DGComponent.getComponent().inject(this);

        TextView msgView = (TextView) findViewById(R.id.msg);
        msgView.setText(mResources.getString(R.string.a_demo));

    }
}

package com.kcode.github.pubutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.kcode.github.androidlib.utils.Logger;
import com.kcode.github.androidlib.utils.SystemUtil;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logger.i(TAG,"onCreate()");
        SystemUtil.getModle();
    }
}

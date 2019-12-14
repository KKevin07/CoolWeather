package com.coolweather.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

/**
 * Created by MarkDong on 2017/12/29.
 */

public class Welcome extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.welcome);

        Runnable run = new Runnable() {

            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(Welcome.this, MainActivity.class);
                Welcome.this.startActivity(intent);
                Welcome.this.finish();
            }
        };
        Handler handler = new Handler();
        handler.postDelayed(run, 2 * 1000);
    }




}

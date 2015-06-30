package com.fragments.justus.mfarmapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                    Intent next = new Intent(getBaseContext(), InfoPage.class);
                    startActivity(next);
                    finish();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        };

        timer.start();
    }


}

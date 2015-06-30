package com.fragments.justus.mfarmapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class InfoPage extends Activity{
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page);


       image = (ImageView)findViewById(R.id.imageView2);
        image.setOnTouchListener(new OnSwipeListerner(getBaseContext()) {
            @Override
            public void onSwipeLeft() {
                Toast.makeText(InfoPage.this, "we went left", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getBaseContext(),LoginPage.class);
                startActivity(intent);
            }
        });
    }


}

package com.example.cidseuser.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.os.Handler;
import android.content.Intent;


public class MainActivity extends AppCompatActivity
{

    private final int SPLASH_DISPLAY_LENGTH = 3000;
    //ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent i =  new Intent(MainActivity.this, Profile.class);
                startActivity(i);

                finish();

            }
        }, SPLASH_DISPLAY_LENGTH);

    }



}

package com.example.cidseuser.myapplication;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.os.Handler;
import android.content.Intent;


public class MainActivity extends AppCompatActivity
{
    public String myPreference = "myPref";
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
                SharedPreferences myStartScreenPref;
                myStartScreenPref= getSharedPreferences(myPreference, 0);

                boolean setUp = myStartScreenPref.getBoolean("isSetUpDone", false);

                if(setUp)
                {
                    Intent i = new Intent(MainActivity.this, ProfileDisplay.class);
                    startActivity(i);
                }
                else
                {
                    Intent i = new Intent(MainActivity.this, Profile.class);
                    startActivity(i);
                }

                /*if(setUp)
                {
                    Intent i = new Intent(MainActivity.this, ProfileDisplay.class);
                    startActivity(i);
                }
                else
                {
                    Intent i = new Intent(MainActivity.this, CameraForEpic.class);
                    startActivity(i);
                }*/

                finish();

            }
        }, SPLASH_DISPLAY_LENGTH);

    }



}

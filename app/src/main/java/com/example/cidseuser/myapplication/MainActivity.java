package com.example.cidseuser.myapplication;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Handler;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;

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

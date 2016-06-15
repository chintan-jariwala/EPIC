package com.example.cidseuser.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

public class CalmDown extends AppCompatActivity
{
    private Button btnReturn;
    Animation fade_in, fade_out;
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calm_down);
        viewFlipper = (ViewFlipper) this.findViewById(R.id.backgroundViewFlipper1);
        btnReturn = (Button)findViewById(R.id.btnReturn);

        fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        viewFlipper.setInAnimation(fade_in);
        viewFlipper.setInAnimation(fade_out);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(20000);
        viewFlipper.startFlipping();


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnReturn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                Intent intent;
                intent = new Intent(getApplicationContext(), ProfileDisplay.class);
                intent.putExtra("Test", "data...");
                startActivity(intent);
            }
        });
    }







}


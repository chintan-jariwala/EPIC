package com.example.cidseuser.myapplication;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CallHelp extends AppCompatActivity {

    private TextView mTextView;

    // UI References
    public   String myPreference = "myPref";
    private SharedPreferences sharedPreference;

    Activity context = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_help);

        SharedPreferences mSettings = getSharedPreferences(myPreference, 0);
        String familyName = mSettings.getString("etFamilyName", "SPOUSE");
        String familyPhone = mSettings.getString("etFamilyPhone", "PHONE: NULL");

        Button family1Button = (Button)findViewById(R.id.btnFM1);
        family1Button.setText(familyName);


    }
}

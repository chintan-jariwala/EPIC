package com.example.cidseuser.myapplication;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CallHelp extends AppCompatActivity {

    private TextView mTextView;
    private Button btnFM1;
    private Button btnFM2;
    private Button btnFM3;
    private Button btnEmerg;
    public String fPhone1;
    public String fPhone2;
    public String fPhone3;

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
        fPhone1 = mSettings.getString("etFamilyPhone", "PHONE: NULL");
        String name1 = mSettings.getString("etName1", "HELPER 1: NULL");
        String name2 = mSettings.getString("etName2", "HELPER 2: NULL");
        fPhone2 = mSettings.getString("etPhone1", "NO PHONE");
        fPhone3 = mSettings.getString("etPhone2", "NO PHONE");


        Button btnFM1 = (Button) findViewById(R.id.btnFM1);
        btnFM1.setText(familyName);
        Button btnFM2 = (Button) findViewById(R.id.btnFM2);
        btnFM2.setText(name1);
        Button btnFM3 = (Button) findViewById(R.id.btnFM3);
        btnFM3.setText(name2);


        btnFM1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "tel:" + fPhone1;
                Intent intent = new Intent(Intent.ACTION_DIAL , Uri.parse(url));
                //check permission
                startActivity(intent);
            }
        });

        btnFM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "tel:" + fPhone2;
                Intent intent = new Intent(Intent.ACTION_DIAL , Uri.parse(url));
                //check permission
                startActivity(intent);
            }
        });

        btnFM3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "tel:" + fPhone3;
                Intent intent = new Intent(Intent.ACTION_DIAL , Uri.parse(url));
                //check permission
                startActivity(intent);
            }
        });

        btnEmerg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "tel:+911";
                Intent intent = new Intent(Intent.ACTION_DIAL , Uri.parse(url));
                //check permission
                startActivity(intent);
            }
        });
    }


}


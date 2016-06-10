package com.example.cidseuser.myapplication;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ProfileDisplay extends AppCompatActivity {

    private TextView mTextView;
    // UI References
    public   String myPreference = "myPref";
    private SharedPreferences sharedPreference;

    Activity context = this;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.round_activity_profile_display);


        SharedPreferences mSettings = getSharedPreferences(myPreference, 0);
        String name = mSettings.getString("etName", "NAME: NULL");
        String phone = mSettings.getString("etPhone", "PHONE: NULL");
        String address = mSettings.getString("etAddress", "ADDRESS: NULL");
        String city = mSettings.getString("etCity", "CITY: NULL");
        String familyName = mSettings.getString("etFamilyName", "FAMILY: NULL");
        String familyPhone = mSettings.getString("etFamilyPhone", "PHONE: NULL");

        TextView nameTextView = (TextView)findViewById(R.id.tvName);
        nameTextView.setText(name);
        TextView phoneTextView = (TextView)findViewById(R.id.tvPhone);
        phoneTextView.setText(phone);
        TextView addressTextView = (TextView)findViewById(R.id.tvAddress);
        addressTextView.setText(address);
        TextView cityTextView = (TextView)findViewById(R.id.tvCity);
        cityTextView.setText(city);
        TextView familyNameTextView = (TextView)findViewById(R.id.tvFMName);
        familyNameTextView.setText(familyName);
        TextView familyPhoneTextView = (TextView)findViewById(R.id.tvFMPhone);
        familyPhoneTextView.setText(familyPhone);

    }
}

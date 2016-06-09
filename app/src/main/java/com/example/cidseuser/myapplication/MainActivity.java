package com.example.cidseuser.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import android.app.*;
//import android.widget.TextView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{
    SharedPreferences sharedPreferences;
    public   String myPreference = "myPref";
    public   String name = "nameKey";
    public   String phone = "phoneKey";
    public  String address ="addressKey";
    public   String city ="cityKey";
    public   String familyName ="familyNameKey";
    public  String familyPhone ="familyPhoneKey";

    //private TextView;
    private EditText etName;
    private EditText etPhone;
    private EditText etAddress;
    private EditText etCity;
    private EditText etFamilyName;
    private EditText etFamilyPhone;
    private Button btnProfileInfoSubmit;

    private void initializeVariables()
    {
        etName = (EditText) findViewById(R.id.etName);
        etPhone = (EditText) findViewById(R.id.etPhone);
        etAddress = (EditText) findViewById(R.id.etAddress);
        etCity = (EditText) findViewById(R.id.etCity);
        etFamilyName = (EditText)findViewById(R.id.etFamilyName);
        etFamilyPhone = (EditText) findViewById(R.id.etFamilyPhone);
        btnProfileInfoSubmit = (Button) findViewById(R.id.btnProfileInfoSubmit);
    }
    public void onSubmitProfileButton()
    {
        //TextView view;
        //view = setText("Your Profile Info: \n" + etName.getText().toString()+ "\n"+ etPhone.getText().toString());

        name = etName.getText().toString();
        phone = etPhone.getText().toString();
        address = etAddress.getText().toString();
        city = etCity.getText().toString();
        familyName = etFamilyName.getText().toString();
        familyPhone = etFamilyPhone.getText().toString();

        Toast.makeText(this,name,Toast.LENGTH_LONG).show();
        sharedPreferences = getSharedPreferences(myPreference, 0);
        Editor editor = sharedPreferences.edit();
        editor.putString("etName", name);
        editor.putString("etPhone", phone);
        editor.putString("etAddress", address);
        editor.putString("etCity", city);
        editor.putString("etFamilyName", familyName);
        editor.putString("etFamilyPhone", familyPhone);

        editor.commit();



    }

    public void displayProfileData()
    {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initializeVariables();

        btnProfileInfoSubmit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                onSubmitProfileButton();
                etName.setText(null);

            }


        });

    }





}

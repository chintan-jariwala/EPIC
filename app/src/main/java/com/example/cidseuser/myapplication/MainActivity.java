package com.example.cidseuser.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
//import android.widget.TextView;
//import android.app.*;
//import android.widget.TextView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class MainActivity extends AppCompatActivity
{
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

        etName.getText();
        etPhone.getText();
        etAddress.getText();
        etCity.getText();
        etFamilyName.getText();
        etFamilyPhone.getText();

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

            }
        });
    }

    /**
     *
     */
    private void parseJsonFile()
    {
        String jsonString = readJsonFile();

    }



}

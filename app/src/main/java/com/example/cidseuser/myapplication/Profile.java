package com.example.cidseuser.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

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
        SharedPreferences.Editor editor = sharedPreferences.edit();
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
        setContentView(R.layout.activity_profile);

        initializeVariables();

        btnProfileInfoSubmit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                onSubmitProfileButton();
                etName.setText(null);
                etPhone.setText(null);
                etAddress.setText(null);
                etCity.setText(null);
                etFamilyName.setText(null);
                etFamilyPhone.setText(null);

                Intent intent;
                intent = new Intent(getApplicationContext(),ProfileDisplay.class);
                intent.putExtra("Test","data...");
                startActivity(intent);
            }


        });

    }
}

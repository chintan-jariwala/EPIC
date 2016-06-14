package com.example.cidseuser.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FamilyContacts extends AppCompatActivity
{

    SharedPreferences sharedPreferences;
    public String myFamilyPreference = "myFamilyPref";
    public String name1 = "name1Key";
    public String name2 = "name2Key";
    public String phone1 ="phone1Key";
    public String phone2 ="phone2Key";
    public String setupDone = "isSetUpDone";



    private Button btnAdditionalFamilyInfoSubmit;
    //private TextView;
    private EditText etName1;
    private EditText etName2;
    private EditText etPhone1;
    private EditText etPhone2;


    private void initializeVariables()
    {
        etName1 = (EditText) findViewById(R.id.etName1);
        etName2 = (EditText) findViewById(R.id.etName2);
        etPhone1 = (EditText) findViewById(R.id.etPhone1);
        etPhone2 = (EditText) findViewById(R.id.etPhone2);
        btnAdditionalFamilyInfoSubmit = (Button) findViewById(R.id.btnAdditionalFamilyInfoSubmit);

    }

    public void onSubmitFamilyInfoButton()
    {
        name1 = etName1.getText().toString();
        phone1 = etPhone1.getText().toString();
        name2 = etName2.getText().toString();
        phone2 = etPhone2.getText().toString();

        Toast.makeText(this,name1, Toast.LENGTH_LONG).show();
        sharedPreferences = getSharedPreferences(myFamilyPreference, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("etName1", name1);
        editor.putString("etPhone1", phone1);
        editor.putString("etName2", name2);
        editor.putString("etPhone2", phone2);

        //set the value in shared preferences editor
        editor.putBoolean(setupDone, true);

        editor.commit();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_contacts);

        initializeVariables();

        btnAdditionalFamilyInfoSubmit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                onSubmitFamilyInfoButton();
                etName1.setText(null);
                etPhone1.setText(null);
                etName2.setText(null);
                etPhone2.setText(null);



                Intent intent;
                intent =  new Intent(getApplicationContext(), ProfileDisplay.class);
                intent.putExtra("Test", "data...");
                startActivity(intent);

            }


        });



    }
}

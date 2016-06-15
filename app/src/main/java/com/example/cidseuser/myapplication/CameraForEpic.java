package com.example.cidseuser.myapplication;


import android.content.ContentValues;
import android.content.Intent;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.io.File;

import java.io.InputStream;
import java.net.URL;

/**
 * Created by cidseuser on 6/14/2016.
 */
public class CameraForEpic extends AppCompatActivity
{
   // SharedPreferences sharedPreferences;
    //public String myPreference = "myPref";
    //public String isPicDone = "isPicDone";
    //public String perPic = "person Pic";
    private ImageView imageView;

    private static final int CAMERA_REQUEST = 1888;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_for_epic);
        this.imageView = (ImageView)this.findViewById(R.id.imageView2);
    }



    public void buttonOnClick (View v)
    {
        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent, CAMERA_REQUEST);
    }


    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == CAMERA_REQUEST && resultCode == RESULT_OK) {
            Bitmap photo = (Bitmap) intent.getExtras().get("data");
            imageView.setImageBitmap(photo);

            //SharedPreferences shared = getSharedPreferences("App_settings", MODE_PRIVATE);
           // SharedPreferences.Editor editor = shared.edit();
            //editor.putString("PRODUCT_PHOTO",photo );
           // editor.commit();
        }
    }



}

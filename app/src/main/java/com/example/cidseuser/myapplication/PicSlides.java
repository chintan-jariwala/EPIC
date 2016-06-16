package com.example.cidseuser.myapplication;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ViewFlipper;



public class PicSlides extends AppCompatActivity implements MediaPlayer.OnCompletionListener {
    int [] songs;
    MediaPlayer mediaPlayer;
    int current_index = 0;
    Animation fade_in, fade_out;
    ViewFlipper viewFlipper;
    //RelativeLayout calmScreen;
    Button btnReturn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Jaun's part
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_slides);




        //Isaac's part
        viewFlipper = (ViewFlipper) this.findViewById(R.id.backgroundViewFlipper1);

        fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        viewFlipper.setInAnimation(fade_in);
        viewFlipper.setInAnimation(fade_out);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(20000);
        viewFlipper.startFlipping();

        //MediaPlayer song1 = new MediaPlayer(this, R.raw.easylemon30seconds);
        // MediaPlayer song2 = new MediaPlayer(this, R.raw.frimorning);

        // calmScreen = (RelativeLayout) findViewById(R.id.calmScreen);
        //  nextSongButton = (Button) findViewById(R.id.NextSongButton);

        // nextSongButton.setOnClickListener(new View.OnClickListener()
        songs= new int[] {R.raw.medmusic};

        mediaPlayer = MediaPlayer.create(this, songs[0]);

        mediaPlayer.setOnCompletionListener(this);

        mediaPlayer.start();
        // {
        //  @Override
        //   public void onClick(View view)
        // {
        //     song1.stop();
        //     song2.start();
        // else if(song2.isPlaying())
        // song2.stop();
        //  song1.start();

        // }

        btnReturn = (Button)findViewById(R.id.btnReturn);

        btnReturn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                Intent intent;
                intent = new Intent(getApplicationContext(), ProfileDisplay.class);
                intent.putExtra("Test", "data...");
                startActivity(intent);
                mediaPlayer.stop();
            }
        });
    }
    @Override
    public void onCompletion(MediaPlayer mp){
        play();
    }

    private void play() {
        current_index = (current_index + 1) % 4;
        AssetFileDescriptor afd = this.getResources().openRawResourceFd(songs[current_index]);
        mediaPlayer.reset();
        mediaPlayer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}



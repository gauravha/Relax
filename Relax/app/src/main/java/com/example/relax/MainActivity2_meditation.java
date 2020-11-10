package com.example.relax;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity2_meditation extends AppCompatActivity {

    public void om(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.om);
        mediaPlayer.start();

    }
    public void wind(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.wind);
        mediaPlayer.start();

    }
    public void rain(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.rain);
        mediaPlayer.start();

    }
    public void clock(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.clock);
        mediaPlayer.start();

    }
    public void beach(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.beach);
        mediaPlayer.start();

    }
    public void zen(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.zen);
        mediaPlayer.start();

    }
    public void guitar(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.guitar);
        mediaPlayer.start();

    }
    public void piano(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.piano);
        mediaPlayer.start();

    }

    public void fire(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.fire);
        mediaPlayer.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_meditation);
    }
}
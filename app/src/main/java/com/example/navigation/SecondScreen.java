package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class SecondScreen extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    MediaPlayer mediaPlayer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondscreen);

        // Initialize the media player objects
        mediaPlayer = MediaPlayer.create(this, R.raw.audio);
        mediaPlayer1 = MediaPlayer.create(this, R.raw.audio1);
    }

    public void playAudio(View view){
        mediaPlayer.start();
    }

    public void pauseAudio(View view){
        mediaPlayer.pause();
        mediaPlayer1.pause();

    }

    public void nextAudio(View view){
        mediaPlayer1.start();

    }

    public void backAudio(View view){
        mediaPlayer.start();

    }

    @Override
    protected void onDestroy() {
        // Release the media player resources when the activity is destroyed
        mediaPlayer.release();
        mediaPlayer1.release();
        super.onDestroy();
    }
}

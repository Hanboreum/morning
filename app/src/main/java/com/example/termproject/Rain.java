package com.example.termproject;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Rain extends AppCompatActivity {
    MediaPlayer Mplayer;
    TextView stop,play;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(Mplayer != null) {
            Mplayer.release();
            Mplayer = null;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rain);
        setTitle("rainjava");
        play = findViewById(R.id.play);
        stop = findViewById(R.id.stop);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mplayer = MediaPlayer.create(Rain.this, R.raw.srain);
                Mplayer.start();

            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mplayer.stop();
            }
        });
    }
}
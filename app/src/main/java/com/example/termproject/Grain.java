package com.example.termproject;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Grain extends AppCompatActivity {
    TextView play,  stop;
    MediaPlayer Mplayer;

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
        setTitle("Grainjava");
        setContentView(R.layout.grain);
        play = findViewById(R.id.play);
        stop = findViewById(R.id.stop);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mplayer = MediaPlayer.create(Grain.this, R.raw.sfire);
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
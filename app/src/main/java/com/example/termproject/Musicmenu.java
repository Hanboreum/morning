package com.example.termproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Musicmenu extends AppCompatActivity {
    ImageView grain,rain,fire;
    TextView Tmenu, Mmenu,Amenu,TWeather,TTodo,TNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musicmenu);
        setTitle("백색소음MusicMenu");
        grain =  findViewById(R.id.grain);
        fire =  findViewById(R.id.fire);
        rain =  findViewById(R.id.rain);
        Tmenu =  findViewById(R.id.Tmenu);
        Amenu =  findViewById(R.id.Amenu);
        Mmenu =  findViewById(R.id.Mmenu);
        TWeather =  findViewById(R.id.TWeather);
        TTodo =  findViewById(R.id.TTodo);
        TNews =  findViewById(R.id.TNews);


        grain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Grain.class);
                startActivity(intent);
                getIntent();

            }
        });
        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Fire.class);
                startActivity(intent);
                getIntent();

            }
        });
        rain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Rain.class);
                startActivity(intent);
                getIntent();

            }
        });
        Tmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),News.class);
                startActivity(intent);
                getIntent();


            }
        });
        Amenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Main.class);
                startActivity(intent);
                getIntent();


            }
        });
        Mmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),News.class);
                startActivity(intent);
                getIntent();

            }
        });
        

    }
}
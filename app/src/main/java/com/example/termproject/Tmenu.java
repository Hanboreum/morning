package com.example.termproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Tmenu extends AppCompatActivity {
    TextView Mmenu,Amenu,Tmenu,TTdo,TWeather,TNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newslayout);
        setTitle("Tmenu");
        Amenu = findViewById(R.id.Amenu);
        Mmenu = findViewById(R.id.Mmenu);
        Tmenu = findViewById(R.id.Tmenu);
        TTdo = findViewById(R.id.TTdo);
        TWeather =  findViewById(R.id.TWeather);
        TNews =  findViewById(R.id.TNews);


        Amenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Tmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Weather.class);
                startActivity(intent);
                getIntent();

            }
        });

        Mmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Musicmenu.class);
                startActivity(intent);
                getIntent();

            }
        });
        TTdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Todomain.class);
                startActivity(intent);
                getIntent();

            }
        });
    }
}
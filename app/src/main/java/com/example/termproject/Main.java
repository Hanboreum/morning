package com.example.termproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {
    TextView Amenu,Mmenu,Tmenu;
    Button Timebtn;
    //public static Context context;
    //public int var;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setTitle("main");

        Amenu = findViewById(R.id.Amenu);
        Mmenu = findViewById(R.id.Mmenu);
        Tmenu = findViewById(R.id.Tmenu);
        Timebtn = findViewById(R.id.Timebtn);


        Timebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Alarmmain.class);
                startActivity(intent);
                getIntent();

            }
        });


        Amenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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

        Mmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Musicmenu.class);
                startActivity(intent);
                getIntent();

            }
        });


    }
}
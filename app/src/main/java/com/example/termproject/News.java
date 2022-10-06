package com.example.termproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class News extends AppCompatActivity {
    ImageView sbs,kbs,mbc,naver,daum,bbc,cnn,nbc,yahoo;
    TextView TWeaher,TTodo,TNews,Amenu,Mmenu,Tmenu;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newslayout);
        setTitle("news");
        mbc =  findViewById(R.id.mbc);
        kbs =  findViewById(R.id.kbs);
        naver =  findViewById(R.id.naver);
        daum =  findViewById(R.id.daum);
        bbc =  findViewById(R.id.bbc);
        nbc =  findViewById(R.id.nbc);
        cnn =  findViewById(R.id.cnn);
        sbs =  findViewById(R.id.sbs);
        yahoo = findViewById(R.id.yahoo);
        TWeaher = findViewById(R.id.TWeaher);
        TTodo = findViewById(R.id.TTodo);
        TNews = findViewById(R.id.TNews);
        Amenu = findViewById(R.id.Amenu);
        Mmenu = findViewById(R.id.Mmenu);
        Tmenu = findViewById(R.id.Tmenu);



        TWeaher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Weather.class);
                startActivity(intent);
                getIntent();


            }
        });
        TTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Todomain.class);
                startActivity(intent);
                getIntent();


            }
        });

        mbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mbcintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://imnews.imbc.com/pc_main.html"));
                startActivity(Mbcintent);

            }
        });

        kbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Kbsintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://news.kbs.co.kr/common/main.html"));
                startActivity(Kbsintent);

            }
        });
        sbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Sbsintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://news.sbs.co.kr/news/newsMain.do"));
                startActivity(Sbsintent);

            }
        });
        naver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Naverintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://news.naver.com/"));
                startActivity(Naverintent);

            }
        });
        daum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Daumintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://news.daum.net/"));
                startActivity(Daumintent);

            }
        });
        yahoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Yahoointent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://news.yahoo.com/"));
                startActivity(Yahoointent);

            }
        });
        cnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Cnnintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://edition.cnn.com/"));
                startActivity(Cnnintent);

            }
        });
        nbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Nbcintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nbcnews.com/"));
                startActivity(Nbcintent);

            }
        });
        bbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bbcintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bbc.com/news"));
                startActivity(Bbcintent);

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
                Intent intent=new Intent(getApplicationContext(),Musicmenu.class);
                startActivity(intent);
                getIntent();


            }
        });
        Tmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Tmenu.class);
                startActivity(intent);
                getIntent();


            }
        });




    }
}
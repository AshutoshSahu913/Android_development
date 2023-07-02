package com.example.sharequote;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeScreen extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    LinearLayout linearLayout4, linearLayout1, linearLayout2, linearLayout3,linearLayout5,linearLayout6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        getSupportActionBar().hide();
        imageView = findViewById(R.id.author1);
        textView = findViewById(R.id.name1);
        linearLayout1 = findViewById(R.id.linearlayout1);
        linearLayout2 = findViewById(R.id.linearlayout2);
        linearLayout3 = findViewById(R.id.linearlayout3);
        linearLayout4 = findViewById(R.id.linearlayout4);
        linearLayout5=findViewById(R.id.linearlayout5);
        linearLayout6=findViewById(R.id.linearlayout6);

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), QuoteActivity.class);
                intent1.putExtra("cap","Captain America");
                startActivity(intent1);
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), QuoteActivity.class);
                intent2.putExtra("thor","Thor");
                startActivity(intent2);
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuoteActivity.class);
                intent.putExtra("ironman","Iron Man");
                startActivity(intent);
            }
        });
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuoteActivity.class);
                intent.putExtra("hulk", "Hulk");
                startActivity(intent);
            }
        });

        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuoteActivity.class);
                intent.putExtra("widow","Black Widow");
                startActivity(intent);
            }
        });
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuoteActivity.class);
                intent.putExtra("spider","Spider Man");
                startActivity(intent);
            }
        });
    }
}
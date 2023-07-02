package com.example.sharequote;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class QuoteActivity extends AppCompatActivity {

    Button shareBtn;
    TextView quote, name1, name2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_quote_spider);
        quote = findViewById(R.id.quote);
        shareBtn = findViewById(R.id.shareBtn);
        name1 = findViewById(R.id.Name);
        name2 = findViewById(R.id.Name2);
        Intent fromHome = getIntent();
        String capName = fromHome.getStringExtra("cap");
        String thorName = fromHome.getStringExtra("thor");
        String ironName = fromHome.getStringExtra("ironman");
        String hulkName = fromHome.getStringExtra("hulk");
        String widowName = fromHome.getStringExtra("widow");
        String spiderName = fromHome.getStringExtra("spider");

//        name1.setText(CapName, thorName, ironName, hulkName, widowName, spiderName);
        name1.setText(capName);
        name1.setText(thorName);
        name1.setText(ironName);
        name1.setText(hulkName);
        name1.setText(widowName);
        name1.setText(spiderName);

        name2.setText(capName);
        name2.setText(thorName);
        name2.setText(ironName);
        name2.setText(hulkName);
        name2.setText(widowName);
        name2.setText(spiderName);

        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String quotetxt = quote.getText().toString();
                Intent sendIntenet = new Intent();
                sendIntenet.setAction(Intent.ACTION_SEND);
                sendIntenet.setType("text/plain");
                sendIntenet.putExtra(Intent.EXTRA_TEXT, quotetxt);
                startActivity(sendIntenet);
            }
        });

    }
}
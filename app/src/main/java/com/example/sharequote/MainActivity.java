package com.example.sharequote;

import static android.view.animation.AnimationUtils.loadAnimation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView hulk;
    TextView textView;
    Animation upper_animation;
    Animation leftside;
    Animation rightside;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        hulk=findViewById(R.id.hulk);
        textView = findViewById(R.id.txt);

        upper_animation = loadAnimation(this, R.anim.left_to_right);
        hulk.setAnimation(upper_animation);


        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(6000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(MainActivity.this, HomeScreen.class);
                    startActivity(intent);
                }
            }
        };
        thread.start();
    }
}
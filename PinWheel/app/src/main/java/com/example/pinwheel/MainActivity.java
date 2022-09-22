package com.example.pinwheel;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnNumber1,btnNumber2,btnNumber3,btnOff;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNumber1 = findViewById(R.id.buttonNumber1);
        btnNumber2 = findViewById(R.id.buttonNumber2);
        btnNumber3 = findViewById(R.id.buttonNumber3);
        btnOff = findViewById(R.id.buttonOff);
        imageView = findViewById(R.id.imageView);

        btnNumber1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                imageView.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.drawable.xoay1));
            }
        });

        btnNumber2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                imageView.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.drawable.xoay2));
            }
        });

        btnNumber3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                imageView.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.drawable.xoay3));
            }
        });

        btnOff.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                imageView.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.drawable.off));
            }
        });
    }
}
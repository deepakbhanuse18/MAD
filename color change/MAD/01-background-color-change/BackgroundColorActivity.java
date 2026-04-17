package com.example.appdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class BackgroundColorActivity extends AppCompatActivity {

    private View canvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background_color);

        canvas = findViewById(R.id.colorCanvas);

        findViewById(R.id.btnCoral).setOnClickListener(v -> canvas.setBackgroundColor(Color.parseColor("#FF6B6B")));
        findViewById(R.id.btnMint).setOnClickListener(v -> canvas.setBackgroundColor(Color.parseColor("#4ECDC4")));
        findViewById(R.id.btnSky).setOnClickListener(v -> canvas.setBackgroundColor(Color.parseColor("#6C8EFA")));
    }
}

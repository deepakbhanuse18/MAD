package com.example.temp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText e1 = findViewById(R.id.e1);
        EditText e2 = findViewById(R.id.e2);

        findViewById(R.id.btn_login).setOnClickListener(v -> {
            String username = e1.getText().toString().trim();
            String password = e2.getText().toString().trim();

            if (username.equalsIgnoreCase("deepak") && password.equals("1234")) {
                Intent i = getPackageManager().getLaunchIntentForPackage("com.example.temp1");
                if (i != null) {
                    startActivity(i);
                    finish();
                } else {
                    Toast.makeText(this, "Temp1 App Not Found", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
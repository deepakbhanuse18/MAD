package com.example.gridlayout;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView cell1, cell2, cell3, cell4, cell5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Handle system bars insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize TextViews
        cell1 = findViewById(R.id.cell1);
        cell2 = findViewById(R.id.cell2);
        cell3 = findViewById(R.id.cell3);
        cell4 = findViewById(R.id.cell4);
        cell5 = findViewById(R.id.cell5);

        // Example: Set click listeners
        setupClickListeners();
    }

    private void setupClickListeners() {
        cell1.setOnClickListener(v -> showToast("Clicked: " + cell1.getText()));
        cell2.setOnClickListener(v -> showToast("Clicked: " + cell2.getText()));
        cell3.setOnClickListener(v -> showToast("Clicked: " + cell3.getText()));
        cell4.setOnClickListener(v -> showToast("Clicked: " + cell4.getText()));
        cell5.setOnClickListener(v -> showToast("Clicked: " + cell5.getText()));
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
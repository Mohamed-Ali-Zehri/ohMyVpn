package com.example.ohmyvpn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example to handle window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Find the ImageButton by its ID and set an OnClickListener
        ImageButton settingsButton = findViewById(R.id.settingsButton);
        settingsButton.setOnClickListener(this::goSettings);
    }

    public void goSettings(View v) {
        // Start Setting_Activity when the button is pressed
        Intent intent = new Intent(MainActivity.this, Setting_Activity.class);
        startActivity(intent);
    }
}

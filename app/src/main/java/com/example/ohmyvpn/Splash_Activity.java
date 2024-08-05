package com.example.ohmyvpn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Splash_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Find the button by its ID and set an OnClickListener
        Button getStartedButton = findViewById(R.id.get_started_button);
        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start MainActivity when the button is pressed
                Intent intent = new Intent(Splash_Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

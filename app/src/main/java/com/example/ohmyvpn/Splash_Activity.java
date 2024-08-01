package com.example.ohmyvpn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Splash_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Find the "Get Started" button by its ID
        Button getStartedButton = findViewById(R.id.get_started_button);

        // Set up the click listener for the button
        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the main activity when the button is clicked
                Intent intent = new Intent(Splash_Activity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Finish this activity to prevent the user from returning to it
            }
        });
    }
}

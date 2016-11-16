package com.example.adrian.homeworkonetwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by adrian on 11/16/16.
 */
public class SettingsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        setupButton();

    }


    private void setupButton() {
        // 1. Create a reference to the button
        Button messageButton = (Button) findViewById(R.id.button2);

        // 2. Set the click listener to run my code

        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent homePage = new Intent(SettingsActivity.this, MainActivity.class);
                startActivity(homePage);
            }
        });
    }
}
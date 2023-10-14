package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class home extends AppCompatActivity {

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intentLength =new Intent(this, length.class);
        Intent intentTemp =new Intent(this, temp.class);
        Intent intentArea =new Intent(this, area.class);
        Intent intentVolume =new Intent(this, volume.class);
        Intent intentWeight =new Intent(this, weight.class);
        Intent intentTime =new Intent(this, time.class);


        imageButton = findViewById(R.id.imageButtonLength);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentLength);
            }
        });

        imageButton = findViewById(R.id.imageButtonTemp);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentTemp);
            }
        });

        imageButton = findViewById(R.id.imageButtonArea);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentArea);
            }
        });

        imageButton = findViewById(R.id.imageButtonVolume);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentVolume);
            }
        });

        imageButton = findViewById(R.id.imageButtonWeight);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentWeight);
            }
        });

        imageButton = findViewById(R.id.imageButtonTime);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentTime);
            }
        });


    }
}
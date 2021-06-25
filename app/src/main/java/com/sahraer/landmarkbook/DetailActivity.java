package com.sahraer.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ImageView imageView = findViewById(R.id.imageView);
        TextView landmarkName = findViewById(R.id.landmarkName2);
        TextView locationName = findViewById(R.id.address);

        Intent intent = getIntent();
        String landmarksName = intent.getStringExtra("name");
        String locationNames = intent.getStringExtra("location");
        landmarkName.setText(landmarksName);
        locationName.setText(locationNames);

        Singleton singleton = Singleton.getInstance();
        imageView.setImageBitmap(singleton.getChosenImage());


    }
}
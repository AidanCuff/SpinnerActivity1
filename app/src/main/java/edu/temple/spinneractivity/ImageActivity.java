package edu.temple.spinneractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String names [] = {"penny", "dime", "nickel","quarter"};

        int img [] = {R.drawable.penny,R.drawable.dime,R.drawable.quarter,R.drawable.nickel};

        Spinner coinSpinner = findViewById(R.id.spinner_coins);

        ImageAdapter coinAdapter = new ImageAdapter(this,names,img);

        coinSpinner.setAdapter(coinAdapter);

    }
}
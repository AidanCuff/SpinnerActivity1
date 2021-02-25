package edu.temple.spinneractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ImageActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String names [] = {"penny", "dime", "nickel","quarter"};

    int img [] = {R.drawable.penny,R.drawable.dime,R.drawable.quarter,R.drawable.nickel};

    ImageView image = findViewById(R.id.imageView2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner coinSpinner = findViewById(R.id.spinner_coins);

        ImageAdapter coinAdapter = new ImageAdapter(this,names,img);

        coinSpinner.setAdapter(coinAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        image.setImageResource(img[position]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
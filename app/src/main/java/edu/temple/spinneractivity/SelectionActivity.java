package edu.temple.spinneractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class SelectionActivity extends AppCompatActivity{

    String names [] = {"Select One!","penny", "dime", "nickel","quarter"};

    int img [] = {R.drawable.transparent,R.drawable.penny,R.drawable.dime,R.drawable.nickel,R.drawable.quarter};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner coinSpinner = findViewById(R.id.spinner_coins);

        ImageAdapter coinAdapter = new ImageAdapter(this,names,img);

        coinSpinner.setAdapter(coinAdapter);

        coinSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position!=0) {
                    Intent intent = new Intent(SelectionActivity.this, DisplayActivity.class);
                    intent.putExtra("title", names[position]);
                    intent.putExtra("image", img[position]);
                    startActivity(intent);
                    coinSpinner.setSelection(0);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
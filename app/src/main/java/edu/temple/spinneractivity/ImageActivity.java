package edu.temple.spinneractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;

public class ImageActivity extends AppCompatActivity {
    private ArrayList<CoinItem> list;
    private ImageAdapter coinAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add(new CoinItem("Penny", R.drawable.penny));
        list.add(new CoinItem("Dime", R.drawable.dime));
        list.add(new CoinItem("Nickel", R.drawable.nickel));
        list.add(new CoinItem("quarter", R.drawable.quarter));

        Spinner coinSpinner = findViewById(R.id.spinner_coins);

        coinAdapter = new ImageAdapter(this,list);

        coinSpinner.setAdapter(coinAdapter);

        coinSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CoinItem clicked = (CoinItem) parent.getItemAtPosition(position);
                ImageView image = findViewById(R.id.imageView2);
                image.setImageResource(clicked.getCoinImg());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
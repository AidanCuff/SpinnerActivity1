package edu.temple.gridactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Spinner;

public class SelectionActivity extends AppCompatActivity{

    String names [] = {"penny", "dime", "nickel","quarter"};

    int img [] = {R.drawable.penny,R.drawable.dime,R.drawable.nickel,R.drawable.quarter};

    GridView grid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("GridActivity");

        CustomGrid gridAdapter = new CustomGrid(SelectionActivity.this,names,img);

        grid = (GridView) findViewById(R.id.grid);
        grid.setAdapter(gridAdapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SelectionActivity.this, DisplayActivity.class);
                intent.putExtra("title", names[position]);
                intent.putExtra("image", img[position]);
                startActivity(intent);
            }
        });

    }
}
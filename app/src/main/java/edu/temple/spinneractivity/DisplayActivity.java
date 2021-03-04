package edu.temple.spinneractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();

        ImageView image = (ImageView) findViewById(R.id.imageView);

        TextView title = (TextView) findViewById(R.id.titleText);

        String text = intent.getStringExtra("title");

        int photo =  intent.getIntExtra("image",R.drawable.transparent);

        title.setText(text);
        image.setImageResource(photo);
    }
}
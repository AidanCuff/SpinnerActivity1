package edu.temple.spinneractivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter {
    private Context context;
    private String [] names;
    private int [] img;
    LayoutInflater layoutInflater;

    public ImageAdapter(Context context, String[] names, int[] img) {
        this.context = context;
        this.names = names;
        this.img = img;
        this.layoutInflater = layoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.coin_spinner_layout,null);
        ImageView imges = convertView.findViewById(R.id.image_view_coin);
        TextView name = convertView.findViewById(R.id.text_view_name);
        imges.setImageResource(img[position]);
        name.setText(names[position]);
        return convertView;
    }
}

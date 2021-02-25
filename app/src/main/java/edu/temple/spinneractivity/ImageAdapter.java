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

public class ImageAdapter extends ArrayAdapter<CoinItem> {

    public ImageAdapter(Context context, ArrayList<CoinItem> coinList){
        super(context,0,coinList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent){
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.coin_spinner_layout,parent,false
            );
        }
        ImageView imageViewCoin = convertView.findViewById(R.id.image_view_coin);
        TextView textViewName = convertView.findViewById(R.id.text_view_name);
        CoinItem current = (CoinItem) getItem(position);
        if(current!=null) {
            imageViewCoin.setImageResource(current.getCoinImg());
            textViewName.setText(current.getCoinName());
        }
        return convertView;
    }
}

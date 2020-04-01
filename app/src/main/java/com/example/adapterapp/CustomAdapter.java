package com.example.adapterapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Animal> {
    public CustomAdapter(Context context, ArrayList<Animal> jivotni){
        super(context,0,jivotni);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Animal animal1 = getItem(position);
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout,parent,false);
        }

        ImageView img = convertView.findViewById(R.id.image);
        TextView txt = convertView.findViewById(R.id.view);

        img.setImageDrawable(animal1.getImage());
        txt.setText(animal1.getName());
        return convertView;
    }
}

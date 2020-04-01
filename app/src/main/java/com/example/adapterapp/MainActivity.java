package com.example.adapterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.list);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal(getResources().getDrawable(R.drawable.cat),"kotka"));
        animals.add(new Animal(getResources().getDrawable(R.drawable.dog),"kuche"));

        CustomAdapter adapter = new CustomAdapter(this,animals);
        view.setAdapter(adapter);
    }
}

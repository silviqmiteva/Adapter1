package com.example.adapterapp;

import android.graphics.drawable.Drawable;

public class Animal {
    private Drawable image;
    private String name;

    public Animal(Drawable image, String name) {
        this.image = image;
        this.name = name;
    }

    public Drawable getImage() {
        return image;
    }

    public String getName() {
        return name;
    }
}

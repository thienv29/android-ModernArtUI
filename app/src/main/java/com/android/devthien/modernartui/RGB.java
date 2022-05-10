package com.android.devthien.modernartui;

import android.graphics.Color;

public class RGB {
    private int red;
    private int green;
    private int blue;

    public RGB(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public RGB() {
    }
    public RGB(String a) {
        int colorA = Color.parseColor( "#" +a);
        red = Color.red(colorA);
        green = Color.green(colorA);
        blue = Color.blue(colorA);
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
}

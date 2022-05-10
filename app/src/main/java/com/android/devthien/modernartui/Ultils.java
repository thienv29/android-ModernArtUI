package com.android.devthien.modernartui;

import android.graphics.Color;
import android.widget.Toast;

public class Ultils {
    static RGB getPercentColor(String a, String b) {
        int colorA = Color.parseColor( "#" +a);
        int redA = Color.red(colorA);
        int greenA = Color.green(colorA);
        int blueA = Color.blue(colorA);

        int colorB = Color.parseColor("#" +b);
        int redB = Color.red(colorB);
        int greenB = Color.green(colorB);
        int blueB = Color.blue(colorB);

        int percentRed = (redB - redA)/100;
        int percentGreen = (greenB - greenA)/100;
        int percentBlue = (blueB - blueA)/100;


        return new RGB(percentRed, percentGreen, percentBlue);
    }
}

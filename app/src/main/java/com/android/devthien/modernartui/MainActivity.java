package com.android.devthien.modernartui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //        //Todo
//        6a77b7 rgb(106, 119, 183) to ffffb7 rgb(255, 255, 183)
//        d64f97 rgb(214, 79, 151) to ffe597 rgb(255, 229, 151)
//        a31d21 rgb(163, 29, 33) to ffb321 rgb(255, 179, 33)
//        e6e6e6 rgb(230, 230, 230) to e6e6e6 rgb(230, 230, 230)
//        273a97 rgb(39, 58, 151) to bdd097 rgb(189, 208, 151)

    static final RGB RGBBox1 = new RGB("6a77b7");
    static final RGB RGBBox2 = new RGB("d64f97");
    static final RGB RGBBox3 = new RGB("a31d21");
    static final RGB RGBBox4 = new RGB("e6e6e6");
    static final RGB RGBBox5 = new RGB("273a97");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.show_dialog){
            CustomDialog cdd=new CustomDialog(MainActivity.this);
            cdd.show();
        }
        return super.onOptionsItemSelected(item);
    }

    private void init(){

        SeekBar seekBar = findViewById(R.id.seekBar);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                handleColorValue(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void handleColorValue(int percent){
        LinearLayout box1 = findViewById(R.id.box1);
        LinearLayout box2 = findViewById(R.id.box2);
        LinearLayout box3 = findViewById(R.id.box3);
        LinearLayout box4 = findViewById(R.id.box4);
        LinearLayout box5 = findViewById(R.id.box5);

        RGB boxPercent1 = Ultils.getPercentColor("6a77b7", "ffffb7");
        RGB boxPercent2 = Ultils.getPercentColor("d64f97", "ffe597");
        RGB boxPercent3 = Ultils.getPercentColor("a31d21", "ffb321");
        RGB boxPercent4 = Ultils.getPercentColor("e6e6e6", "e6e6e6");
        RGB boxPercent5 = Ultils.getPercentColor("273a97", "bdd097");


        int bcolor1 = Color.rgb(RGBBox1.getRed() + boxPercent1.getRed()*percent,RGBBox1.getGreen() + boxPercent1.getGreen()*percent,RGBBox1.getBlue() + boxPercent1.getBlue()*percent);
        int bcolor2 = Color.rgb(RGBBox2.getRed() + boxPercent2.getRed()*percent,RGBBox2.getGreen() + boxPercent2.getGreen()*percent,RGBBox2.getBlue() + boxPercent2.getBlue()*percent);
        int bcolor3 = Color.rgb(RGBBox3.getRed() + boxPercent3.getRed()*percent,RGBBox3.getGreen() + boxPercent3.getGreen()*percent,RGBBox3.getBlue() + boxPercent3.getBlue()*percent);
        int bcolor4 = Color.rgb(RGBBox4.getRed() + boxPercent4.getRed()*percent,RGBBox4.getGreen() + boxPercent4.getGreen()*percent,RGBBox4.getBlue() + boxPercent4.getBlue()*percent);
        int bcolor5 = Color.rgb(RGBBox5.getRed() + boxPercent5.getRed()*percent,RGBBox5.getGreen() + boxPercent5.getGreen()*percent,RGBBox5.getBlue() + boxPercent5.getBlue()*percent);

        box1.setBackgroundColor(bcolor1);
        box2.setBackgroundColor(bcolor2);
        box3.setBackgroundColor(bcolor3);
        box4.setBackgroundColor(bcolor4);
        box5.setBackgroundColor(bcolor5);
    }


}
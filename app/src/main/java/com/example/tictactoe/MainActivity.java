package com.example.tictactoe;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
public ImageView img00,img01,img02,img10,img11,img12,img20,img21,img22;
int player = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img00 = findViewById(R.id.img00);
        img01 = findViewById(R.id.img01);
        img02 = findViewById(R.id.img02);
        img10= findViewById(R.id.img10);
        img11 = findViewById(R.id.img11);
        img12 = findViewById(R.id.img12);
        img20 = findViewById(R.id.img20);
        img21 = findViewById(R.id.img21);
        img22 = findViewById(R.id.img22);
    }

    public void handleChange(View view){
        ImageView img = (ImageView) view;
        Drawable db = img.getDrawable();
        if((player == 1)&&(db == null)){
                img.setImageResource(R.drawable.ximg);
                player = 2;
        }else if((player == 2)&&(db == null)){
            img.setImageResource(R.drawable.oimg);
            player = 1;
        }
    }

    public void reset(View view){
        img00.setImageResource(0);
        img01.setImageResource(0);
        img02.setImageResource(0);
        img10.setImageResource(0);
        img11.setImageResource(0);
        img12.setImageResource(0);
        img20.setImageResource(0);
        img21.setImageResource(0);
        img22.setImageResource(0);
    }

}

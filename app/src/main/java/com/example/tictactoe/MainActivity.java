package com.example.tictactoe;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

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
        //imageRef = findViewById(R.id.imageRef);
    }

    public void handleChange(View view){
        ImageView img = (ImageView) view;
        final Bitmap map = ((BitmapDrawable)img.getDrawable()).getBitmap();
        Drawable myDrawable = getResources().getDrawable(R.drawable.blank);
        final Bitmap myLogo = ((BitmapDrawable) myDrawable).getBitmap();
        // Drawable db = img.getDrawable();
        // if((player == 1)&&(img.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.blank)))){
            if(map.sameAs(myLogo)&&(player == 1)){
                img.setImageResource(R.drawable.ximg);
                player = 2;
        }else if(map.sameAs(myLogo)&&(player == 2)){
            img.setImageResource(R.drawable.oimg);
            player = 1;
        }
        ifWon();
    }

    public void won(ImageView img){
        final Bitmap map = ((BitmapDrawable)img.getDrawable()).getBitmap();
        Drawable xii = getResources().getDrawable(R.drawable.ximg);
        Drawable ohm = getResources().getDrawable(R.drawable.ximg);
        final Bitmap xmyLogo = ((BitmapDrawable) xii).getBitmap();
        final Bitmap omyLogo = ((BitmapDrawable) ohm).getBitmap();
        if (map.sameAs(xmyLogo)) {
            Toast.makeText(this," Player 1 WON ",Toast.LENGTH_SHORT).show();
            player = 0;
        } else if (map.sameAs(omyLogo)) {
            Toast.makeText(this," Player 2 WON ",Toast.LENGTH_SHORT).show();
            player = 0;
        }
    }

    public void ifWon(){
        if(img00.getDrawable().equals(img01.getDrawable())&&img00.getDrawable().equals(img02.getDrawable()))
        {
            won(img00);
        }
        if(img00.getDrawable().equals(img10.getDrawable())&&img00.getDrawable().equals(img20.getDrawable()))
        {
            won(img00);
        }
        if(img00.getDrawable().equals(img11.getDrawable())&&img00.getDrawable().equals(img22.getDrawable()))
        {
            won(img00);
        }
        if(img11.getDrawable().equals(img01.getDrawable())&&img11.getDrawable().equals(img21.getDrawable()))
        {
            won(img01);
        }
        if(img02.getDrawable().equals(img12.getDrawable())&&img22.getDrawable().equals(img02.getDrawable()))
        {
            won(img02);
        }
        if(img10.getDrawable().equals(img11.getDrawable())&&img10.getDrawable().equals(img12.getDrawable()))
        {
            won(img10);
        }
        if(img20.getDrawable().equals(img21.getDrawable())&&img20.getDrawable().equals(img22.getDrawable()))
        {
            won(img20);
        }
        if(img02.getDrawable().equals(img11.getDrawable())&&img20.getDrawable().equals(img02.getDrawable()))
        {
            won(img20);
        }
    }

    public void reset(View view){
        img00.setImageResource(R.drawable.blank);
        img01.setImageResource(R.drawable.blank);
        img02.setImageResource(R.drawable.blank);
        img10.setImageResource(R.drawable.blank);
        img11.setImageResource(R.drawable.blank);
        img12.setImageResource(R.drawable.blank);
        img20.setImageResource(R.drawable.blank);
        img21.setImageResource(R.drawable.blank);
        img22.setImageResource(R.drawable.blank);
        player = 1;
    }

}

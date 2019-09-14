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
                ifWon();
        }else if(map.sameAs(myLogo)&&(player == 2)){
            img.setImageResource(R.drawable.oimg);
            player = 1;
            ifWon();
        }
    }

    public void won(View view){
        ImageView img = (ImageView) view;
        final Bitmap map = ((BitmapDrawable)img.getDrawable()).getBitmap();
        Drawable xii = getResources().getDrawable(R.drawable.ximg);
        Drawable ohm = getResources().getDrawable(R.drawable.ximg);
        final Bitmap xmyLogo = ((BitmapDrawable) xii).getBitmap();
        final Bitmap omyLogo = ((BitmapDrawable) ohm).getBitmap();
        if (map.sameAs(xmyLogo)) {
            Toast.makeText(this," Player 1 WON ",Toast.LENGTH_SHORT).show();
            player = 0;
        }
        if (map.sameAs(omyLogo)) {
            Toast.makeText(this," Player 2 WON ",Toast.LENGTH_SHORT).show();
            player = 0;
        }
    }

    public void ifWon(){

        final Bitmap image00 = ((BitmapDrawable) img00.getDrawable()).getBitmap();
        final Bitmap image01 = ((BitmapDrawable) img01.getDrawable()).getBitmap();
        final Bitmap image02 = ((BitmapDrawable) img02.getDrawable()).getBitmap();
        final Bitmap image10 = ((BitmapDrawable) img10.getDrawable()).getBitmap();
        final Bitmap image11 = ((BitmapDrawable) img11.getDrawable()).getBitmap();
        final Bitmap image12 = ((BitmapDrawable) img12.getDrawable()).getBitmap();
        final Bitmap image20 = ((BitmapDrawable) img20.getDrawable()).getBitmap();
        final Bitmap image21 = ((BitmapDrawable) img21.getDrawable()).getBitmap();
        final Bitmap image22 = ((BitmapDrawable) img22.getDrawable()).getBitmap();

        if(image00.sameAs(image01)&&image00.sameAs(image02))
        {
            won(img00);
        }
        if(image00.sameAs(image10)&&image00.sameAs(image20))
        {
            won(img00);
        }
        if(image00.sameAs(image11)&&image00.sameAs(image22))
        {
            won(img00);
        }
        if(image11.sameAs(image01)&&image11.sameAs(image21))
        {
            won(img01);
        }
        if(image02.sameAs(image12)&&image22.sameAs(image02))
        {
            won(img02);
        }
        if(image10.sameAs(image11)&&image10.sameAs(image12))
        {
            won(img10);
        }
        if(image20.sameAs(image21)&&image20.sameAs(image22))
        {
            won(img20);
        }
        if(image02.sameAs(image11)&&image20.sameAs(image02))
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

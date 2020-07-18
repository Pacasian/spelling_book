package com.example.spellingbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

import static com.example.spellingbook.alphabets2screen.eachWord;
import static com.example.spellingbook.alphabets2screen.wordImage;

public class eachAlphabet extends AppCompatActivity {
TextView txt;
ImageView imgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_each_alphabet);

        // Calling the Position from previous Page

        int Pos= Integer.parseInt(Objects.requireNonNull(getIntent().getExtras()).getString("position"));
        txt=findViewById(R.id.txt_alpha);
        imgView=findViewById(R.id.imageView);
        //set the image and text from the previous activity 
        String alpha =eachWord[Pos].toUpperCase();
        txt.setText(alpha);
        imgView.setImageResource(wordImage[Pos]);
    }
}
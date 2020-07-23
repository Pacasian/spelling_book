package com.example.spellingbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.Objects;

import static com.example.spellingbook.alphabets2screen.eachWord;
import static com.example.spellingbook.alphabets2screen.wordImage;

public class eachAlphabet extends AppCompatActivity {
TextView txt,txtPlay;
ImageView imgView,imageViewPlay;
    TextToSpeech t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_each_alphabet);

        // Calling the Position from previous Page

        int Pos= Integer.parseInt(Objects.requireNonNull(getIntent().getExtras()).getString("position"));
        txt=findViewById(R.id.txt_alpha);
        imgView=findViewById(R.id.imageView);
        //set the image and text from the previous activity 
        final String alpha =eachWord[Pos].toUpperCase();
        txt.setText(alpha);
        imgView.setImageResource(wordImage[Pos]);
        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.UK);
                }
            }
        });
        txtPlay=findViewById(R.id.txtPlay);
        txtPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPlay.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_pause_24, 0, 0, 0);
                t1.speak(alpha, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        txtPlay.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow_24, 0, 0, 0);
    }
}
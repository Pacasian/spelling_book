package com.example.spellingbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class numbers extends AppCompatActivity {
GridView grill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        int[] numbers=new int[100];
        String[] wordNumbers=new String[100];
        String st="seventy seven";
        for(int i=0;i<100;i++){
            numbers[i]=i+1;
            wordNumbers[i]=st;
        }

        grill=findViewById(R.id.gridview);

        number_Adapter numberAdapter= new number_Adapter(numbers.this,numbers,wordNumbers);
        grill.setAdapter(numberAdapter);

    }
}
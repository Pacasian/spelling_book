package com.example.spellingbook;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class secondscreen extends AppCompatActivity {
    GridView grill;
    String[] numberword = {"Alphabets", "Numbers", "Family", "Body Parts", "Fruits", "Vegetables", "Wild Animals", "Domestic Animals", "Birds", "Insects",
            "Flowers", "Colour", "Maths", "Shapes", "Vehicles"};
    int[] numberimage = {
            R.drawable.abc,
            R.drawable.number,
            R.drawable.family,
            R.drawable.body,
            R.drawable.fruits,
            R.drawable.veg,
            R.drawable.lion,
            R.drawable.cow,
            R.drawable.bird,
            R.drawable.insects,
            R.drawable.flower,
            R.drawable.color,
            R.drawable.mathss,
            R.drawable.hexagon, R.drawable.vechicle};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_secondscreen);

        grill = findViewById(R.id.gridview);
        mainAdapter adapter = new mainAdapter(secondscreen.this, numberword, numberimage);
        grill.setAdapter(adapter);


        grill.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You Clicked" + numberword[+position],
                        Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    startActivity(new Intent(secondscreen.this, alphabets2screen.class));
                }
            }
        });

    }
}
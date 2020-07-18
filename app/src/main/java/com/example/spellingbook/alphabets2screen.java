
package com.example.spellingbook;


        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.GridView;
        import android.widget.Toast;

public class alphabets2screen extends AppCompatActivity {
    GridView grill;

    /**
     * Make the eacHWord and wordImage as Globally available by initialising it as PUBLIC STATIC
     */

     public static String[] eachWord={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"};
    public static int[] wordImage={
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
            R.drawable.k,
            R.drawable.l,
            R.drawable.m,
            R.drawable.n,
            R.drawable.o,
            R.drawable.p,
            R.drawable.q,
            R.drawable.r,
            R.drawable.s,
            R.drawable.t,
            R.drawable.u,
            R.drawable.v,
            R.drawable.w,
            R.drawable.x,
            R.drawable.y,
            R.drawable.z};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets2screen);

        grill=findViewById(R.id.gridview);
        mainAdapter adapter= new mainAdapter(alphabets2screen.this,eachWord,wordImage);
        grill.setAdapter(adapter);



        grill.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You Clicked "+eachWord[+position],
                        Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(alphabets2screen.this,eachAlphabet.class);

                // Pass the position value to next page....
                intent.putExtra("position",position+"");
                startActivity(intent);
            }
        });

    }
}
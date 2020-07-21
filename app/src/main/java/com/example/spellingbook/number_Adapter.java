package com.example.spellingbook;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class number_Adapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private  int[] number;
    private  String[] wordNumber;

    public number_Adapter(Context c, int[]number, String[]wordNumber){
        context=c;
        this.number=number;
        this.wordNumber=wordNumber;

    }
    @Override
    public int getCount() {
        return number.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater==null){
            inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView ==null){
            convertView=inflater.inflate(R.layout.row_item_for_numbers,null);
        }


        TextView t1=convertView.findViewById(R.id.txt1);
        TextView t2= convertView.findViewById(R.id.txt2);
        t1.setText(number[position]+"");
        t2.setText(wordNumber[position]);
        return convertView;
    }
}

package com.example.spellingbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class mainAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private  String[] numberword;
    private  int[] numberimage;

    public mainAdapter(Context c,String[] numberword,int[]numberimage){
        context=c;
        this.numberword=numberword;
        this.numberimage=numberimage;

    }
    @Override
    public int getCount() {
        return numberword.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater==null){
            inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView ==null){
            convertView=inflater.inflate(R.layout.row_item,null);
        }


        ImageView imageView=convertView.findViewById(R.id.image_view);
        TextView text= convertView.findViewById(R.id.text_view);
        imageView.setImageResource(numberimage[position]);
        text.setText(numberword[position]);
        return convertView;
    }
}

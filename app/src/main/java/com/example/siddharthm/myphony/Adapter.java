package com.example.siddharthm.myphony;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends ArrayAdapter<String> {
    String[] num = {};
    String[] name = {};
    int[] img = {};
    Context c;
    LayoutInflater inflater;
    public Adapter(@NonNull Context context, String[] num,String[] name, int[] img) {
        super(context, R.layout.model,num);
        this.c = context;
        this.num = num;
        this.img = img;
        this.name = name;

    }

    public class ViewHolder{
        TextView numtv;
        TextView nametv;
        ImageView imgi;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            inflater =  (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.model,null);
        }
        final ViewHolder holder = new ViewHolder();
        holder.numtv = (TextView)convertView.findViewById(R.id.textView3);
        holder.imgi = (ImageView)convertView.findViewById(R.id.imageView2);
        holder.nametv = (TextView)convertView.findViewById(R.id.textView9);

        holder.imgi.setImageResource(img[position]);
        holder.numtv.setText(num[position]);
        holder.nametv.setText(name[position]);

        return convertView;
    }
}
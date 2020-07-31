package com.example.mycustomview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class MyAdapter extends ArrayAdapter<String> {

    String[] names;
    int flags[];
    Context context;


    public MyAdapter( Context context, String[] countryNames, int[] countryFlags)
    {
        super(context, R.layout.list_view);
        this.names = countryNames;
        this.flags = countryFlags;
        this.context = context;

    }
    @Override
    public int getCount() {
        return names.length;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.list_view, parent,false);
        ImageView viewflag = (ImageView) convertView.findViewById(R.id.imageView);
        TextView viewnames = (TextView) convertView.findViewById(R.id.textView);

        viewflag.setImageResource(flags[position]);
        viewnames.setText(names[position]);

        return convertView;
    }


}

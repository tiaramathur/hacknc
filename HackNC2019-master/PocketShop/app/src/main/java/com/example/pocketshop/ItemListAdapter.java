package com.example.pocketshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class ItemListAdapter extends ArrayAdapter<Item> {
    private Context c;
    int r;
    public ItemListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Item> objects) {
        super(context, resource, objects);
        this.c = App.getContext();
        this.r = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        String id = getItem(position).getName();
        String unitsSold = getItem(position).getUnitsSold();
        String percentChange = getItem(position).getPercentChange();
        String description = getItem(position).getDescription();

        Item it = new Item(id,unitsSold,percentChange,description);
        LayoutInflater inf = LayoutInflater.from(c);
        convertView = inf.inflate(r, parent, false);

        TextView t1 = (TextView) convertView.findViewById(R.id.textView1);
        TextView t2 = (TextView) convertView.findViewById(R.id.textView2);
        TextView t3 = (TextView) convertView.findViewById(R.id.textView3);
        TextView t4 = (TextView) convertView.findViewById(R.id.textView4);

        t1.setText(id);
        t2.setText(unitsSold);
        t3.setText(percentChange);
        t4.setText(description);

        return convertView;
    }
}

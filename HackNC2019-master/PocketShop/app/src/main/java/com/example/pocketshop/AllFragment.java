package com.example.pocketshop;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AllFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_all, container, false);

        ListView m = view.findViewById(R.id.listView);
        ArrayList<Item> b = AllFragment.readCsv();

        ItemListAdapter ad = new ItemListAdapter(App.getContext(), R.layout.adapter_listview_layout, b);
        m.setAdapter(ad);

        return inflater.inflate(R.layout.fragment_all, container, false);
    }


    public static ArrayList<Item> readCsv () {
        ArrayList<Item> result = new ArrayList<Item>();
        Resources res = App.getContext().getResources();
        InputStream f = res.openRawResource(R.raw.data);
        BufferedReader br = new BufferedReader(new InputStreamReader(f));
        String s1, s2, s3, s4;
        for (int i = 0; i < 50; i++) {
                try {
                    String[] values = br.readLine().split(",");
                    s1 = values[0];
                    s2 = values[1];
                    s3 = values[2];
                    s4 = values[3] + ", " + values[4] + ", " + values[5] + ", " + values[6];
                    Item a = new Item(s1, s2, s3, s4);
                    result.add(a);
                } catch (java.io.IOException e) {
                    System.out.println("Read error!");
                }
        }

        return result;
    }
}

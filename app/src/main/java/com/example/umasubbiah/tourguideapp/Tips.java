package com.example.umasubbiah.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by umasubbiah on 25/08/17.
 */

public class Tips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);


        final ArrayList<Entry> tips = new ArrayList<Entry>();
        tips.add(new Entry(getResources().getString(R.string.tip1)));
        tips.add(new Entry(getResources().getString(R.string.tip2)));
        tips.add(new Entry(getResources().getString(R.string.tip3)));
        tips.add(new Entry(getResources().getString(R.string.tip4)));
        tips.add(new Entry(getResources().getString(R.string.tip5)));
        tips.add(new Entry(getResources().getString(R.string.tip6)));
        tips.add(new Entry(getResources().getString(R.string.tip7)));
        tips.add(new Entry(getResources().getString(R.string.tip8)));


        EntryAdapter adapter = new EntryAdapter(this, tips, R.color.brown);

        ListView listview = (ListView) findViewById(R.id.list);

        listview.setAdapter(adapter);
    }
}


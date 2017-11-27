package com.example.umasubbiah.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by umasubbiah on 25/08/17.
 */

public class ImpInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);


        final ArrayList<Entry> info = new ArrayList<Entry>();
        info.add(new Entry(getResources().getString(R.string.info1)));
        info.add(new Entry(getResources().getString(R.string.info2)));
        info.add(new Entry(getResources().getString(R.string.info3)));
        info.add(new Entry(getResources().getString(R.string.info4)));
        info.add(new Entry(getResources().getString(R.string.info5)));
        info.add(new Entry(getResources().getString(R.string.info6)));
        info.add(new Entry(getResources().getString(R.string.info7)));
        info.add(new Entry(getResources().getString(R.string.info8)));

        EntryAdapter adapter = new EntryAdapter(this, info, R.color.yellow);

        ListView listview = (ListView) findViewById(R.id.list);

        listview.setAdapter(adapter);
    }
}


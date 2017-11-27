package com.example.umasubbiah.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by umasubbiah on 25/08/17.
 */

public class Things_to_do extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);


        final ArrayList<Entry> todo = new ArrayList<Entry>();
        todo.add(new Entry(getString(R.string.change1), getResources().getString(R.string.thing4), 0));
        todo.add(new Entry(getString(R.string.change2), getResources().getString(R.string.thing1), 0));
        todo.add(new Entry(getString(R.string.change3), getResources().getString(R.string.thing2), 0));
        todo.add(new Entry(getString(R.string.change4), getResources().getString(R.string.thing3), 0));


        EntryAdapter adapter = new EntryAdapter(this, todo, R.color.lilac);

        ListView listview = (ListView) findViewById(R.id.list);

        listview.setAdapter(adapter);
    }
}


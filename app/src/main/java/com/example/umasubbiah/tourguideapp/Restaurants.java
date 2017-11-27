package com.example.umasubbiah.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by umasubbiah on 25/08/17.
 */

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);


        final ArrayList<Entry> eat = new ArrayList<Entry>();
        eat.add(new Entry(getString(R.string.ar), getResources().getString(R.string.eat1), R.drawable.vege));
        eat.add(new Entry(getString(R.string.mar), getResources().getString(R.string.eat2), R.drawable.nonvegicon));
        eat.add(new Entry(getString(R.string.spice), getResources().getString(R.string.eat3), R.drawable.vege));
        eat.add(new Entry(getString(R.string.tfe), getResources().getString(R.string.eat4), R.drawable.vege));
        eat.add(new Entry(getString(R.string.br), getResources().getString(R.string.eat5), R.drawable.nonvegicon));


        EntryAdapter adapter = new EntryAdapter(this, eat, R.color.green);

        ListView listview = (ListView) findViewById(R.id.list);

        listview.setAdapter(adapter);
    }
}


package com.example.umasubbiah.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by umasubbiah on 25/08/17.
 */

public class Places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);


        final ArrayList<Entry> places = new ArrayList<Entry>();
        places.add(new Entry(getString(R.string.beach), getString(R.string.marina), getResources().getString(R.string.place1), R.drawable.beach, R.drawable.ic_forward));
        places.add(new Entry(getString(R.string.park), getString(R.string.guindy_np), getResources().getString(R.string.place2), R.drawable.guindy, R.drawable.ic_forward));
        places.add(new Entry(getString(R.string.hindu_temple), getString(R.string.kt), getResources().getString(R.string.place3), R.drawable.temple, R.drawable.ic_forward));
        places.add(new Entry(getString(R.string.m_n_c), getString(R.string.fsg), getResources().getString(R.string.place4), R.drawable.fort, R.drawable.ic_forward));
        places.add(new Entry(getString(R.string.astro), getString(R.string.bp), getResources().getString(R.string.place5), R.drawable.planet, R.drawable.ic_forward));


        EntryAdapter adapter = new EntryAdapter(this, places, R.color.pink);

        ListView listview = (ListView) findViewById(R.id.list);


        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {
                Entry place = places.get(position);
                Intent intent = new Intent(Places.this, PlaceDetail.class);
                intent.putExtra("name", place.getName());
                intent.putExtra("desc", place.getSplDesc());
                intent.putExtra("img", place.getmImageResourceId());
                startActivity(intent);
            }
        });
    }
}


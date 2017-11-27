package com.example.umasubbiah.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView places_to_see = (TextView) findViewById(R.id.places_to_see);

        places_to_see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Places.class);
                startActivity(intent);
            }
        });

        TextView things_to_do = (TextView) findViewById(R.id.things_to_do);

        things_to_do.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Things_to_do.class);
                startActivity(intent);
            }
        });

        TextView restaurant = (TextView) findViewById(R.id.restaurant);

        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Restaurants.class);
                startActivity(intent);
            }
        });

        TextView tips = (TextView) findViewById(R.id.tips);

        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tips.class);
                startActivity(intent);
            }
        });

        TextView imp_info = (TextView) findViewById(R.id.imp_info);

        imp_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImpInfo.class);
                startActivity(intent);
            }
        });

    }
}

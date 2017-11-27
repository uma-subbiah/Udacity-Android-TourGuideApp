package com.example.umasubbiah.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceDetail extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.place_detail);

        String mName = getIntent().getExtras().getString("name");
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(mName);

        String mDesc = getIntent().getExtras().getString("desc");
        TextView desc = (TextView) findViewById(R.id.desc);
        desc.setText(mDesc);

        int ImgRes = getIntent().getExtras().getInt("img");
        ImageView img = (ImageView) findViewById(R.id.image);
        img.setImageResource(ImgRes);


    }
}
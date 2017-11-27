package com.example.umasubbiah.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by umasubbiah on 30/06/17.
 */


public class EntryAdapter extends ArrayAdapter<Entry> {

    private int mColorResourceId;


    public EntryAdapter(Activity context, ArrayList<Entry> words, int ColorResourceId) {
        super(context, 0, words);
        mColorResourceId = ColorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Entry currentEntry = getItem(position);

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentEntry.getName());


        TextView shortDesc = (TextView) listItemView.findViewById(R.id.short_desc);
        shortDesc.setText(currentEntry.getShortDesc());

        TextView longDesc = (TextView) listItemView.findViewById(R.id.long_desc);


        ImageView image = (ImageView) listItemView.findViewById(R.id.image);

        ImageView icon = (ImageView) listItemView.findViewById(R.id.icon);

        View textPart = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textPart.setBackgroundColor(color);


        if (currentEntry.hasLong()) {
            longDesc.setText(currentEntry.getLongDesc());
            longDesc.setVisibility(View.VISIBLE);
        } else {
            longDesc.setVisibility(View.GONE);
        }

        if (currentEntry.hasImage()) {
            image.setImageResource(currentEntry.getmImageResourceId());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }

        if (currentEntry.getIcon() == 0) {
            icon.setVisibility(View.GONE);

        } else {
            icon.setImageResource(currentEntry.getIcon());
            icon.setVisibility(View.VISIBLE);
        }
        return listItemView;
    }
}


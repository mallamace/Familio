package com.mallamace.famlio;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TrackAdapter extends ArrayAdapter<Track> {


    public TrackAdapter(Activity context, ArrayList<Track> trackFlavors) {
        super(context, 0, trackFlavors);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.category_item, parent, false);
        }

        if (position % 2 == 1) {
            listItemView.setBackgroundColor(getContext().getTheme().getResources().getColor(R.color.listColorFirst));
        } else {
            listItemView.setBackgroundColor(getContext().getTheme().getResources().getColor(R.color.listColorSecond));
        }

        Track currentTrackFlavor = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.audioTitle);
        nameTextView.setText(currentTrackFlavor.getTrackTitleName());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.audioFile);
        numberTextView.setText(currentTrackFlavor.getTrackFileName());


//        TextView categoryItem = (TextView) findViewById(R.id.categoryItem);
//        categoryItem.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent categoryIntent = new Intent(MainActivity.this, TrackActivity.class);
//                categoryIntent.putExtra("catKeyName",2);
//                startActivity(categoryIntent);
//            }
//        });

        return listItemView;
    }

}

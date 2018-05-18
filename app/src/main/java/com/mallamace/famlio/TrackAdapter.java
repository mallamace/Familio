package com.mallamace.famlio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class TrackAdapter extends ArrayAdapter<Track> {

    private Context context;
    private String currentTrackTitle = "";
    private String currentTrackFile = "";

    /**
     *
     * @param context track context being passed in
     * @param trackListVals list of track values being passed in to custom ArrayList Adapter
     */
    public TrackAdapter(Activity context, ArrayList<Track> trackListVals) {
        super(context, 0, trackListVals);
        this.context = context;
    }

    /**
     *
     * @param position tracking the position for each list item
     * @param convertView get view for each list item
     * @param parent track parent view group
     * @return
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.category_item, parent, false);
        }

        if (position % 2 == 1) {
            listItemView.setBackgroundColor(context.getTheme().getResources().getColor(R.color.listColorFirst));
        } else {
            listItemView.setBackgroundColor(context.getTheme().getResources().getColor(R.color.listColorSecond));
        }

        Track currentTrackFlavor = getItem(position);

        currentTrackTitle = currentTrackFlavor.getTrackTitleName();
        currentTrackFile = currentTrackFlavor.getTrackFileName();

        TextView nameTextView = listItemView.findViewById(R.id.audioTitle);
        nameTextView.setText(currentTrackFlavor.getTrackTitleName());

        TextView numberTextView = listItemView.findViewById(R.id.audioFile);
        numberTextView.setText(currentTrackFlavor.getTrackFileName());

        LinearLayout categoryItem = listItemView.findViewById(R.id.categoryItem);
        categoryItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent categoryIntent = new Intent(context, TrackActivity.class);

                    categoryIntent.putExtra("trackTitle",currentTrackTitle);
                    categoryIntent.putExtra("trackFile",currentTrackFile);
                    getContext().startActivity(categoryIntent);
            }
        });

        return listItemView;
    }
}

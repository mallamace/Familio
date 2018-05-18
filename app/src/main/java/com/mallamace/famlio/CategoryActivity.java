package com.mallamace.famlio;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {

    private int data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list); // set the layout assigned

        data = getIntent().getExtras().getInt("keyName");
        String categoryName = "";

        switch (data){ // determine from getExtras() "keyName" which category values we should use.
            case 0: categoryName = getString(R.string.valueGrand); break;
            case 1: categoryName = getString(R.string.valueAsh); break;
            case 2: categoryName = getString(R.string.valueNate); break;
            case 3: categoryName = getString(R.string.valueRand); break;
            case 4: categoryName = getString(R.string.valueDiBene); break;
        }

        ArrayList<Track> trackList = new ArrayList<Track>();

        for(int i = 0; i<10; i++){ //create a list of tracks
            trackList.add(new Track(getString(R.string.trackTitleName, i), getString(R.string.trackFileName, categoryName)));
        }

        TrackAdapter itemsAdapter = new TrackAdapter(this, trackList);
        ListView listView = findViewById(R.id.catList);

        listView.setAdapter(itemsAdapter);
    }
}

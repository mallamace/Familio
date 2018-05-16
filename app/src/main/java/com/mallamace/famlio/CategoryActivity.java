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

        ActionBar actionBar = getSupportActionBar();  // allows for in-app back button navigation
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        setContentView(R.layout.category_list); // set the layout assigned

        data = getIntent().getExtras().getInt("keyName");
        String categoryName = "";

        switch (data){ // determine from getExtras() "keyName" which category values we should use.
            case 0: categoryName = "grandfather"; break;
            case 1: categoryName = "ashlynn"; break;
            case 2: categoryName = "nate"; break;
            case 3: categoryName = "random"; break;
            case 4: categoryName = "dibene"; break;
        }

        ArrayList<Track> trackList = new ArrayList<Track>();

        for(int i = 0; i<10; i++){ //create a list of tracks
            trackList.add(new Track("Track Title "+i, "file-"+categoryName+i+".mp3"));
        }

        TrackAdapter itemsAdapter = new TrackAdapter(this, trackList);
        ListView listView = findViewById(R.id.catList);

        listView.setAdapter(itemsAdapter);
    }

    /**
     * You need this method to link back to previous activity when Up Menu arrow selected.
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

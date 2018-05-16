package com.mallamace.famlio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {


    private int data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.category_list);

            data = getIntent().getExtras().getInt("keyName");

        String categoryName = "";

        switch (data){

            case 0: categoryName = "grandfather"; break;
            case 1: categoryName = "ashlynn"; break;
            case 2: categoryName = "nate"; break;
            case 3: categoryName = "random"; break;
            case 4: categoryName = "dibene"; break;
        }

        ArrayList<Track> trackList = new ArrayList<Track>();
        //create a list of tracks
        for(int i = 0; i<10; i++){
            trackList.add(new Track("Track Title "+i, "file-"+categoryName+i+".mp3"));
        }

        TrackAdapter itemsAdapter = new TrackAdapter(this, trackList);
        ListView listView = (ListView) findViewById(R.id.catList);

        listView.setAdapter(itemsAdapter);
    }
}

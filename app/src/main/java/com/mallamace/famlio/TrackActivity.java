package com.mallamace.famlio;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TrackActivity extends AppCompatActivity {

    boolean playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.track_detail);

        ActionBar actionBar = getSupportActionBar(); // allows for in-app back button navigation
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        String TrackNameVal = getIntent().getExtras().getString("trackTitle");

        TextView trackName = findViewById(R.id.trackTitle);
        trackName.setText(TrackNameVal);

        String TrackFileVal = getIntent().getExtras().getString("trackFile");

        TextView trackFile = findViewById(R.id.trackFile);
        trackFile.setText(TrackFileVal);
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

    /**
     * Toggle the play button
     * @param v
     */
    void togglePlay(View v){

        ImageView playButton = findViewById(R.id.playButtonId);
        if(playing){ playing = false; playButton.setImageResource(R.drawable.pausebutton);} else {playing = true; playButton.setImageResource(R.drawable.playbutton);}
    }
}

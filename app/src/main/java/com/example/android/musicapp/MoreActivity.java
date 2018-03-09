package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        TextView playnow=(TextView) findViewById(R.id.music_play_button);
        playnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playnowIntent = new Intent(MoreActivity.this, PlayingnowActivity.class);
                startActivity(playnowIntent);
            }
        });

        TextView fav=(TextView) findViewById(R.id.musiclib_fav_button);

        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favIntent = new Intent(MoreActivity.this,FavActivity.class);
                startActivity(favIntent);
            }
        });
    }
}

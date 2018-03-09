package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlayingnowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playingnow);

        TextView musiclib=(TextView) findViewById(R.id.more);

        musiclib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musiclibIntent = new Intent(PlayingnowActivity.this,MoreActivity.class);
                startActivity(musiclibIntent);
            }
        });

        TextView fav=(TextView) findViewById(R.id.fav);
                fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favIntent = new Intent(PlayingnowActivity.this,FavActivity.class);
                startActivity(favIntent);
            }
        });
    }
}

package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView playnow=(TextView) findViewById(R.id.playnow);

        playnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playnowIntent = new Intent(MainActivity.this,PlayingnowActivity.class);
                startActivity(playnowIntent);
            }
        });
        TextView musiclib=(TextView) findViewById(R.id.more);

        musiclib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musiclibIntent = new Intent(MainActivity.this,MoreActivity.class);
                startActivity(musiclibIntent);
            }
        });
        TextView fav=(TextView) findViewById(R.id.fav);

        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favIntent = new Intent(MainActivity.this,FavActivity.class);
                startActivity(favIntent);
            }
        });

        TextView payment=(TextView) findViewById(R.id.payment);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(MainActivity.this,paymentActivity.class);
                startActivity(paymentIntent);
            }
        });

    }
}

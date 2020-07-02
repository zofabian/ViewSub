package com.example.viewsub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView spotifyimg;
    TextView spotifytxt;
    Button spotifybtn;
    Button psnbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotifyimg = (ImageView) findViewById(R.id.spotifyimg);
        spotifytxt = (TextView) findViewById(R.id.spotifytxt);
        spotifybtn = (Button) findViewById(R.id.spotifybtn);

        spotifybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AddActivity =  new Intent(getApplicationContext(), AddActivity.class);
                startActivity(AddActivity);
            }
        });

    }


}
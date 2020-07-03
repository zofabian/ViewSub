package com.example.viewsub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView spotifyimg, psnimg, netfliximg, adobeimg;
    TextView spotifytxt, psntxt, netflixtxt, adobetxt, paydatetxt, amounttxt, paydate, amount;
    Button spotifybtn, psnbtn, netflixbtn, adobebtn;
    String date, charge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotifyimg = (ImageView) findViewById(R.id.spotifyimg);
        psnimg = (ImageView) findViewById(R.id.spotifyimg);
        netfliximg = (ImageView) findViewById(R.id.psnimg);
        adobeimg = (ImageView) findViewById(R.id.adobeimg);
        spotifytxt = (TextView) findViewById(R.id.spotifytxt);
        psntxt = (TextView) findViewById(R.id.psntxt);
        netflixtxt = (TextView) findViewById(R.id.netflixtxt);
        adobetxt= (TextView) findViewById(R.id.adobetxt);
        spotifybtn = (Button) findViewById(R.id.spotifybtn);
        psnbtn = (Button) findViewById(R.id.psnbtn);
        netflixbtn = (Button) findViewById(R.id.netflixbtn);
        adobebtn = (Button) findViewById(R.id.adobebtn);
        paydatetxt = (TextView) findViewById(R.id.paydatetxt);
        paydate = (TextView) findViewById(R.id.paydate);
        amounttxt = (TextView) findViewById(R.id.amounttxt);
        amount = (TextView) findViewById(R.id.amount);

        amount.setText("-");

        spotifybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string = spotifytxt.getText().toString();
                Intent AddActivity =  new Intent(getApplicationContext(), AddActivity.class);
                Intent intent = AddActivity.putExtra("name", string);
                startActivity(AddActivity);
            }
        });

        Intent intent = getIntent();
        date = intent.getStringExtra("date");
        paydate.setText(date);
        charge = intent.getStringExtra("charge");
        amount.setText(charge);

        if(intent.getStringExtra("date")==null) {
            paydate.setText("-");
        }
        if(intent.getStringExtra("charge")==null){
            amount.setText("-");
        }



    }


}
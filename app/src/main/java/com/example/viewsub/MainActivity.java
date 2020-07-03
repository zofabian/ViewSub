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
    TextView spotifytxt, psntxt, netflixtxt, adobetxt, paydatetxt, paydatetxt2, paydatetxt3, paydatetxt4, amounttxt, amountxt2, amountxt3,amountxt4, paydate, paydate2, paydate3, paydate4, amount, amount2, amount3, amount4;
    Button spotifybtn, psnbtn, netflixbtn, adobebtn;
    String date, date2, date3, date4, charge, charge2, charge3, charge4, string, string2, string3, string4;

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
        adobetxt = (TextView) findViewById(R.id.adobetxt);
        spotifybtn = (Button) findViewById(R.id.spotifybtn);
        psnbtn = (Button) findViewById(R.id.psnbtn);
        netflixbtn = (Button) findViewById(R.id.netflixbtn);
        adobebtn = (Button) findViewById(R.id.adobebtn);
        paydatetxt = (TextView) findViewById(R.id.paydatetxt);
        paydatetxt = (TextView) findViewById(R.id.paydatetxt2);
        paydatetxt = (TextView) findViewById(R.id.paydatetxt3);
        paydatetxt = (TextView) findViewById(R.id.paydatetxt4);
        paydate = (TextView) findViewById(R.id.paydate);
        paydate = (TextView) findViewById(R.id.paydate2);
        paydate = (TextView) findViewById(R.id.paydate3);
        paydate = (TextView) findViewById(R.id.paydate4);
        amounttxt = (TextView) findViewById(R.id.amounttxt);
        amounttxt = (TextView) findViewById(R.id.amounttxt2);
        amounttxt = (TextView) findViewById(R.id.amounttxt3);
        amounttxt = (TextView) findViewById(R.id.amounttxt4);
        amount = (TextView) findViewById(R.id.amount);
        amount = (TextView) findViewById(R.id.amount2);
        amount = (TextView) findViewById(R.id.amount3);
        amount = (TextView) findViewById(R.id.amount4);

        spotifybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = spotifytxt.getText().toString();
                Intent AddActivity = new Intent(getApplicationContext(), AddActivity.class);
                Intent intent = AddActivity.putExtra("name", string);
                startActivity(AddActivity);
                }
        });
        
        Intent intent = getIntent();
        date = intent.getStringExtra("date");
        paydate.setText(date);
        charge = intent.getStringExtra("charge");
        amount.setText(charge);
        if (intent.getStringExtra("date") == null) {
            paydate.setText("-");
        }
        if (intent.getStringExtra("charge") == null) {
            amount.setText("-");
        }

    }
}
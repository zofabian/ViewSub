package com.example.viewsub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class AddActivity extends AppCompatActivity {

    TextView datetxt, chargetxt, nametxt;
    EditText date, charge;
    ImageView iconimg;
    Button cancelbtn, addbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        cancelbtn = (Button) findViewById(R.id.cancelbtn);
        addbtn = (Button) findViewById(R.id.addbtn);
        nametxt = (TextView) findViewById(R.id.nametxt);
        iconimg = (ImageView) findViewById(R.id.iconimg);
        datetxt = (TextView) findViewById(R.id.datetxt2);
        datetxt = (EditText) findViewById(R.id.date);
        datetxt = (TextView) findViewById(R.id.chargetxt);
        datetxt = (EditText) findViewById(R.id.charge);

        cancelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity =  new Intent(getApplicationContext(), MainActivity.class);
                startActivity(MainActivity);
            }
        });
    }
}
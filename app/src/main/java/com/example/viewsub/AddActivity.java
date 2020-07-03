package com.example.viewsub;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class AddActivity extends AppCompatActivity {

    TextView datetxt, chargetxt, nametxt;
    EditText date, charge;
    ImageButton cancelbtn;
    Button addbtn;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        cancelbtn = (ImageButton) findViewById(R.id.cancelbtn);
        addbtn = (Button) findViewById(R.id.addbtn);
        nametxt = (TextView) findViewById(R.id.nametxt);
        datetxt = (TextView) findViewById(R.id.datetxt2);
        date = (EditText) findViewById(R.id.date);
        chargetxt = (TextView) findViewById(R.id.chargetxt);
        charge = (EditText) findViewById(R.id.charge);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        nametxt.setText(name);

       cancelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity =  new Intent(getApplicationContext(), MainActivity.class);
                startActivity(MainActivity);
            }
        });

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if(date.getText().toString()!= "" || charge.getText().toString()!="") {
                    AlertDialog.Builder alert = new AlertDialog.Builder(AddActivity.this);
                    alert.setCancelable(false);
                    alert.setTitle("Missing Information");
                    alert.setMessage("Please add the missing Information");

                    alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
                    alert.show();
                }*/
                /*else{*/
                    Intent MainActivity = new Intent(getApplicationContext(), MainActivity.class);
                    MainActivity.putExtra("date", date.getText().toString());
                    MainActivity.putExtra("charge", charge.getText().toString());
                    startActivity(MainActivity);
                /*}*/
            }
        });
    }
}
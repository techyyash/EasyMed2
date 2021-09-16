package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import java.util.logging.Handler;

public class home extends AppCompatActivity implements View.OnClickListener{

    public CardView card1,card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //hide the title
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //hide the action bar
        getSupportActionBar().hide();




        setContentView(R.layout.activity_home);


        card1 = (CardView) findViewById(R.id.doctor_card);
        card2 = (CardView) findViewById(R.id.patient_card);


        card1.setOnClickListener(this);
        card2.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()){

            case R.id.doctor_card:
                i = new Intent(this,login_hospital.class);
                startActivity(i);
                break;

            case R.id.patient_card:
                i = new Intent(this,login_patient.class);
                startActivity(i);
                break;




        }

    }
}
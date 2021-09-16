package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class hospital_home extends AppCompatActivity implements View.OnClickListener{

    public CardView card1, card2,card3,card4,card5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //hide the title
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //hide the action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_hospital_home);


        card1 = (CardView) findViewById(R.id.profile_hospital_card);
        card2 = (CardView) findViewById(R.id.database_hospital_card);
        card3 = (CardView) findViewById(R.id.qrcode_hospital_card);
        card4 = (CardView) findViewById(R.id.pharmacy_hospital_card);
        card5 = (CardView) findViewById(R.id.stats_hospital_card);


        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()){

            case R.id.profile_hospital_card:
                i = new Intent(this,hospital_profile.class);
                startActivity(i);
                break;

            case R.id.database_hospital_card:
                i = new Intent(this,hospital_database_connection.class);
                startActivity(i);
                break;

            case R.id.qrcode_hospital_card:
                i = new Intent(this,hospital_Qrcode_view.class);
                startActivity(i);
                break;

            case R.id.pharmacy_hospital_card:
                i = new Intent(this,hospital_pharmacy.class);
                startActivity(i);
                break;

            case R.id.stats_hospital_card:
                i = new Intent(this,hospital_stats.class);
                startActivity(i);
                break;

    }
}
}
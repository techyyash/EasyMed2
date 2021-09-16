package com.example.easymed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class patient_home extends AppCompatActivity implements View.OnClickListener{

    public CardView card1, card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //hide the title
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //hide the action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_patient_home);

        card1 = (CardView) findViewById(R.id.profile_patient_card);
        card2 = (CardView) findViewById(R.id.family_patient_card);



        card1.setOnClickListener(this);
        card2.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()){

            case R.id.profile_patient_card:
                i = new Intent(this,patient_profile.class);
                startActivity(i);
                break;


            case R.id.family_patient_card:
                i = new Intent(this,patient_include_family.class);
                startActivity(i);
                break;


        }
}
}
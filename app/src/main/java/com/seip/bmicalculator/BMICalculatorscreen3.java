package com.seip.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class BMICalculatorscreen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculatorscreen3);

           Intent intent = getIntent();
//        final String weight = intent.getStringExtra("weight");
//        final String height = intent.getStringExtra("height");
      //  Toast.makeText(BMICalculatorscreen3.this, weight + "+age+" + height, Toast.LENGTH_SHORT).show();
    }

}
package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View v){
        EditText principal = (EditText)findViewById(R.id.principalInput);
        EditText addition = (EditText)findViewById(R.id.annualInput);
        EditText rate = (EditText)findViewById(R.id.returnInput);
        EditText year = (EditText)findViewById(R.id.yearsInput);

        float current = Float.valueOf(principal.getText().toString());
        float annual = Float.valueOf(addition.getText().toString());
        float yearlyRate = Float.valueOf(rate.getText().toString());
        float yearsOfInvestment = Float.valueOf(year.getText().toString());

        RetirementCalculator userSavings = new RetirementCalculator(current, annual, yearlyRate, yearsOfInvestment);

        int total = userSavings.calculateRetirement();

        TextView displayTotal = (TextView)findViewById(R.id.totalOutput);
        displayTotal.setText(total+"");
    }
}

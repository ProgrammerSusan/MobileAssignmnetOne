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
        EditText [] inputs = {principal, addition, rate, year};
        TextView displayTotal = (TextView)findViewById(R.id.totalOutput);

        RetirementCalculator userSavings = new RetirementCalculator();

        int total = userSavings.retirement(inputs);
        displayTotal.setText(total+"");
    }
}

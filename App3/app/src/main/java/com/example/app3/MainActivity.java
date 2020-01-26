package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
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

        float [] values = new float[4];

        //goes through EditTexts and parses to float
        //sets boolean to prevent retirement calculation on error
        //sets background color to red for incorrect inputs
        boolean valid = true;
        for(int i = 0; i < inputs.length; i++){
            try{
                values[i] = Float.parseFloat(inputs[i].getText().toString());
                inputs[i].setBackgroundColor(Color.parseColor("#E0E4E3"));
            }
            catch(Exception e){
                inputs[i].setBackgroundColor(Color.RED);
                valid = false;
            }
        }
        RetirementCalculator userSavings = new RetirementCalculator();
        if(valid){
            float current = values[0];
            float annual = values[1];
            float returnRate = values[2];
            float numYears = values[3];

            int total = userSavings.calculateRetirement(current, annual, returnRate, numYears);
            displayTotal.setText(total+"");
        }
        else {
            displayTotal.setText("Invalid");
        }

    }
}

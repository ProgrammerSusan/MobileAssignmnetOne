package com.example.app3;
import android.graphics.Color;
import android.widget.*;

import java.lang.Math;

public class RetirementCalculator {

    public int retirement(EditText[] inputs){
        float [] input = validate(inputs);
        if(input.length == 1){
            return 0;
        }
        else {
            float principal = input[0];
            float addition = input[1];
            float rate = input[2];
            float year = input[3];
            return calculateRetirement(principal, addition, rate, year);
        }
    }

    public float [] validate(EditText[] inputs){
        float [] values = new float[inputs.length];
        float [] invalid = {0};
        for(int i = 0; i < inputs.length; i++){
            try{
                values[i] = Float.parseFloat(inputs[i].getText().toString());
                inputs[i].setBackgroundColor(Color.parseColor("#E0E4E3"));
            }
            catch(Exception e){
                inputs[i].setBackgroundColor(Color.RED);
                invalid[0] = -1;
            }
        }
        if(invalid[0] == -1){
            return invalid;
        }
        else{
            return values;
        }
    }

    public int calculateRetirement(float currentPrincipal, float annualAddition, float rate,  float years){
        float retirement = (currentPrincipal + 100 * annualAddition/rate) * (float)Math.pow(1 + rate/100, years) - 100 * annualAddition/rate;
        return Math.round(retirement);
    }
}

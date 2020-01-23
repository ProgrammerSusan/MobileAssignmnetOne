package com.example.app3;
import android.graphics.Color;
import android.widget.*;

import java.lang.Math;

public class RetirementCalculator {

    public RetirementCalculator(){ }

    public int calculateRetirement(float currentPrincipal, float annualAddition, float rate,  float years){
        float retirement = (currentPrincipal + 100 * annualAddition/rate) * (float)Math.pow(1 + rate/100, years) - 100 * annualAddition/rate;
        return Math.round(retirement);
    }
}

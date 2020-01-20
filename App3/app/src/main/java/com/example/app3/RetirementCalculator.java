package com.example.app3;
import java.lang.Math;

public class RetirementCalculator {
    private float currentPrincipal;
    private float annualAddition;
    private float rate;
    private float years;

    public RetirementCalculator(float currentPrincipal, float annualAddition, float rate,  float years){
        this.currentPrincipal = currentPrincipal;
        this.annualAddition = annualAddition;
        this.rate = rate;
        this.years = years;
    }

    public float calculateRetirement(){
        return (currentPrincipal + 100 * annualAddition/rate) * (float)Math.pow(1 + rate/100, years)
                - 100 * annualAddition/rate;
    }
}

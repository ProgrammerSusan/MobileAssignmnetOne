package com.example.app4;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View v)
    {
        EditText credits = (EditText)findViewById(R.id.creditsInput);
        RadioButton undergrad = (RadioButton)findViewById(R.id.undergrad);
        RadioButton graduate = (RadioButton)findViewById(R.id.grad);
        RadioButton nodeg = (RadioButton)findViewById(R.id.nodeg);
        RadioButton instate = (RadioButton)findViewById(R.id.inState);
        RadioButton outstate = (RadioButton)findViewById(R.id.outState);
        CheckBox dorm = (CheckBox)findViewById(R.id.dormBox);
        CheckBox dining = (CheckBox)findViewById(R.id.diningBox);
        CheckBox parking = (CheckBox)findViewById(R.id.parkBox);

        int cred = Integer.parseInt(credits.getText().toString());
        Boolean ug = undergrad.isChecked();
        Boolean grad = graduate.isChecked();
        Boolean ndeg = nodeg.isChecked();
        Boolean in = instate.isChecked();
        Boolean out = outstate.isChecked();
        Boolean drm = dorm.isChecked();
        Boolean dine = dining.isChecked();
        Boolean park = parking.isChecked();

        int tuition = 0;
        if (ug)
            if(in)
                tuition = cred * 500;
            else
                tuition = cred * 1000;
        else if (grad)
            if(in)
                tuition = cred * 800;
            else
                tuition = cred * 1600;
        else if (ndeg)
            if (in)
                tuition = cred * 300;
            else
                tuition = cred * 600;

        if(drm)
            tuition = tuition + 5000;

        if(dine)
            tuition = tuition + 2000;

        if (park)
            tuition = tuition + 1000;

        TextView total = (TextView)findViewById(R.id.totalView);
        total.setText(tuition+" ");
    }
}

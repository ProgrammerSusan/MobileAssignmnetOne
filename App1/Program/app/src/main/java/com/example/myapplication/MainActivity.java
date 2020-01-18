package com.example.myapplication;

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

    public void add(View v){
        EditText firstNumberText = (EditText)findViewById(R.id.firstInput);
        EditText secondNumberText = (EditText)findViewById(R.id.secondInput);

        String firstInput = firstNumberText.getText().toString();
        String secondInput = secondNumberText.getText().toString();

        float first = Float.parseFloat(firstInput);
        float second = Float.parseFloat(secondInput);

        float answer = first + second;
        TextView results = (TextView)findViewById(R.id.answer);
        results.setText(answer+"");
    }

    public void subtract(View v){
        EditText firstNumberText = (EditText)findViewById(R.id.firstInput);
        EditText secondNumberText = (EditText)findViewById(R.id.secondInput);

        String firstInput = firstNumberText.getText().toString();
        String secondInput = secondNumberText.getText().toString();

        float first = Float.parseFloat(firstInput);
        float second = Float.parseFloat(secondInput);

        float answer = first - second;
        TextView results = (TextView)findViewById(R.id.answer);
        results.setText(answer+"");
    }

    public void multiply(View v){
        EditText firstNumberText = (EditText)findViewById(R.id.firstInput);
        EditText secondNumberText = (EditText)findViewById(R.id.secondInput);

        String firstInput = firstNumberText.getText().toString();
        String secondInput = secondNumberText.getText().toString();

        float first = Float.parseFloat(firstInput);
        float second = Float.parseFloat(secondInput);

        float answer = first * second;
        TextView results = (TextView)findViewById(R.id.answer);
        results.setText(answer+"");
    }

    public void divide(View v){
        EditText firstNumberText = (EditText)findViewById(R.id.firstInput);
        EditText secondNumberText = (EditText)findViewById(R.id.secondInput);

        String firstInput = firstNumberText.getText().toString();
        String secondInput = secondNumberText.getText().toString();

        float first = Float.parseFloat(firstInput);
        float second = Float.parseFloat(secondInput);

        float answer = first / second;
        TextView results = (TextView)findViewById(R.id.answer);
        results.setText(answer+"");
    }
}

package com.example.program;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText red = (EditText)findViewById(R.id.red);
        EditText green = (EditText)findViewById(R.id.green);
        EditText blue = (EditText)findViewById(R.id.blue);

        ColorChanger listener = new ColorChanger();

        red.addTextChangedListener(listener);
        green.addTextChangedListener(listener);
        blue.addTextChangedListener(listener);
    }

    private class ColorChanger implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            setColor();
        }

        private void setColor(){
            TextView color = (TextView)findViewById(R.id.color);
            EditText red = (EditText)findViewById(R.id.red);
            EditText green = (EditText)findViewById(R.id.green);
            EditText blue = (EditText)findViewById(R.id.blue);

            int redValue;
            int greenValue;
            int blueValue;

            try {
                redValue = Integer.parseInt(red.getText().toString());
                if(redValue < 0){
                    redValue = 0;
                }
                if(redValue > 255){
                    redValue = 255;
                }
            }
            catch(Exception e){
                redValue = 0;
            }
            try {
                blueValue = Integer.parseInt(blue.getText().toString());
                if(blueValue < 0){
                    blueValue = 0;
                }
                if(blueValue > 255){
                    blueValue = 255;
                }
            }
            catch (Exception e) {
                blueValue = 0;
            }
            try {
                greenValue = Integer.parseInt(green.getText().toString());
                if(greenValue < 0){
                    greenValue = 0;
                }
                if(greenValue > 255){
                    greenValue = 255;
                }
            }
            catch (Exception e){
                greenValue = 0;
            }

            color.setBackgroundColor(Color.rgb(redValue, greenValue, blueValue));
        }
    }
}

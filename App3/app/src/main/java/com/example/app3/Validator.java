package com.example.app3;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class Validator implements TextWatcher {
    private EditText current;

    public Validator(EditText current){
        this.current = current;
    }
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        try{
            Float.parseFloat(current.getText().toString());
            current.setBackgroundColor(Color.parseColor("#E0E4E3"));
        }
        catch(Exception e){
            current.setBackgroundColor(Color.RED);
        }
    }

    @Override
    public void afterTextChanged(Editable s) {
    }
}

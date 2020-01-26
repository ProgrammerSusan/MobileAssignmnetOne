package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.*;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generate(View v){
        //Gathering data and storing in Strings
        EditText firstName = (EditText)findViewById(R.id.firstNameInput);
        EditText lastName = (EditText)findViewById(R.id.lastNameInput);
        EditText birthday = (EditText)findViewById(R.id.birthdayInput);

        String first = firstName.getText().toString();
        String last = lastName.getText().toString();
        String birth = birthday.getText().toString();

        //creating object and passing user input
        AccountGenerator user = new AccountGenerator(first, last, birth);

        TextView userId = (TextView)findViewById(R.id.idOutput);
        TextView password = (TextView)findViewById(R.id.passwordOutput);

        //generate userID and Password and setting text fields
        userId.setText(user.generateUsername());
        password.setText(user.generatePassword());
    }
}

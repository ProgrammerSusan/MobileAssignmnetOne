package com.example.app7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(android.view.View v){
        RadioButton A = (RadioButton) findViewById(R.id.a);
        RadioButton B = (RadioButton) findViewById(R.id.b);
        RadioButton C = (RadioButton) findViewById(R.id.c);
        RadioButton D = (RadioButton) findViewById(R.id.d);
        TextView Response = (TextView)findViewById(R.id.response);
        //TextView password = (TextView)findViewById(R.id.passwordOutput);

        boolean a = A.isChecked();
        boolean b = B.isChecked();
        boolean c = C.isChecked();
        boolean d = D.isChecked();

        Model.answer(a,b,c,d);


        //Response.setText(Model.answer());
        //password.setText(user.generatePassword());
    }
}

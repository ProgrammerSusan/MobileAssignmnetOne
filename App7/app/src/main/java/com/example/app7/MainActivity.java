package com.example.app7;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Model build;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        build = new Model();
        initialize();
    }
    public static String q, a1, a2, a3, a4;

    public void submit(android.view.View v){
        Button submit = (Button)findViewById(R.id.submitButton);
            submit.setEnabled(false);
        Button next = (Button)findViewById(R.id.nextButton);
            next.setEnabled(true);
        RadioButton A = (RadioButton) findViewById(R.id.a);
        RadioButton B = (RadioButton) findViewById(R.id.b);
        RadioButton C = (RadioButton) findViewById(R.id.c);
        RadioButton D = (RadioButton) findViewById(R.id.d);
        TextView Response = (TextView)findViewById(R.id.response);
        TextView Score = (TextView)findViewById(R.id.score);

        boolean a = A.isChecked();
        boolean b = B.isChecked();
        boolean c = C.isChecked();
        boolean d = D.isChecked();

        if(Model.answer(a,b,c,d))
        {
            Response.setText("Correct");
            Response.setTextColor(Color.GREEN);
        }
        else
        {
            Response.setText("Incorrect");
            Response.setTextColor(Color.RED);
        }

        Score.setText(Model.rightans +"/"+ Model.totalq);
    }

    public void next(android.view.View v)
    {
        q = Model.questions[Model.qnumber];
        a1 = Model.answers[Model.qnumber][0];
        a2 = Model.answers[Model.qnumber][1];
        a3 = Model.answers[Model.qnumber][2];
        a4 = Model.answers[Model.qnumber][3];

        Button submit = (Button)findViewById(R.id.submitButton);
            submit.setEnabled(true);
        Button next = (Button)findViewById(R.id.nextButton);
            next.setEnabled(false);

        RadioButton A = (RadioButton) findViewById(R.id.a);
            A.setText(a1);
            A.setChecked(false);
        RadioButton B = (RadioButton) findViewById(R.id.b);
            B.setText(a2);
            B.setChecked(false);
        RadioButton C = (RadioButton) findViewById(R.id.c);
            C.setText(a3);
            C.setChecked(false);
        RadioButton D = (RadioButton) findViewById(R.id.d);
            D.setText(a4);
            D.setChecked(false);

        TextView Question = (TextView)findViewById(R.id.question);
            Question.setText(q);

    }

    public void initialize()
    {
        q = Model.questions[Model.qnumber];
        a1 = Model.answers[Model.qnumber][0];
        a2 = Model.answers[Model.qnumber][1];
        a3 = Model.answers[Model.qnumber][2];
        a4 = Model.answers[Model.qnumber][3];

        Button submit = (Button)findViewById(R.id.submitButton);
        submit.setEnabled(true);
        Button next = (Button)findViewById(R.id.nextButton);
        next.setEnabled(false);

        RadioButton A = (RadioButton) findViewById(R.id.a);
        A.setText(a1);
        RadioButton B = (RadioButton) findViewById(R.id.b);
        B.setText(a2);
        RadioButton C = (RadioButton) findViewById(R.id.c);
        C.setText(a3);
        RadioButton D = (RadioButton) findViewById(R.id.d);
        D.setText(a4);

        TextView Question = (TextView)findViewById(R.id.question);
        Question.setText(q);
    }
}

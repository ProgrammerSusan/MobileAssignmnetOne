package com.example.program;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    public void initialize(){
        QuizBuilder build = new QuizBuilder();
        build.generateQuestion();

        TextView numberOne = (TextView)findViewById(R.id.firstNumber);
        String numberOneValue = build.getNumberOne() + "";
        numberOne.setText(numberOneValue);

        TextView numberTwo = (TextView)findViewById(R.id.secondNumber);
        String numberTwoValue = build.getNumberTwo() + "";
        numberTwo.setText(numberTwoValue);

        TextView operator = (TextView)findViewById(R.id.operator);
        String operatorValue = build.getOperator();
        operator.setText(operatorValue);

        TextView correct = (TextView)findViewById(R.id.correct);
        String correctValue = build.getTotalCorrect() + "";
        correct.setText(correctValue);

        TextView total = (TextView)findViewById(R.id.total);
        String totalValue = build.getTotalQuestions() + "";
        total.setText(totalValue);
    }
}

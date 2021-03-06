package com.example.program;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private QuizBuilder build; //QuizBuilder object to use throughout application
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        build = new QuizBuilder(); //set private variable
        initialize();
    }

    public void submitAnswer(View v){
        Button submit = (Button)findViewById(R.id.submit);
        submit.setEnabled(false);

        Button next = (Button)findViewById(R.id.next);
        next.setEnabled(true);

        EditText userAnswer = (EditText) findViewById(R.id.answer);
        int answer = Integer.parseInt(userAnswer.getText().toString());

        boolean correct = build.checkAnswer(answer);

        TextView totalQuestions = (TextView)findViewById(R.id.total);
        String total = build.getTotalQuestions() + "";
        totalQuestions.setText(total);

        TextView message = (TextView)findViewById(R.id.message);

        if(correct){
            TextView totalCorrect = (TextView)findViewById(R.id.correct);
            String userTotal = build.getTotalCorrect() + "";
            totalCorrect.setText(userTotal);
            message.setText("Correct");
            message.setTextColor(Color.GREEN);
        }
        else{
            message.setText("Incorrect");
            message.setTextColor(Color.RED);
        }
    }

    public void nextQuestion(View v){
        TextView message = (TextView)findViewById(R.id.message);
        message.setText("Submit Answer");
        message.setTextColor(Color.BLACK);

        build.generateQuestion();

        EditText userAnswer = (EditText) findViewById(R.id.answer);
        userAnswer.setText("");

        Button submit = (Button)findViewById(R.id.submit);
        submit.setEnabled(true);

        Button next = (Button)findViewById(R.id.next);
        next.setEnabled(false);

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

    public void initialize(){
        build.generateQuestion();

        Button next = (Button)findViewById(R.id.next);
        next.setEnabled(false);

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

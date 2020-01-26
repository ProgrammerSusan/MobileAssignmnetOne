package com.example.program;

import java.util.Random;

public class QuizBuilder {
    private int numberOne;
    private int numberTwo;
    private int answer;
    private String operator;
    private int totalQuestions;
    private int totalCorrect;

    public QuizBuilder(){
        this.numberOne = 0;
        this.numberTwo = 0;
        this.answer = 0;
        this.operator = "";
        this.totalQuestions = 0;
        this.totalCorrect = 0;
    }

    public void generateQuestion(){
        Random random = new Random();
        double probability = random.nextDouble();

        //chooses operator and random numbers to display
        if(probability <= 0.25){
            numberOne = random.nextInt(999) + 1;
            numberTwo = random.nextInt(999) + 1;
            operator = "+";
            answer = numberOne + numberTwo;
        }
        else if(probability <= 0.50){
            numberOne = random.nextInt(999) + 1;
            numberTwo = random.nextInt(999) + 1;
            operator = "-";
            answer = numberOne - numberTwo;
        }
        else if(probability <= 0.75) {
            numberOne = random.nextInt(99) + 1;
            numberTwo = random.nextInt(99) + 1;
            operator = "*";
            answer = numberOne * numberTwo;
        }
        else{
            numberOne = random.nextInt(99) + 1;
            numberTwo = random.nextInt(999) + 1;
            operator = "/";
            answer = numberOne / numberTwo;
        }
    }

    //takes in user answer and compares to stored answer
    //increments user score if answer is correct
    public boolean checkAnswer(int userAnswer){
        if(userAnswer == answer){
            incrementCorrect();
            incrementQuestions();
            return true;
        }
        else{
            incrementQuestions();
            return false;
        }
    }

    //get methods
    public int getNumberOne(){
        return numberOne;
    }

    public int getNumberTwo(){
        return numberTwo;
    }

    public String getOperator(){
        return operator;
    }

    public int getTotalQuestions(){
        return totalQuestions;
    }

    public int getTotalCorrect(){
        return totalCorrect;
    }

    //Increments answers for scores
    private void incrementCorrect(){
        totalCorrect++;
    }

    private void incrementQuestions(){
        totalQuestions++;
    }
}

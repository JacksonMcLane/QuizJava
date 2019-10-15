package com.example.quizjava;

public class Question {
    private String question;
    private boolean answer;

    @Override
    public String toString() {
        return question;
    }

    public boolean getAnswer(){
        return answer;
    }

}

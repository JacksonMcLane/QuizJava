package com.example.quizjava;

public class Question {
    private String questionText;
    private boolean answer;

    public Question(String questionText, boolean answer) {
        this.questionText = questionText;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return questionText + " " + answer;
    }

    public boolean getAnswer(){
        return answer;
    }

    public String getQuestion() {
        return questionText;
    }

}

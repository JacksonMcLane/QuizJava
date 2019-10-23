package com.example.quizjava;

import java.util.List;

public class Quiz {
    private int currentQuestion;
    private List<Question> QuestionList;
    private int score;

    public Quiz(List<Question> QuestionList) {
        this.QuestionList = QuestionList;
        currentQuestion = 0;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean checkAnswer(boolean answer) {
        if(answer == QuestionList.get(currentQuestion).getAnswer()) {
            score += 100;

            return true;
        }
        return false;
    }

    public String getQuestionText() {
        return QuestionList.get(currentQuestion).getQuestion();
    }

    public boolean isQuestionsRemaining() {
        if (currentQuestion + 1 <= QuestionList.size() - 1) {
            return true;
        }
        else{ return false; }
    }

    public void nextQuestion(){
        currentQuestion++;
    }

}

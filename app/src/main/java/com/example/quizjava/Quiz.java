package com.example.quizjava;

import java.util.List;

public class Quiz {
    private int currentQuestion;
    private List QuestionList;
    private Question question;
    private int score;

    public int getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(int currentQuestion) {
        this.currentQuestion = currentQuestion;
    }

    public List getQuestionList() {
        return QuestionList;
    }

    public void setQuestionList(List questionList) {
        QuestionList = questionList;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean checkAnswer(boolean answer){
//        if(answer == QuestionList.get(currentQuestion.getAnswer())){
//            return true;
//        }
        return false;
    }

    public boolean isQuestionsRemaining(){
        if (currentQuestion + 1 <= QuestionList.size() - 1) {
            return true;
        }
        else{ return false; }
    }

    public void nextQuestion(){
        currentQuestion++;
    }

}

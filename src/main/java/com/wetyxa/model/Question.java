package com.wetyxa.model;

import java.util.Map;

public class Question {

    private String textQuestion;
    private Map<String, Boolean> listAnswers;

    public Question() {
    }

    public Question(String textQuestion, Map<String, Boolean> listAnswers) {
        this.textQuestion = textQuestion;
        this.listAnswers = listAnswers;
    }

    public String getTextQuestion() {
        return textQuestion;
    }

    public void setTextQuestion(String textQuestion) {
        this.textQuestion = textQuestion;
    }

    public Map<String, Boolean> getListAnswers() {
        return listAnswers;
    }

    public void setListAnswers(Map<String, Boolean> listAnswers) {
        this.listAnswers = listAnswers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "textQuestion='" + textQuestion + '\'' +
                ", listAnswers=" + listAnswers +
                '}';
    }
}

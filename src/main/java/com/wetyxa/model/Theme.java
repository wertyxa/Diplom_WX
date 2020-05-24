package com.wetyxa.model;

import java.util.List;

public class Theme {
    String nameTheme;
    List<Question> questionList;

    public Theme() {
    }

    public Theme(String nameTheme, List<Question> questionList) {
        this.nameTheme = nameTheme;
        this.questionList = questionList;
    }

    public String getNameTheme() {
        return nameTheme;
    }

    public void setNameTheme(String nameTheme) {
        this.nameTheme = nameTheme;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    @Override
    public String toString() {
        return "Theme{" +
                "nameTheme='" + nameTheme + '\'' +
                ", questionList=" + questionList +
                '}';
    }
}

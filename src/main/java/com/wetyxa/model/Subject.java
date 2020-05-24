package com.wetyxa.model;

import java.util.List;

public class Subject {
    String nameSubject;
    List<Theme> themeList;

    public Subject() {
    }

    public Subject(String nameSubject, List<Theme> themeList) {
        this.nameSubject = nameSubject;
        this.themeList = themeList;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public List<Theme> getThemeList() {
        return themeList;
    }

    public void setThemeList(List<Theme> themeList) {
        this.themeList = themeList;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "nameSubject='" + nameSubject + '\'' +
                ", themeList=" + themeList +
                '}';
    }
}

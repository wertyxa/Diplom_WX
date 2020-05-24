package com.wetyxa.model;

import java.util.List;

public class Kurs {
    Integer numberKurs;
    List<Subject> subjectList;

    public Kurs() {
    }

    public Kurs(Integer numberKurs, List<Subject> subjectList) {
        this.numberKurs = numberKurs;
        this.subjectList = subjectList;
    }

    public Integer getNumberKurs() {
        return numberKurs;
    }

    public void setNumberKurs(Integer numberKurs) {
        this.numberKurs = numberKurs;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public String toString() {
        return "Kurs{" +
                "numberKurs=" + numberKurs +
                ", subjectList=" + subjectList +
                '}';
    }
}

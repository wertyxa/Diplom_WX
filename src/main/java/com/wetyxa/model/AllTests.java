package com.wetyxa.model;

import java.util.List;

public class AllTests {
    List<Kurs> kursList;

    public AllTests() {
    }

    public AllTests(List<Kurs> kursList) {
        this.kursList = kursList;
    }

    public List<Kurs> getKursList() {
        return kursList;
    }

    public void setKursList(List<Kurs> kursList) {
        this.kursList = kursList;
    }

    @Override
    public String toString() {
        return "AllTests{" +
                "kursList=" + kursList +
                '}';
    }
}

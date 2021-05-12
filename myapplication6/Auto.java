package com.example.myapplication6;

public class Auto {
    private String nazwa,model;
    private int rocznik,przebieg;

    public Auto(String nazwa, String model, int rocznik, int przebieg) {
        this.nazwa = nazwa;
        this.model = model;
        this.rocznik = rocznik;
        this.przebieg = przebieg;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getModel() {
        return model;
    }

    public int getRocznik() {
        return rocznik;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }
}

package com.muratalarcin.todoapp.data.entity;

import java.io.Serializable;

public class Gorevler implements Serializable {
    private int gorev_id;
    private String gorev_baslik;
    private String gorev_detay;

    public Gorevler() {
    }

    public Gorevler(int gorev_id, String gorev_baslik, String gorev_detay) {
        this.gorev_id = gorev_id;
        this.gorev_baslik = gorev_baslik;
        this.gorev_detay = gorev_detay;
    }

    public int getGorev_id() {
        return gorev_id;
    }

    public void setGorev_id(int gorev_id) {
        this.gorev_id = gorev_id;
    }

    public String getGorev_baslik() {
        return gorev_baslik;
    }

    public void setGorev_baslik(String gorev_baslik) {
        this.gorev_baslik = gorev_baslik;
    }

    public String getGorev_detay() {
        return gorev_detay;
    }

    public void setGorev_detay(String gorev_detay) {
        this.gorev_detay = gorev_detay;
    }
}

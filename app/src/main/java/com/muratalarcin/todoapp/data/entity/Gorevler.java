package com.muratalarcin.todoapp.data.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "gorevler")
public class Gorevler implements Serializable {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "gorev_id")
    @NonNull
    private int gorev_id;
    @ColumnInfo(name = "gorev_baslik")
    @NonNull
    private String gorev_baslik;
    @ColumnInfo(name = "gorev_detay")
    @NonNull
    private String gorev_detay;

    public Gorevler() {
    }

    public Gorevler(int gorev_id, @NonNull String gorev_baslik, @NonNull String gorev_detay) {
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

    @NonNull
    public String getGorev_baslik() {
        return gorev_baslik;
    }

    public void setGorev_baslik(@NonNull String gorev_baslik) {
        this.gorev_baslik = gorev_baslik;
    }

    @NonNull
    public String getGorev_detay() {
        return gorev_detay;
    }

    public void setGorev_detay(@NonNull String gorev_detay) {
        this.gorev_detay = gorev_detay;
    }
}

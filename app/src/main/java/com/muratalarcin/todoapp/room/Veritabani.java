package com.muratalarcin.todoapp.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.muratalarcin.todoapp.data.entity.Gorevler;

@Database(entities = {Gorevler.class}, version = 1)
public abstract class Veritabani extends RoomDatabase {
    public abstract GorevlerDao getGorevlerDao();
}

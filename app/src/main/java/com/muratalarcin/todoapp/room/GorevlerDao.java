package com.muratalarcin.todoapp.room;

import androidx.room.Dao;
import androidx.room.Query;

import com.muratalarcin.todoapp.data.entity.Gorevler;

import java.util.List;

import io.reactivex.Single;

@Dao
public interface GorevlerDao {
    @Query("SELECT * FROM gorevler")
    Single<List<Gorevler>> gorevleriYukle();
}

package com.muratalarcin.todoapp.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.muratalarcin.todoapp.data.entity.Gorevler;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

@Dao
public interface GorevlerDao {
    @Query("SELECT * FROM gorevler")
    Single<List<Gorevler>> gorevleriYukle();

    @Insert
    Completable kaydet(Gorevler gorev);

    @Update
    Completable guncelle(Gorevler gorev);
}

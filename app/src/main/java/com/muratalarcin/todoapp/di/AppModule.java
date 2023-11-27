package com.muratalarcin.todoapp.di;

import android.content.Context;

import androidx.room.Room;

import com.muratalarcin.todoapp.data.repo.GorevlerDaoRepository;
import com.muratalarcin.todoapp.room.GorevlerDao;
import com.muratalarcin.todoapp.room.Veritabani;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {

    @Provides
    @Singleton
    public GorevlerDaoRepository provideGorevlerDaoRepository(GorevlerDao gdao) {
        return new GorevlerDaoRepository(gdao);
    }

    @Provides
    @Singleton
    public GorevlerDao provideGorevlerDao(@ApplicationContext Context context) {
        Veritabani vt = Room.databaseBuilder(context, Veritabani.class, "notlar.sqlite")
                .createFromAsset("notlar.sqlite").build();
        return  vt.getGorevlerDao();
    }

}

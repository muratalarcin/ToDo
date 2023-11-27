package com.muratalarcin.todoapp.di;

import com.muratalarcin.todoapp.data.repo.GorevlerDaoRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {

    @Provides
    @Singleton
    public GorevlerDaoRepository provideGorevlerDaoRepository() {
        return new GorevlerDaoRepository();
    }

}

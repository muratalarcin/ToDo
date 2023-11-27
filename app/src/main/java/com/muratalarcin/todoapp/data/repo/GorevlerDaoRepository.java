package com.muratalarcin.todoapp.data.repo;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.muratalarcin.todoapp.data.entity.Gorevler;
import com.muratalarcin.todoapp.room.GorevlerDao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.reactivex.CompletableObserver;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class GorevlerDaoRepository {
    public MutableLiveData<List<Gorevler>> gorevlerListesi = new MutableLiveData<>();

    private GorevlerDao gdao;

    public GorevlerDaoRepository(GorevlerDao gdao) {
        this.gdao = gdao;
    }

    public void gorevleriYukle() {
        gdao.gorevleriYukle().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<Gorevler>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(List<Gorevler> gorevlers) {
                        gorevlerListesi.setValue(gorevlers);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });


    }

    public void guncelle(int gorevId, String gorevBaslik, String gorevDetay) {
        Gorevler guncellenenGorev = new Gorevler(gorevId, gorevBaslik, gorevDetay);
        gdao.guncelle(guncellenenGorev).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onComplete() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });
    }

    public void kaydet(String gorevBaslik, String gorevDetay) {
        Gorevler yeniGorev = new Gorevler(0, gorevBaslik, gorevDetay);
        gdao.kaydet(yeniGorev).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onComplete() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });
    }

    public void sil(int gorevId) {

    }

    public void ara(String aramaKelimesi) {

    }
}

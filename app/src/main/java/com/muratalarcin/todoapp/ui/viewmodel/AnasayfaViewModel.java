package com.muratalarcin.todoapp.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.muratalarcin.todoapp.data.entity.Gorevler;
import com.muratalarcin.todoapp.data.repo.GorevlerDaoRepository;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class AnasayfaViewModel extends ViewModel {
    public GorevlerDaoRepository grepo;
    public MutableLiveData<List<Gorevler>> gorevlerListesi;

    @Inject
    public AnasayfaViewModel(GorevlerDaoRepository grepo) {
        this.grepo = grepo;
        gorevleriYukle();
        gorevlerListesi = grepo.gorevlerListesi;
    }

    public void gorevleriYukle() {
        grepo.gorevleriYukle();
    }

    public void sil(int gorevId) {
        grepo.sil(gorevId);
    }

    public void ara(String aramaKelimesi) {
        grepo.ara(aramaKelimesi);
    }
}

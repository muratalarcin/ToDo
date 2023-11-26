package com.muratalarcin.todoapp.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.muratalarcin.todoapp.data.entity.Gorevler;
import com.muratalarcin.todoapp.data.repo.GorevlerDaoRepository;

import java.util.List;

public class AnasayfaViewModel extends ViewModel {
    public GorevlerDaoRepository grepo = new GorevlerDaoRepository();
    public MutableLiveData<List<Gorevler>> gorevlerListesi;

    public AnasayfaViewModel() {
        gorevleriYukle();
        gorevlerListesi = grepo.gorevlerListesi;

    }

    public void gorevleriYukle() {
        grepo.gorevleriYukle();
    }

}

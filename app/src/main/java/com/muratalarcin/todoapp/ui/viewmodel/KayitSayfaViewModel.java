package com.muratalarcin.todoapp.ui.viewmodel;

import androidx.lifecycle.ViewModel;

import com.muratalarcin.todoapp.data.repo.GorevlerDaoRepository;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class KayitSayfaViewModel extends ViewModel {
    public GorevlerDaoRepository grepo;

    @Inject
    public KayitSayfaViewModel(GorevlerDaoRepository grepo) {
        this.grepo = grepo;
    }

    public void kaydet(String gorevBaslik, String gorevDetay) {
        grepo.kaydet(gorevBaslik, gorevDetay);
    }
}

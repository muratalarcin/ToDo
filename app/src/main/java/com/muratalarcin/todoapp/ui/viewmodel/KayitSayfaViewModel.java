package com.muratalarcin.todoapp.ui.viewmodel;

import androidx.lifecycle.ViewModel;

import com.muratalarcin.todoapp.data.repo.GorevlerDaoRepository;

public class KayitSayfaViewModel extends ViewModel {
    public GorevlerDaoRepository grepo = new GorevlerDaoRepository();
    public void kaydet(String gorevBaslik, String gorevDetay) {
        grepo.kaydet(gorevBaslik, gorevDetay);
    }
}

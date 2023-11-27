package com.muratalarcin.todoapp.ui.viewmodel;

import androidx.lifecycle.ViewModel;

import com.muratalarcin.todoapp.data.repo.GorevlerDaoRepository;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class DetaySayfaViewModel extends ViewModel {
    public GorevlerDaoRepository grepo;

    @Inject
    public DetaySayfaViewModel(GorevlerDaoRepository grepo) {
        this.grepo = grepo;
    }

    public void guncelle (int gorev_id, String gorev_baslik, String gorev_detay) {
        grepo.guncelle(gorev_id, gorev_baslik, gorev_detay);
    }

}

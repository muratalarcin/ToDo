package com.muratalarcin.todoapp.ui.viewmodel;

import androidx.lifecycle.ViewModel;

import com.muratalarcin.todoapp.data.repo.GorevlerDaoRepository;

public class DetaySayfaViewModel extends ViewModel {
    public GorevlerDaoRepository grepo = new GorevlerDaoRepository();

    public void guncelle (int gorev_id, String gorev_baslik, String gorev_detay) {
        grepo.guncelle(gorev_id, gorev_baslik, gorev_detay);
    }

}

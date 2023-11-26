package com.muratalarcin.todoapp.data.repo;

import androidx.lifecycle.MutableLiveData;

import com.muratalarcin.todoapp.data.entity.Gorevler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GorevlerDaoRepository {
    public MutableLiveData<List<Gorevler>> gorevlerListesi = new MutableLiveData<>();

    public void gorevleriYukle() {
        ArrayList<Gorevler> liste = new ArrayList<>();
        Gorevler g1 = new Gorevler(1, "lalala", "sdfsdfsdfsdfsdfsdf");
        liste.add(g1);

        gorevlerListesi.setValue(liste);
    }

}

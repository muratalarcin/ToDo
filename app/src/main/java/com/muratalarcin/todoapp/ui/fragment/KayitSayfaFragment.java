package com.muratalarcin.todoapp.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muratalarcin.todoapp.R;
import com.muratalarcin.todoapp.databinding.FragmentKayitSayfaBinding;
import com.muratalarcin.todoapp.ui.viewmodel.KayitSayfaViewModel;

public class KayitSayfaFragment extends Fragment {
    private FragmentKayitSayfaBinding binding;
    private KayitSayfaViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentKayitSayfaBinding.inflate(inflater, container, false);

        binding.buttonKaydet.setOnClickListener(view -> {
            String gorev_baslik = binding.editTextBaslik.getText().toString();
            String gorev_detay = binding.editTextDetay.getText().toString();
            viewModel.kaydet(gorev_baslik, gorev_detay);
        });

        return binding.getRoot();
    }
}
package com.muratalarcin.todoapp.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muratalarcin.todoapp.R;
import com.muratalarcin.todoapp.databinding.FragmentKayitSayfaBinding;
import com.muratalarcin.todoapp.ui.viewmodel.KayitSayfaViewModel;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class KayitSayfaFragment extends Fragment {
    private FragmentKayitSayfaBinding binding;
    private KayitSayfaViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentKayitSayfaBinding.inflate(inflater, container, false);

        binding.buttonKaydet.setOnClickListener(view -> {
            String gorev_baslik = binding.kayitBaslik.getText().toString();
            String gorev_detay = binding.kayitGorev.getText().toString();
            viewModel.kaydet(gorev_baslik, gorev_detay);
        });

        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(KayitSayfaViewModel.class);
    }
}
package com.muratalarcin.todoapp.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muratalarcin.todoapp.R;
import com.muratalarcin.todoapp.data.entity.Gorevler;
import com.muratalarcin.todoapp.databinding.FragmentDetaySayfaBinding;
import com.muratalarcin.todoapp.ui.viewmodel.DetaySayfaViewModel;


public class DetaySayfaFragment extends Fragment {
    private FragmentDetaySayfaBinding binding;
    private DetaySayfaViewModel viewModel;
   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetaySayfaBinding.inflate(inflater, container, false);

        DetaySayfaFragmentArgs bundle = DetaySayfaFragmentArgs.fromBundle(getArguments());
        Gorevler gelenGorev = bundle.getGorev();

        binding.detayBaslik.setText(gelenGorev.getGorev_baslik());
        binding.detayGorev.setText(gelenGorev.getGorev_detay());

        binding.buttonGuncelle.setOnClickListener(view -> {
            String gorev_baslik = binding.detayBaslik.getText().toString();
            String gorev_detay = binding.detayGorev.getText().toString();
            viewModel.guncelle(gelenGorev.getGorev_id(), gorev_baslik, gorev_detay);
        });

        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(DetaySayfaViewModel.class);
    }
}
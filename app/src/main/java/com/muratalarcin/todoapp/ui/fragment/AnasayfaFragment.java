package com.muratalarcin.todoapp.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muratalarcin.todoapp.R;
import com.muratalarcin.todoapp.databinding.FragmentAnasayfaBinding;
import com.muratalarcin.todoapp.ui.adapter.GorevlerAdapter;
import com.muratalarcin.todoapp.ui.viewmodel.AnasayfaViewModel;

public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;
    private AnasayfaViewModel viewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container,false);

        binding.rvGorevler.setLayoutManager(new LinearLayoutManager(requireContext()));

        viewModel.gorevlerListesi.observe(getViewLifecycleOwner(), gorevlerListesi -> {
            GorevlerAdapter adapter = new GorevlerAdapter(gorevlerListesi, requireContext(), viewModel);
            binding.rvGorevler.setAdapter(adapter);
        });


        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(AnasayfaViewModel.class);
    }
}
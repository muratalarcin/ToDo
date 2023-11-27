package com.muratalarcin.todoapp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.muratalarcin.todoapp.R;
import com.muratalarcin.todoapp.data.entity.Gorevler;
import com.muratalarcin.todoapp.databinding.RowBinding;
import com.muratalarcin.todoapp.ui.fragment.AnasayfaFragmentDirections;
import com.muratalarcin.todoapp.ui.viewmodel.AnasayfaViewModel;

import java.util.List;

public class GorevlerAdapter extends RecyclerView.Adapter<GorevlerAdapter.RowHolder> {
    private List<Gorevler> gorevlerListesi;
    private Context mContext;
    private AnasayfaViewModel viewModel;

    public GorevlerAdapter(List<Gorevler> gorevlerListesi, Context mContext, AnasayfaViewModel viewModel) {
        this.gorevlerListesi = gorevlerListesi;
        this.mContext = mContext;
        this.viewModel = viewModel;
    }

    public class RowHolder extends RecyclerView.ViewHolder {
        private RowBinding tasarim;

        public RowHolder(RowBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }

    @NonNull
    @Override
    public RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RowBinding binding = RowBinding.inflate(LayoutInflater.from(mContext), parent, false);
        return new RowHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RowHolder holder, int position) {
        Gorevler gorev = gorevlerListesi.get(position);
        RowBinding t = holder.tasarim;

        t.twBaslik.setText(gorev.getGorev_baslik());
        t.twGorev.setText(gorev.getGorev_detay());

        t.cardViewRow.setOnClickListener(view -> {
            AnasayfaFragmentDirections.DetayGecis gecis = AnasayfaFragmentDirections.detayGecis(gorev);
            Navigation.findNavController(view).navigate(gecis);
        });

    }

    @Override
    public int getItemCount() {
        return gorevlerListesi.size();
    }


}

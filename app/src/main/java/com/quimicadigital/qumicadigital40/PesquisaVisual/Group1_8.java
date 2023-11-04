package com.quimicadigital.qumicadigital40.PesquisaVisual;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.quimicadigital.qumicadigital40.databinding.FragmentGroup18Binding;

public class Group1_8 extends Fragment {

    private FragmentGroup18Binding binding;
    private LayoutInflater inflador;



    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentGroup18Binding.inflate(inflater, container, false);
        inflador = inflater;
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController navController = Navigation.findNavController(view);

        /*binding.elem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Clicado", Toast.LENGTH_LONG).show();
            }
        });*/

}

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
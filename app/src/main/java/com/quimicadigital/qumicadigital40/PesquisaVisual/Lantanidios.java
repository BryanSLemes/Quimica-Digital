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
import android.widget.TableLayout;

import com.quimicadigital.qumicadigital40.databinding.FragmentLantanidiosBinding;

public class Lantanidios extends Fragment {

    private FragmentLantanidiosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentLantanidiosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavegarObj nav = new NavegarObj();
        NavController navController = Navigation.findNavController(view);

        chamarEventos(navController,nav);
        nomearElementos(nav);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void addEvento(TableLayout elem, NavegarObj nav, int num, NavController nave){
        elem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nav.pesquisar(num,nave);
            }
        });
    }

    private void chamarEventos(NavController navController,NavegarObj nav){
        addEvento(binding.elem57, nav,57,navController);
        addEvento(binding.elem58, nav,58,navController);
        addEvento(binding.elem59, nav,59,navController);
        addEvento(binding.elem60, nav,60,navController);
        addEvento(binding.elem61, nav,61,navController);
        addEvento(binding.elem62, nav,62,navController);
        addEvento(binding.elem63, nav,63,navController);
        addEvento(binding.elem64, nav,64,navController);
        addEvento(binding.elem65, nav,65,navController);
        addEvento(binding.elem66, nav,66,navController);
        addEvento(binding.elem67, nav,67,navController);
        addEvento(binding.elem68, nav,68,navController);
        addEvento(binding.elem69, nav,69,navController);
        addEvento(binding.elem70, nav,70,navController);
    }

    private void nomearElementos(NavegarObj nav){
        nav.nomear(binding.txtNom57,binding.txtSimb57,57);
        nav.nomear(binding.txtNom58,binding.txtSimb58,58);
        nav.nomear(binding.txtNom59,binding.txtSimb59,59);
        nav.nomear(binding.txtNom60,binding.txtSimb60,60);
        nav.nomear(binding.txtNom61,binding.txtSimb61,61);
        nav.nomear(binding.txtNom62,binding.txtSimb62,62);
        nav.nomear(binding.txtNom63,binding.txtSimb63,63);
        nav.nomear(binding.txtNom64,binding.txtSimb64,64);
        nav.nomear(binding.txtNom65,binding.txtSimb65,65);
        nav.nomear(binding.txtNom66,binding.txtSimb66,66);
        nav.nomear(binding.txtNom67,binding.txtSimb67,67);
        nav.nomear(binding.txtNom68,binding.txtSimb68,68);
        nav.nomear(binding.txtNom69,binding.txtSimb69,69);
        nav.nomear(binding.txtNom70,binding.txtSimb70,70);
    }
}
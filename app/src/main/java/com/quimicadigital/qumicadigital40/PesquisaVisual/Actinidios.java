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

import com.quimicadigital.qumicadigital40.databinding.FragmentActinidiosBinding;


public class Actinidios extends Fragment {

    private FragmentActinidiosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentActinidiosBinding.inflate(inflater, container, false);
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
        addEvento(binding.elem89, nav,89,navController);
        addEvento(binding.elem90, nav,90,navController);
        addEvento(binding.elem91, nav,91,navController);
        addEvento(binding.elem92, nav,92,navController);
        addEvento(binding.elem93, nav,93,navController);
        addEvento(binding.elem94, nav,94,navController);
        addEvento(binding.elem95, nav,95,navController);
        addEvento(binding.elem96, nav,96,navController);
        addEvento(binding.elem97, nav,97,navController);
        addEvento(binding.elem98, nav,98,navController);
        addEvento(binding.elem99, nav,99,navController);
        addEvento(binding.elem100, nav,100,navController);
        addEvento(binding.elem101, nav,101,navController);
        addEvento(binding.elem102, nav,102,navController);
    }

    private void nomearElementos(NavegarObj nav){
        nav.nomear(binding.txtNom89,binding.txtSimb89,89);
        nav.nomear(binding.txtNom90,binding.txtSimb90,90);
        nav.nomear(binding.txtNom91,binding.txtSimb91,91);
        nav.nomear(binding.txtNom92,binding.txtSimb92,92);
        nav.nomear(binding.txtNom93,binding.txtSimb93,93);
        nav.nomear(binding.txtNom94,binding.txtSimb94,94);
        nav.nomear(binding.txtNom95,binding.txtSimb95,95);
        nav.nomear(binding.txtNom96,binding.txtSimb96,96);
        nav.nomear(binding.txtNom97,binding.txtSimb97,97);
        nav.nomear(binding.txtNom98,binding.txtSimb98,98);
        nav.nomear(binding.txtNom99,binding.txtSimb99,99);
        nav.nomear(binding.txtNom100,binding.txtSimb100,100);
        nav.nomear(binding.txtNom101,binding.txtSimb101,101);
        nav.nomear(binding.txtNom102,binding.txtSimb102,102);
    }
}
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

import com.quimicadigital.qumicadigital40.databinding.FragmentMetaisBinding;


public class Metais extends Fragment {

    private FragmentMetaisBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentMetaisBinding.inflate(inflater, container, false);
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
        addEvento(binding.elem21, nav,21,navController);
        addEvento(binding.elem22, nav,22,navController);
        addEvento(binding.elem23, nav,23,navController);
        addEvento(binding.elem24, nav,24,navController);
        addEvento(binding.elem25, nav,25,navController);
        addEvento(binding.elem26, nav,26,navController);
        addEvento(binding.elem27, nav,27,navController);
        addEvento(binding.elem28, nav,28,navController);
        addEvento(binding.elem29, nav,29,navController);
        addEvento(binding.elem30, nav,30,navController);
        addEvento(binding.elem39, nav,39,navController);
        addEvento(binding.elem40, nav,40,navController);
        addEvento(binding.elem41, nav,41,navController);
        addEvento(binding.elem42, nav,42,navController);
        addEvento(binding.elem43, nav,43,navController);
        addEvento(binding.elem44, nav,44,navController);
        addEvento(binding.elem45, nav,45,navController);
        addEvento(binding.elem46, nav,46,navController);
        addEvento(binding.elem47, nav,47,navController);
        addEvento(binding.elem48, nav,48,navController);
        addEvento(binding.elem71, nav,71,navController);
        addEvento(binding.elem72, nav,72,navController);
        addEvento(binding.elem73, nav,73,navController);
        addEvento(binding.elem74, nav,74,navController);
        addEvento(binding.elem75, nav,75,navController);
        addEvento(binding.elem76, nav,76,navController);
        addEvento(binding.elem77, nav,77,navController);
        addEvento(binding.elem78, nav,78,navController);
        addEvento(binding.elem79, nav,79,navController);
        addEvento(binding.elem80, nav,80,navController);
        addEvento(binding.elem103, nav,103,navController);
        addEvento(binding.elem104, nav,104,navController);
        addEvento(binding.elem105, nav,105,navController);
        addEvento(binding.elem106, nav,106,navController);
        addEvento(binding.elem107, nav,107,navController);
        addEvento(binding.elem108, nav,108,navController);
        addEvento(binding.elem109, nav,109,navController);
        addEvento(binding.elem110, nav,110,navController);
        addEvento(binding.elem111, nav,111,navController);
        addEvento(binding.elem112, nav,112,navController);
    }

    private void nomearElementos(NavegarObj nav){
        nav.nomear(binding.txtNom21,binding.txtSimb21,21);
        nav.nomear(binding.txtNom22,binding.txtSimb22,22);
        nav.nomear(binding.txtNom23,binding.txtSimb23,23);
        nav.nomear(binding.txtNom24,binding.txtSimb24,24);
        nav.nomear(binding.txtNom25,binding.txtSimb25,25);
        nav.nomear(binding.txtNom26,binding.txtSimb26,26);
        nav.nomear(binding.txtNom27,binding.txtSimb27,27);
        nav.nomear(binding.txtNom28,binding.txtSimb28,28);
        nav.nomear(binding.txtNom29,binding.txtSimb29,29);
        nav.nomear(binding.txtNom30,binding.txtSimb30,30);
        nav.nomear(binding.txtNom39,binding.txtSimb39,39);
        nav.nomear(binding.txtNom40,binding.txtSimb40,40);
        nav.nomear(binding.txtNom41,binding.txtSimb41,41);
        nav.nomear(binding.txtNom42,binding.txtSimb42,42);
        nav.nomear(binding.txtNom43,binding.txtSimb43,43);
        nav.nomear(binding.txtNom44,binding.txtSimb44,44);
        nav.nomear(binding.txtNom45,binding.txtSimb45,45);
        nav.nomear(binding.txtNom46,binding.txtSimb46,46);
        nav.nomear(binding.txtNom47,binding.txtSimb47,47);
        nav.nomear(binding.txtNom48,binding.txtSimb48,48);
        nav.nomear(binding.txtNom71,binding.txtSimb71,71);
        nav.nomear(binding.txtNom72,binding.txtSimb72,72);
        nav.nomear(binding.txtNom73,binding.txtSimb73,73);
        nav.nomear(binding.txtNom74,binding.txtSimb74,74);
        nav.nomear(binding.txtNom75,binding.txtSimb75,75);
        nav.nomear(binding.txtNom76,binding.txtSimb76,76);
        nav.nomear(binding.txtNom77,binding.txtSimb77,77);
        nav.nomear(binding.txtNom78,binding.txtSimb78,78);
        nav.nomear(binding.txtNom79,binding.txtSimb79,79);
        nav.nomear(binding.txtNom80,binding.txtSimb80,80);
        nav.nomear(binding.txtNom103,binding.txtSimb103,103);
        nav.nomear(binding.txtNom104,binding.txtSimb104,104);
        nav.nomear(binding.txtNom105,binding.txtSimb105,105);
        nav.nomear(binding.txtNom106,binding.txtSimb106,106);
        nav.nomear(binding.txtNom107,binding.txtSimb107,107);
        nav.nomear(binding.txtNom108,binding.txtSimb108,108);
        nav.nomear(binding.txtNom109,binding.txtSimb109,109);
        nav.nomear(binding.txtNom110,binding.txtSimb110,110);
        nav.nomear(binding.txtNom111,binding.txtSimb111,111);
        nav.nomear(binding.txtNom112,binding.txtSimb112,112);
    }

}
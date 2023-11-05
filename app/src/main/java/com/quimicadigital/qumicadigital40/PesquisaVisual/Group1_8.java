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
import com.quimicadigital.qumicadigital40.databinding.FragmentGroup18Binding;

public class Group1_8 extends Fragment {

    private FragmentGroup18Binding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentGroup18Binding.inflate(inflater, container, false);
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

    private void addEvento(TableLayout elem, NavegarObj nav,int num,NavController nave){
        elem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nav.pesquisar(num,nave);
            }
        });
    }

    private void chamarEventos(NavController navController,NavegarObj nav){
        addEvento(binding.elem1, nav,1,navController);
        addEvento(binding.elem2, nav,2,navController);
        addEvento(binding.elem3, nav,3,navController);
        addEvento(binding.elem4, nav,4,navController);
        addEvento(binding.elem5, nav,5,navController);
        addEvento(binding.elem6, nav,6,navController);
        addEvento(binding.elem7, nav,7,navController);
        addEvento(binding.elem8, nav,8,navController);
        addEvento(binding.elem9, nav,9,navController);
        addEvento(binding.elem10, nav,10,navController);
        addEvento(binding.elem11, nav,11,navController);
        addEvento(binding.elem12, nav,12,navController);
        addEvento(binding.elem13, nav,13,navController);
        addEvento(binding.elem14, nav,14,navController);
        addEvento(binding.elem15, nav,15,navController);
        addEvento(binding.elem16, nav,16,navController);
        addEvento(binding.elem17, nav,17,navController);
        addEvento(binding.elem18, nav,18,navController);
        addEvento(binding.elem19, nav,19,navController);
        addEvento(binding.elem20, nav,20,navController);
        addEvento(binding.elem31, nav,31,navController);
        addEvento(binding.elem32, nav,32,navController);
        addEvento(binding.elem33, nav,33,navController);
        addEvento(binding.elem34, nav,34,navController);
        addEvento(binding.elem35, nav,35,navController);
        addEvento(binding.elem36, nav,36,navController);
        addEvento(binding.elem37, nav,37,navController);
        addEvento(binding.elem38, nav,38,navController);
        addEvento(binding.elem49, nav,49,navController);
        addEvento(binding.elem50, nav,50,navController);
        addEvento(binding.elem51, nav,51,navController);
        addEvento(binding.elem52, nav,52,navController);
        addEvento(binding.elem53, nav,53,navController);
        addEvento(binding.elem54, nav,54,navController);
        addEvento(binding.elem55, nav,55,navController);
        addEvento(binding.elem56, nav,56,navController);
        addEvento(binding.elem81, nav,81,navController);
        addEvento(binding.elem82, nav,82,navController);
        addEvento(binding.elem83, nav,83,navController);
        addEvento(binding.elem84, nav,84,navController);
        addEvento(binding.elem85, nav,85,navController);
        addEvento(binding.elem86, nav,86,navController);
        addEvento(binding.elem87, nav,87,navController);
        addEvento(binding.elem88, nav,88,navController);
        addEvento(binding.elem113, nav,113,navController);
        addEvento(binding.elem114, nav,114,navController);
        addEvento(binding.elem115, nav,115,navController);
        addEvento(binding.elem116, nav,116,navController);
        addEvento(binding.elem117, nav,117,navController);
        addEvento(binding.elem118, nav,118,navController);
    }

    private void nomearElementos(NavegarObj nav){
        nav.nomear(binding.txtNom1,binding.txtSimb1,1);
        nav.nomear(binding.txtNom2,binding.txtSimb2,2);
        nav.nomear(binding.txtNom3,binding.txtSimb3,3);
        nav.nomear(binding.txtNom4,binding.txtSimb4,4);
        nav.nomear(binding.txtNom5,binding.txtSimb5,5);
        nav.nomear(binding.txtNom6,binding.txtSimb6,6);
        nav.nomear(binding.txtNom7,binding.txtSimb7,7);
        nav.nomear(binding.txtNom8,binding.txtSimb8,8);
        nav.nomear(binding.txtNom9,binding.txtSimb9,9);
        nav.nomear(binding.txtNom10,binding.txtSimb10,10);
        nav.nomear(binding.txtNom11,binding.txtSimb11,11);
        nav.nomear(binding.txtNom12,binding.txtSimb12,12);
        nav.nomear(binding.txtNom13,binding.txtSimb13,13);
        nav.nomear(binding.txtNom14,binding.txtSimb14,14);
        nav.nomear(binding.txtNom15,binding.txtSimb15,15);
        nav.nomear(binding.txtNom16,binding.txtSimb16,16);
        nav.nomear(binding.txtNom17,binding.txtSimb17,17);
        nav.nomear(binding.txtNom18,binding.txtSimb18,18);
        nav.nomear(binding.txtNom19,binding.txtSimb19,19);
        nav.nomear(binding.txtNom20,binding.txtSimb20,20);
        nav.nomear(binding.txtNom31,binding.txtSimb31,31);
        nav.nomear(binding.txtNom32,binding.txtSimb32,32);
        nav.nomear(binding.txtNom33,binding.txtSimb33,33);
        nav.nomear(binding.txtNom34,binding.txtSimb34,34);
        nav.nomear(binding.txtNom35,binding.txtSimb35,35);
        nav.nomear(binding.txtNom36,binding.txtSimb36,36);
        nav.nomear(binding.txtNom37,binding.txtSimb37,37);
        nav.nomear(binding.txtNom38,binding.txtSimb38,38);
        nav.nomear(binding.txtNom49,binding.txtSimb49,49);
        nav.nomear(binding.txtNom50,binding.txtSimb50,50);
        nav.nomear(binding.txtNom51,binding.txtSimb51,51);
        nav.nomear(binding.txtNom52,binding.txtSimb52,52);
        nav.nomear(binding.txtNom53,binding.txtSimb53,53);
        nav.nomear(binding.txtNom54,binding.txtSimb54,54);
        nav.nomear(binding.txtNom55,binding.txtSimb55,55);
        nav.nomear(binding.txtNom56,binding.txtSimb56,56);
        nav.nomear(binding.txtNom81,binding.txtSimb81,81);
        nav.nomear(binding.txtNom82,binding.txtSimb82,82);
        nav.nomear(binding.txtNom83,binding.txtSimb83,83);
        nav.nomear(binding.txtNom84,binding.txtSimb84,84);
        nav.nomear(binding.txtNom85,binding.txtSimb85,85);
        nav.nomear(binding.txtNom86,binding.txtSimb86,86);
        nav.nomear(binding.txtNom87,binding.txtSimb87,87);
        nav.nomear(binding.txtNom88,binding.txtSimb88,88);
        nav.nomear(binding.txtNom113,binding.txtSimb113,113);
        nav.nomear(binding.txtNom114,binding.txtSimb114,114);
        nav.nomear(binding.txtNom115,binding.txtSimb115,115);
        nav.nomear(binding.txtNom116,binding.txtSimb116,116);
        nav.nomear(binding.txtNom117,binding.txtSimb117,117);
        nav.nomear(binding.txtNom118,binding.txtSimb118,118);
    }
}
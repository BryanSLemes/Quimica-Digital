package com.quimicadigital.qumicadigital40.PesquisaVisual;

import android.database.sqlite.SQLiteDatabase;
import android.widget.TextView;
import androidx.navigation.NavController;
import com.quimicadigital.qumicadigital40.Elementos.Pesquisa;
import com.quimicadigital.qumicadigital40.MainActivity;
import com.quimicadigital.qumicadigital40.R;
import java.util.List;

public class NavegarObj {

    private Pesquisa pesquisa = new Pesquisa();
    private SQLiteDatabase db = (MainActivity.getConexao()).getDatabase();
    private List<String> nomesElem;

    public NavegarObj(){
        nomesElem = pesquisa.nomear(db);
    }

    public void pesquisar(int elemento, NavController navController){
        pesquisa.povoarCRUD(elemento,db);
        navController.navigate(R.id.action_nav_pesquisa_visual_to_elemento);
    }

    public void nomear(TextView nome, TextView simbolo,int num){
        num = (num -1) * 2;
        nome.setText(nomesElem.get(num));
        simbolo.setText(nomesElem.get(num +1));
    }

}

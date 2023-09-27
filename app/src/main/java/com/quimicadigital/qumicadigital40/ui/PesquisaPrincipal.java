package com.quimicadigital.qumicadigital40.ui;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.quimicadigital.qumicadigital40.MainActivity;
import com.quimicadigital.qumicadigital40.Elementos.Pesquisa;
import com.quimicadigital.qumicadigital40.R;
import com.quimicadigital.qumicadigital40.databinding.FragmentPesquisaPrincipalBinding;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;

public class PesquisaPrincipal extends Fragment {

    private FragmentPesquisaPrincipalBinding binding;
    public static Pesquisa pesquisa;
    private static View vista;
    private Button btn_pesquisar;
    private Button btn_aleatorio;
    private AutoCompleteTextView edt_pesquisa;
    private ArrayList<String> auto_elementos;
    private ArrayList<TextView> elem;
    private ContentValues cv;
    private SQLiteDatabase dbinsert;
    private SQLiteDatabase db;
    private String sql;
    private Cursor cursor;
    private LinearLayout linearLayout;

    private TextView elemento1;
    private TextView elemento2;
    private TextView elemento3;
    private TextView elemento4;
    private TextView elemento5;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentPesquisaPrincipalBinding.inflate(inflater, container, false);
        vista = inflater.inflate(R.layout.fragment_pesquisa_principal, container, false);
        return vista;}
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String hexColor = String.format("#%06X", (0xFFFFFF & ((ColorDrawable) vista.findViewById(R.id.layout_principal).getBackground()).getColor()));
        linearLayout = vista.findViewById(R.id.layout_recentes);
        if(hexColor.equals("#B2D8EB")){
            linearLayout.setBackgroundResource(R.drawable.forma_borda_elemento_light);
        }
        NavController navController = Navigation.findNavController(view);
        pesquisa = new Pesquisa();
        Random random = new Random();
        elem = new ArrayList<TextView>();
        cv = new ContentValues();
        db = (MainActivity.getConexao()).getDatabase();
        dbinsert = (MainActivity.getConexao()).getDatabaseWritable();
        auto_elementos = pesquisa.povoarAutocomplete(MainActivity.getConexao());
        edt_pesquisa = (AutoCompleteTextView) vista.findViewById(R.id.edt_pesquisa);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(vista.getContext(), android.R.layout.simple_dropdown_item_1line, auto_elementos);
        edt_pesquisa.setAdapter(arrayAdapter);
        edt_pesquisa.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    pesquisar(edt_pesquisa.getText().toString(),navController);
                    return true;}
                return false;}});
        edt_pesquisa.setOnItemClickListener((parent, vista, position, id) -> {
            pesquisar((String) parent.getItemAtPosition(position),navController);
        });
        btn_pesquisar = (Button) vista.findViewById(R.id.btn_buscar);
        btn_pesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pesquisar(edt_pesquisa.getText().toString(),navController);
        }});
        btn_aleatorio = (Button) vista.findViewById(R.id.btn_aleatorio);
        btn_aleatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pesquisar((random.nextInt(118) + 1) + "",navController);
            }});

        elemento1 = vista.findViewById(R.id.txt_rec_1);
        elemento2 = vista.findViewById(R.id.txt_rec_2);
        elemento3 = vista.findViewById(R.id.txt_rec_3);
        elemento4 = vista.findViewById(R.id.txt_rec_4);
        elemento5 = vista.findViewById(R.id.txt_rec_5);

        elemento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pesquisar((elemento1.getText().toString().substring(0, 3)).replace("-",""),navController);
            }});

        elemento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pesquisar((elemento2.getText().toString().substring(0, 3)).replace("-",""),navController);
            }});

        elemento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pesquisar((elemento3.getText().toString().substring(0, 3)).replace("-",""),navController);
            }});

        elemento4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pesquisar((elemento4.getText().toString().substring(0, 3)).replace("-",""),navController);
            }});

        elemento5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pesquisar((elemento5.getText().toString().substring(0, 3)).replace("-",""),navController);
            }});

        elemento1.setVisibility(View.INVISIBLE);
        elemento2.setVisibility(View.INVISIBLE);
        elemento3.setVisibility(View.INVISIBLE);
        elemento4.setVisibility(View.INVISIBLE);
        elemento5.setVisibility(View.INVISIBLE);

        elem.add(elemento1);
        elem.add(elemento2);
        elem.add(elemento3);
        elem.add(elemento4);
        elem.add(elemento5);

        listar();
    }
    public void listar(){
        sql = "select Id,descricao from Recentes;";
        cursor = db.rawQuery(sql,null);
        if(cursor.getCount() > 5){
            sql = "select MIN(Id),descricao from Recentes;";
            cursor = db.rawQuery(sql,null);
            cursor.moveToFirst();
            int i = cursor.getInt(0);
            dbinsert.execSQL("DELETE FROM Recentes WHERE Id = " + i);
            MainActivity.requestReview(getContext(),MainActivity.getContexto());
        }

        sql = "select Id,descricao from Recentes;";
        cursor = db.rawQuery(sql,null);
        cursor.moveToFirst();
        for(int i=0;i<cursor.getCount();i++){
            (elem.get(i)).setVisibility(View.VISIBLE);
            (elem.get(i)).setText(cursor.getString(1));
            cursor.moveToNext();
        }
    }

    public boolean verificar(String recent){
        sql = "select Id,descricao from Recentes;";
        cursor = db.rawQuery(sql,null);

        if(cursor.getCount() > 0){
            cursor.moveToFirst();
            do{
                String teste = cursor.getString(1);
                if(recent.equals(teste)){
                    return false;
                }
            }while (cursor.moveToNext());
            return true;
        }
        return true;
    }

    public void pesquisar(String elemento, NavController navController){

        elemento = (removerAcentos(elemento.toLowerCase(Locale.ROOT))).replaceAll(" ","");
        if(elemento.equals("")){
            Toast.makeText(vista.getContext(),"Campo de texto vazio", Toast.LENGTH_LONG).show();
        }else if(pesquisa.pesquisaPrincipal(elemento)){
            navController.navigate(R.id.action_nav_home_to_elemento);
            if(verificar(pesquisa.au)){
                cv = new ContentValues();
                cv.put("descricao",pesquisa.au);
                dbinsert.insert("Recentes",null,cv);
            }
            listar();
        }else{

            //navController.navigate(R.id.action_nav_home_to_resultado);
            Toast.makeText(vista.getContext(), "Nenhum elemento encontrado", Toast.LENGTH_LONG).show();
        }
    }

    public static String removerAcentos(String texto) {
        String textoSemAcentos = Normalizer.normalize(texto, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        textoSemAcentos = pattern.matcher(textoSemAcentos).replaceAll("");
        return textoSemAcentos;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
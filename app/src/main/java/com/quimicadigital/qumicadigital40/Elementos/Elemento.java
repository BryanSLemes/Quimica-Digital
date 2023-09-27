package com.quimicadigital.qumicadigital40.Elementos;

import static com.quimicadigital.qumicadigital40.ui.PesquisaPrincipal.removerAcentos;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.quimicadigital.qumicadigital40.R;
import com.quimicadigital.qumicadigital40.ui.PesquisaPrincipal;

import java.lang.reflect.Field;

public class Elemento extends AppCompatActivity {

    private TextView num_atomico;
    private TextView grupo;
    private TextView periodo;
    private TextView massa;
    private TextView ponto_fusao;
    private TextView ponto_ebulicao;
    private TextView estado;
    private TextView descricao;
    private TextView protons;
    private TextView eletrons;
    private TextView neutrons;
    private TextView diagrama;
    private TextView nox;
    private TextView icn_num;
    private TextView icn_nome;
    private TextView icn_simb;
    private TextView cmd_1;
    private TextView cmd_2;
    private TextView cmd_3;
    private TextView cmd_4;
    private TextView cmd_5;
    private TextView cmd_6;
    private TextView cmd_7;

    private ImageView imgElemento;
    private TableLayout tableLayout;
    private LinearLayout layout_info;

    private CRUD crud;
    private Diagrama diagram;
    private Intent intent;

    private int[] camadas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elemento);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        String hexColor = String.format("#%06X", (0xFFFFFF & ((ColorDrawable) findViewById(R.id.view_elementos).getBackground()).getColor()));
        tableLayout = findViewById(R.id.tableLayout);
        layout_info = findViewById(R.id.layout_informacoes);
        if(hexColor.equals("#B2D8EB")){
            tableLayout.setBackgroundResource(R.drawable.forma_borda_elemento_light);
            layout_info.setBackgroundResource(R.drawable.forma_borda_elemento_light_info);
        }
        crud = Pesquisa.getCrud();
        camadas = crud.camadas;
        diagram = new Diagrama(crud.num_atomico);
        getSupportActionBar().setTitle(crud.nome);

        int mas;
        mas = (int) crud.massa;
        if ((mas + 0.5) <= crud.massa) {
            mas = mas + 1;
        }
        //Obtendo valores para os TextViews
        num_atomico = (TextView) findViewById(R.id.txt_num_atomico);
        grupo = (TextView) findViewById(R.id.txt_grupo);
        periodo = (TextView) findViewById(R.id.txt_periodo);
        massa = (TextView) findViewById(R.id.txt_massa);
        ponto_fusao = (TextView) findViewById(R.id.txt_ponto_fusao);
        ponto_ebulicao = (TextView) findViewById(R.id.txt_ponto_ebulicao);
        estado= (TextView) findViewById(R.id.txt_estado);
        descricao = (TextView) findViewById(R.id.txt_descricao);
        protons = (TextView) findViewById(R.id.txt_protons);
        eletrons= (TextView) findViewById(R.id.txt_eletron);
        neutrons = (TextView) findViewById(R.id.txt_neutron);
        diagrama = (TextView) findViewById(R.id.txt_diagrama);
        nox = (TextView) findViewById(R.id.txt_nox);

        imgElemento = findViewById(R.id.img_elemento);

        icn_num = (TextView) findViewById(R.id.txt_num);
        icn_nome = (TextView) findViewById(R.id.txt_nom);
        icn_simb = (TextView) findViewById(R.id.txt_simb);

        cmd_1 = (TextView) findViewById(R.id.cmd_1);
        cmd_2 = (TextView) findViewById(R.id.cmd_2);
        cmd_3 = (TextView) findViewById(R.id.cmd_3);
        cmd_4 = (TextView) findViewById(R.id.cmd_4);
        cmd_5 = (TextView) findViewById(R.id.cmd_5);
        cmd_6 = (TextView) findViewById(R.id.cmd_6);
        cmd_7 = (TextView) findViewById(R.id.cmd_7);

        //Setando os valores dos TextViews
        num_atomico.setText(num_atomico.getText().toString() + crud.num_atomico);
        grupo.setText(grupo.getText().toString() + crud.grupo);
        periodo.setText(periodo.getText().toString() + crud.periodo);
        massa.setText(massa.getText().toString() + (crud.massa + "").replace(".",","));
        if(crud.ponto_fusao == 0.0){
            ponto_fusao.setText(ponto_fusao.getText().toString() + "???");
        }else {
            ponto_fusao.setText(ponto_fusao.getText().toString() + (crud.ponto_fusao + "").replace(".", ","));
        }
        if(crud.ponto_ebulicao == 0.0){
            ponto_ebulicao.setText(ponto_ebulicao.getText().toString() + "???");
        }else {
            ponto_ebulicao.setText(ponto_ebulicao.getText().toString() + (crud.ponto_ebulicao + "").replace(".", ","));
        }
        estado.setText(estado.getText().toString() + crud.estado);
        descricao.setText(descricao.getText().toString() + crud.descricao);
        protons.setText(protons.getText().toString() + crud.num_atomico);
        eletrons.setText(eletrons.getText().toString() + crud.num_atomico);
        neutrons.setText(neutrons.getText().toString() + (mas - crud.num_atomico));
        diagrama.setText(diagrama.getText().toString() + diagram.getDiagrama());
        for(int i=0;i < crud.nox.size();i++){
            nox.setText(nox.getText().toString() + "\n" + crud.noxtxt.get(i) + "\n"+"     Protons: "+ (crud.num_atomico) + "\n"+"     Eletrons: "+ (crud.num_atomico - crud.nox.get(i)));
        }

        imgElemento.setVisibility(View.GONE);

        icn_num.setText(crud.num_atomico + "");
        icn_nome.setText(crud.nome);
        icn_simb.setText(crud.simbolo);

        //Definir valor a imagem do elemento
        Field[] drawableFields = R.drawable.class.getDeclaredFields();
        for (Field field : drawableFields) {
            try {
                int resourceId = getResources().getIdentifier(field.getName(), "drawable", getPackageName());
                String resourceName = getResources().getResourceEntryName(resourceId);
                if(resourceName.equalsIgnoreCase(removerAcentos(crud.nome))){
                    imgElemento.setVisibility(View.VISIBLE);
                    imgElemento.setImageResource(resourceId);
                }
            } catch (Exception e) {
            }
        }

        cmd_1.setText(camadas[0] + "");
        cmd_2.setText(camadas[1] + "");
        cmd_3.setText(camadas[2] + "");
        cmd_4.setText(camadas[3] + "");
        cmd_5.setText(camadas[4] + "");
        cmd_6.setText(camadas[5] + "");
        cmd_7.setText(camadas[6] + "");
    }
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                finish();
                if(PesquisaPrincipal.pesquisa.anterior()){
                    intent = new Intent(this, Elemento.class);
                    startActivity(intent);
                    return true;
                }else{
                   return false;
                }
            case R.id.action_right:
                finish();
                if(PesquisaPrincipal.pesquisa.proximo()){
                    intent = new Intent(this, Elemento.class);
                    startActivity(intent);
                    return true;
                }else{
                    return false;
                }
        }
        return super.onOptionsItemSelected(menuItem);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        MenuItem rightItem = menu.findItem(R.id.action_right);
        rightItem.setIcon(R.drawable.icone_arrow);
        rightItem.setVisible(true);
        return true;
    }
}
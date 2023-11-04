package com.quimicadigital.qumicadigital40.ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.quimicadigital.qumicadigital40.Math.Base_contas;
import com.quimicadigital.qumicadigital40.Math.Grafico_funcao_segundo;
import com.quimicadigital.qumicadigital40.R;
import com.quimicadigital.qumicadigital40.databinding.FragmentLogicalMathBinding;

public class logical_math extends Fragment {

    private FragmentLogicalMathBinding binding;
    private Button btn_regra_tres;
    private Button btn_equacaoSegundo;
    private Button btn_funcao;
    private Button btn_funcaoSegundo;
    private Button btn_exponenciacao;
    private Button btn_teorema;
    private Button btn_grafico_segundo;
    private Button btn_vertice_segundo;
    private Button btn_progressao_aritmetica;
    private Button btn_progressao_geometrica;
    public static int selection;
    public static String title;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);}

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        btn_regra_tres = (Button) view.findViewById(R.id.btn_regra_tres);
        btn_equacaoSegundo = (Button) view.findViewById(R.id.btn_equacao_segundo);
        btn_funcao = (Button) view.findViewById(R.id.btn_funcao);
        btn_funcaoSegundo = (Button) view.findViewById(R.id.btn_funcao_segundo);
        btn_exponenciacao = (Button) view.findViewById(R.id.btn_expoente);
        btn_grafico_segundo = (Button) view.findViewById(R.id.btn_grafico_segundo);
        btn_vertice_segundo = (Button) view.findViewById(R.id.btn_vertice_funcao_segundo);
        btn_teorema = (Button) view.findViewById(R.id.btn_teorema);
        btn_progressao_aritmetica = (Button) view.findViewById(R.id.btn_progressao_aritmetica);
        btn_progressao_geometrica = (Button) view.findViewById(R.id.btn_progressao_geometrica);

        btn_regra_tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), Base_contas.class);
                startActivity(intent);
                selection = 1;
                title = "Regra de três simples";
            }});

        btn_equacaoSegundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), Base_contas.class);
                startActivity(intent);
                selection = 2;
                title = "Equação do 2º Grau";
            }});

        btn_funcao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), Base_contas.class);
                startActivity(intent);
                selection = 3;
                title = "Função do 1º Grau";
            }});

        btn_funcaoSegundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), Base_contas.class);
                startActivity(intent);
                selection = 4;
                title = "Função do 2º Grau";
            }});

        btn_grafico_segundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), Grafico_funcao_segundo.class);
                startActivity(intent);
                selection = 5;
                title = "Gráfico Função 2º Grau";
            }});

        btn_vertice_segundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), Base_contas.class);
                startActivity(intent);
                selection = 6;
                title = "Vértices Função 2º Grau";
            }});

        btn_teorema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), Base_contas.class);
                startActivity(intent);
                selection = 7;
                title = "Teorema de Pitágoras";
            }});

        btn_exponenciacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), Base_contas.class);
                startActivity(intent);
                selection = 8;
                title = "Exponenciação";
            }});

        btn_progressao_aritmetica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), Base_contas.class);
                startActivity(intent);
                selection = 9;
                title = "Progressão Aritmética";
            }});

        btn_progressao_geometrica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), Base_contas.class);
                startActivity(intent);
                selection = 10;
                title = "Progressão Geométrica";
            }});


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentLogicalMathBinding.inflate(inflater, container, false);

        View rootView = binding.getRoot();

        if (rootView != null) {
            Drawable backgroundDrawable = rootView.getBackground();
            if (backgroundDrawable instanceof ColorDrawable) {
                int backgroundColor = ((ColorDrawable) backgroundDrawable).getColor();
                String hexColor = String.format("#%06X", (0xFFFFFF & backgroundColor));
                if(hexColor.equals("#B2D8EB")){
                    binding.btnRegraTres.setBackgroundResource(R.drawable.forma_borda_elemento_light);

                }

            }
        }
        View root = binding.getRoot();
        return root;
    }
}
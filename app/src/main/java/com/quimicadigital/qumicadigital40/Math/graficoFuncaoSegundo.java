package com.quimicadigital.qumicadigital40.Math;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;
import java.util.List;

public class graficoFuncaoSegundo {

    private double x_2;
    private double x;
    private double c;
    private List<EditText> X;

    public void calcular(Button btn_calcular, EditText edt_x2, EditText edt_x, EditText edt_c,List<EditText> X ,List<TextView> Y){
        this.X = X;

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(valoresFuncao(edt_x2,edt_x,edt_c)){
                        if(x_2 != 0){
                            preencherY(Y);
                        }else{
                            Toast.makeText(edt_x2.getContext(), "X² não pode ser = 0", Toast.LENGTH_SHORT).show();
                        }
                    }
                }catch (Exception e){
                    Toast.makeText(edt_x2.getContext(), "Erro ao efetuar calculo", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void preencherY(List<TextView> Y){
        String[] numbers = {"₁","₂","₃","₄","₅"};
        int i = 0;
        for(TextView txt : Y){
            try {
                txt.setText("Y"+numbers[i]+":" + calcularFuncao(i));
            }catch (Exception e){
                txt.setText("Y"+numbers[i]+":");
            }
            i++;
        }

    }

    private String calcularFuncao(int i){
        DecimalFormat df = new DecimalFormat("#.##");
        double x = (valorEdt(i));
        double funcao = ((x * x) * x_2) + (x * this.x) + c;
        return df.format(funcao);
    }

    private double valorEdt(int i){
        return Double.parseDouble(String.valueOf(X.get(i).getText()));
    }

    private boolean valoresFuncao(EditText edt_x2, EditText edt_x, EditText edt_c){
        boolean retorno = true;
        if(!TryFuncao("x²",edt_x2)){
            retorno = false;
        }
        if(!TryFuncao("x",edt_x)){
            retorno = false;
        }
        if(!TryFuncao("c",edt_c)){
            retorno = false;
        }
        if(retorno){
            x_2 = Double.parseDouble(String.valueOf(edt_x2.getText()));
            x = Double.parseDouble(String.valueOf(edt_x.getText()));
            c = Double.parseDouble(String.valueOf(edt_c.getText()));
        }
        return retorno;
    }

    private boolean TryFuncao(String campo,EditText edt) {
        try {
            Double.parseDouble(String.valueOf(edt.getText()));
            return true;
        } catch (Exception e) {
            Toast.makeText(edt.getContext(), "Campo " + campo + " não foi preenchido corretamente", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}

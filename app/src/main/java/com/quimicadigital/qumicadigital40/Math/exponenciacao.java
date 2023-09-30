package com.quimicadigital.qumicadigital40.Math;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class exponenciacao {
    public void calcular(Button btn, TextView txt_title2, TextView txt1, TextView txt2, TextView txt3, TextView txt4, EditText edt1, EditText edt2, EditText edt3, EditText edt4, TextView resultado){
        txt_title2.setText("B - Base | E - Expoente");
        txt1.setText("B");
        txt2.setText("E");
        txt3.setVisibility(View.INVISIBLE);
        txt4.setVisibility(View.INVISIBLE);
        edt3.setVisibility(View.INVISIBLE);
        edt4.setVisibility(View.INVISIBLE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(String.valueOf(edt1.getText()).equals("")){
                        Toast.makeText(txt2.getContext(), "Campo B vazio!!!", Toast.LENGTH_SHORT).show();
                    }else if(String.valueOf(edt2.getText()).equals("")){
                        Toast.makeText(txt2.getContext(), "Campo E vazio!!!", Toast.LENGTH_SHORT).show();
                    }else if(!isInteger(String.valueOf(edt2.getText()))){
                        Toast.makeText(txt2.getContext(), "Preencha o campo \"E\" com um número inteiro.", Toast.LENGTH_SHORT).show();
                    }else if(!verifExponenciacao(String.valueOf(edt1.getText()),1,txt2)){
                    }else if(!verifExponenciacao(String.valueOf(edt2.getText()),2,txt2)){
                    }else {
                        DecimalFormat df = new DecimalFormat("#.##");
                        double base = Double.parseDouble(String.valueOf(edt1.getText()));
                        double expoente = Double.parseDouble(String.valueOf(edt2.getText()));
                        double result = Math.pow(base, expoente);

                        String txt_resultado = "Resultado:\n"+df.format(result);
                        resultado.setText(txt_resultado);
                    }
                }catch (Exception e){}}});
    }

    public static boolean verifExponenciacao(String numero,int id, TextView txt2) {
        try {
            double number = Double.parseDouble(numero);
            switch (id){
                case 1:
                    if(number > 1000.0){
                        Toast.makeText(txt2.getContext(), "Campo C contém um valor que ultrapassa o limite de: 1000.0", Toast.LENGTH_SHORT).show();
                        return false;
                    }
                    if(number < -1000.0){
                        Toast.makeText(txt2.getContext(), "Campo C contém um valor que é menor que o mínimo de: -1000.0", Toast.LENGTH_SHORT).show();
                        return false;
                    }
                    break;
                case 2:
                    if(number > 99.0){
                        Toast.makeText(txt2.getContext(), "Campo E contém um valor que ultrapassa o limite de: 99.0", Toast.LENGTH_SHORT).show();
                        return false;
                    }
                    if(number < -99.0){
                        Toast.makeText(txt2.getContext(), "Campo E contém um valor que é menor que o mínimo de: -99.0", Toast.LENGTH_SHORT).show();
                        return false;
                    }
                    break;
            }
            return true;
        } catch (NumberFormatException e) {
            Toast.makeText(txt2.getContext(), "Um dos campos possui um valor inválido!!!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public boolean isInteger(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

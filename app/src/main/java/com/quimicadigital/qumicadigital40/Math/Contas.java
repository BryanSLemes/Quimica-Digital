package com.quimicadigital.qumicadigital40.Math;

import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;

public class Contas {


    public Contas(int number, Button btn, TextView txt_title, TextView txt_title2, TextView txt1, TextView txt2, TextView txt3, TextView txt4, EditText edt1, EditText edt2, EditText edt3, EditText edt4,TextView resultado){

        switch(number){
            case 1:
                regraTres(btn,txt_title2,txt1,txt2,txt3,txt4,edt1,edt2,edt3,edt4, resultado);
                break;
            case 2:
                equacaosegundo(btn,txt_title2,txt1,txt2,txt3,txt4,edt1,edt2,edt3,edt4, resultado);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                verticeSegundo(btn,txt_title2,txt1,txt2,txt3,txt4,edt1,edt2,edt3,edt4, resultado);
                break;
            case 7:
                break;
            case 8:
                exponenciacao(btn,txt_title2,txt1,txt2,txt3,txt4,edt1,edt2,edt3,edt4, resultado);
                break;
        }
    }

    public void regraTres(Button btn,TextView txt_title2, TextView txt1, TextView txt2,TextView txt3, TextView txt4, EditText edt1, EditText edt2, EditText edt3, EditText edt4,TextView resultado){
        txt_title2.setVisibility(View.INVISIBLE);
        txt1.setText("X1");
        txt2.setText("X3");
        txt3.setText("=  X2");
        txt4.setText("=  X");
        edt4.setVisibility(View.INVISIBLE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(String.valueOf(edt1.getText()).equals("")){
                        Toast.makeText(txt2.getContext(), "Campo X1 vazio!!!", Toast.LENGTH_SHORT).show();
                    }else if(String.valueOf(edt3.getText()).equals("")){
                        Toast.makeText(txt2.getContext(), "Campo X2 vazio!!!", Toast.LENGTH_SHORT).show();
                    }else if(String.valueOf(edt2.getText()).equals("")){
                        Toast.makeText(txt2.getContext(), "Campo X3 vazio!!!", Toast.LENGTH_SHORT).show();
                    }else {
                        DecimalFormat df = new DecimalFormat("#.##");
                        double x1 = Double.parseDouble(String.valueOf(edt1.getText()));
                        double x2 = Double.parseDouble(String.valueOf(edt3.getText()));
                        double x3 = Double.parseDouble(String.valueOf(edt2.getText()));
                        resultado.setText("Resultado:\n" + df.format(x1) + "x = " + df.format(x2 * x3) + "\nx = " + df.format((x2 * x3) / x1));
                    }
                }catch (Exception e){}}});}

    public void equacaosegundo(Button btn,TextView txt_title2, TextView txt1, TextView txt2,TextView txt3, TextView txt4, EditText edt1, EditText edt2, EditText edt3, EditText edt4,TextView resultado){

        txt_title2.setText("A - X² | B - X | C - Número sem x");
        txt1.setText("A");
        txt2.setText("C");
        txt3.setText("B");
        txt4.setVisibility(View.INVISIBLE);
        edt4.setVisibility(View.INVISIBLE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(String.valueOf(edt1.getText()).equals("")){
                        Toast.makeText(txt2.getContext(), "Campo A vazio!!!", Toast.LENGTH_SHORT).show();
                    }else if(String.valueOf(edt3.getText()).equals("")){
                        Toast.makeText(txt2.getContext(), "Campo B vazio!!!", Toast.LENGTH_SHORT).show();
                    }else if(String.valueOf(edt2.getText()).equals("")){
                        Toast.makeText(txt2.getContext(), "Campo C vazio!!!", Toast.LENGTH_SHORT).show();
                    }else {
                        DecimalFormat df = new DecimalFormat("#.##");
                        double a = Double.parseDouble(String.valueOf(edt1.getText()));
                        double b = Double.parseDouble(String.valueOf(edt3.getText()));
                        double c = Double.parseDouble(String.valueOf(edt2.getText()));
                        double delta = (b * b) + (-4 * a * c);
                        String txt_resultado ="Resultado:\n\u25B2 = ("+df.format(b)+")² -4 * "+df.format(a)+" * "+df.format(c)+"\n\u25B2 = " + df.format(b*b)+" ";

                        if((-4 * a * c) > 0){
                            txt_resultado +="+";
                        }
                        txt_resultado+=df.format(-4 * a * c)+"\n\u25B2 = " + df.format(delta)+"\n\n";

                        if(delta < 0){
                            txt_resultado +="S = { }, não há solução real.";
                        }else{
                            txt_resultado +="X₁ = ("+df.format(b*-1.0)+" ";
                            if((Math.sqrt(delta)) > 0){
                                txt_resultado +="+";
                            }
                            txt_resultado +=df.format(Math.sqrt(delta))+")/"+df.format(2.0*a)+" = " + df.format((b*-1.0) + Math.sqrt(delta))+"/"+ df.format(2.0*a) +" = " + df.format(((b*-1.0) + Math.sqrt(delta))/(2.0*a))+"\n\n";

                            txt_resultado +="X₂ = ("+df.format(b*-1.0)+" ";
                            if((Math.sqrt(delta)*-1.0) > 0){
                                txt_resultado +="+";
                            }
                            txt_resultado +=df.format((Math.sqrt(delta)*-1.0))+")/"+df.format(2.0*a)+" = " + df.format((b*-1.0) + (Math.sqrt(delta))*-1.0)+"/"+ df.format(2.0*a) +" = " + df.format((((b*-1.0) + (Math.sqrt(delta)*-1.0)))/(2.0*a));
                        }
                        resultado.setText(txt_resultado);
                    }
                }catch (Exception e){}}});}

    public void verticeSegundo(Button btn,TextView txt_title2, TextView txt1, TextView txt2,TextView txt3, TextView txt4, EditText edt1, EditText edt2, EditText edt3, EditText edt4,TextView resultado){
        txt_title2.setText("A - X² | B - X | C - Número sem x");
        txt1.setText("A");
        txt2.setText("C");
        txt3.setText("B");
        txt4.setVisibility(View.INVISIBLE);
        edt4.setVisibility(View.INVISIBLE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(String.valueOf(edt1.getText()).equals("")){
                        Toast.makeText(txt2.getContext(), "Campo A vazio!!!", Toast.LENGTH_SHORT).show();
                    }else if(String.valueOf(edt3.getText()).equals("")){
                        Toast.makeText(txt2.getContext(), "Campo B vazio!!!", Toast.LENGTH_SHORT).show();
                    }else if(String.valueOf(edt2.getText()).equals("")){
                        Toast.makeText(txt2.getContext(), "Campo C vazio!!!", Toast.LENGTH_SHORT).show();
                    }else {
                        DecimalFormat df = new DecimalFormat("#.##");
                        double a = Double.parseDouble(String.valueOf(edt1.getText()));
                        double b = Double.parseDouble(String.valueOf(edt3.getText()));
                        double c = Double.parseDouble(String.valueOf(edt2.getText()));

                        String txt_resultado ="Resultado:\n";

                        //Xv = -b / 2a;  Yv = -▲ / 4a

                        resultado.setText(txt_resultado);
                    }
                }catch (Exception e){}}});}




    public void exponenciacao(Button btn,TextView txt_title2, TextView txt1, TextView txt2,TextView txt3, TextView txt4, EditText edt1, EditText edt2, EditText edt3, EditText edt4,TextView resultado){
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
                }catch (Exception e){}}});}




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

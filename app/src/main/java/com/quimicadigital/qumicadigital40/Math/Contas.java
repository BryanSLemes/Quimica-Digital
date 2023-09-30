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
                verticeSegundo(btn,txt_title,txt_title2,txt1,txt2,txt3,txt4,edt1,edt2,edt3,edt4, resultado);
                break;
            case 7:
                teorema(btn,txt_title,txt_title2,txt1,txt2,txt3,txt4,edt1,edt2,edt3,edt4, resultado);
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

    public void verticeSegundo(Button btn,TextView txt_title,TextView txt_title2, TextView txt1, TextView txt2,TextView txt3, TextView txt4, EditText edt1, EditText edt2, EditText edt3, EditText edt4,TextView resultado){
        txt_title.setText("Resolução:\nXv = -b/2a  |  Yv = -\u25B2/4a");
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
                        double xv = (b*-1.0) /(2.0 * a);
                        double yv = (delta * -1.0) / (4.0*a);

                        String txt_resultado ="Resultado:\n";

                        txt_resultado+="Xv = " +df.format(b * -1.0) +" / "+df.format(2.0*a)+";\n";
                        txt_resultado+="Yv = " +df.format(delta * -1.0) +" / "+df.format(4.0*a)+";\n";
                        txt_resultado+="Xv = "+df.format(xv)+"\nYv = "+df.format(yv);

                        resultado.setText(txt_resultado);
                    }
                }catch (Exception e){}}});}

    public void teorema(Button btn,TextView txt_title,TextView txt_title2, TextView txt1, TextView txt2,TextView txt3, TextView txt4, EditText edt1, EditText edt2, EditText edt3, EditText edt4,TextView resultado){
        txt_title.setText("Resolução:\nH² = C² + C²");
        txt_title2.setText("H - Hipotenusa | C - Cateto");
        txt1.setText("H²");
        txt2.setText("C²");
        txt3.setText("C²");
        txt4.setVisibility(View.INVISIBLE);
        edt4.setVisibility(View.INVISIBLE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int contagem = 0;
                    if(!vazio(edt1)) {
                        contagem = contagem + 1;
                    }
                    if(!vazio(edt2)){
                        contagem = contagem +1;
                    }
                    if(!vazio(edt3)){
                        contagem = contagem +1;
                    }

                    switch (contagem){
                        case 0:
                            Toast.makeText(txt2.getContext(), "Todos os campos estão vazios!!!", Toast.LENGTH_SHORT).show();
                            break;
                        case 1:
                            Toast.makeText(txt2.getContext(), "Preencha pelo menos 2 campos.", Toast.LENGTH_SHORT).show();
                            break;
                        case 3:
                            Toast.makeText(txt2.getContext(), "Preencha no máximo até dois campos.", Toast.LENGTH_SHORT).show();
                            break;
                        case 2:
                            DecimalFormat df = new DecimalFormat("#.##");
                            String txt_resultado ="Resultado:\n";

                            if(vazio(edt1)){
                                if(maiorZero(edt3,edt2)){
                                    double c1 = Double.parseDouble(String.valueOf(edt3.getText()));
                                    double c2 = Double.parseDouble(String.valueOf(edt2.getText()));
                                    double h = Math.sqrt((c1 * c1) + (c2 * c2));
                                    txt_resultado+="H² = "+df.format(c1)+"² + "+df.format(c2)+"²\nH² = " + df.format(h);
                                    if(!isInteger(h)){
                                        txt_resultado+=" ou \u221A"+df.format((c1*c1) + (c2*c2));
                                    }
                                }
                            }else if(vazio(edt2)){
                                if(maiorZero(edt1,edt3)){
                                    double h = Double.parseDouble(String.valueOf(edt1.getText()));
                                    double c = Double.parseDouble(String.valueOf(edt3.getText()));
                                    double c2 = (h*h)+(c*c*-1.0);

                                    if(c >= h){
                                        Toast.makeText(txt2.getContext(), "Um cateto não pode ser maior que a hipotenusa!!!", Toast.LENGTH_SHORT).show();
                                    }else {
                                        txt_resultado += "C² = " + df.format(h) + "² - (" + df.format(c) + "²)\n";
                                        txt_resultado += "C² = " + df.format(h * h) + " ";
                                        if ((c * -1.0) > 0) {
                                            txt_resultado += "+";
                                        }
                                        txt_resultado += df.format((c * c) * -1.0);
                                        txt_resultado += "\nC² = " + df.format(c2);
                                        txt_resultado += "\nC = " + df.format(Math.sqrt(c2));
                                        if (!isInteger(Math.sqrt(c2))) {
                                            txt_resultado += " ou \u221A" + df.format(c2);
                                        }
                                    }
                                }
                            }else if(vazio(edt3)){
                                if(maiorZero(edt1,edt2)){
                                    double h = Double.parseDouble(String.valueOf(edt1.getText()));
                                    double c = Double.parseDouble(String.valueOf(edt2.getText()));
                                    double c2 = (h*h)+(c*c*-1.0);

                                    if(c >= h){
                                        Toast.makeText(txt2.getContext(), "Um cateto não pode ser maior que a hipotenusa!!!", Toast.LENGTH_SHORT).show();
                                    }else {
                                        txt_resultado += "C² = " + df.format(h) + "² - (" + df.format(c) + "²)\n";
                                        txt_resultado += "C² = " + df.format(h * h) + " ";
                                        if ((c * -1.0) > 0) {
                                            txt_resultado += "+";
                                        }
                                        txt_resultado += df.format((c * c) * -1.0);
                                        txt_resultado += "\nC² = " + df.format(c2);
                                        txt_resultado += "\nC = " + df.format(Math.sqrt(c2));
                                        if (!isInteger(Math.sqrt(c2))) {
                                            txt_resultado += " ou \u221A" + df.format(c2);
                                        }
                                    }
                                }
                            }
                            resultado.setText(txt_resultado);
                            break;
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

    public boolean vazio(TextView txt){
        String texto = String.valueOf(txt.getText());
        if(texto.equals("")){
            return true;
        }
        return false;
    }

    public boolean maiorZero(TextView textView,TextView textView2){
        Double txt = Double.parseDouble(String.valueOf(textView.getText()));
        Double txt2 = Double.parseDouble(String.valueOf(textView2.getText()));
        if(txt > 0.0 && txt2 > 0.0 ){
            return true;
        }
        Toast.makeText(textView.getContext(), "Valores negativos não são permitidos nos campos!!!", Toast.LENGTH_SHORT).show();
        return false;
    }

    public boolean isInteger(double numero) {
        String numeroString = Double.toString(numero);
        String[] partes = numeroString.split("\\.");
        if (partes.length == 2) {
            return partes[1].matches("0*");
        } else {
            return true;
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

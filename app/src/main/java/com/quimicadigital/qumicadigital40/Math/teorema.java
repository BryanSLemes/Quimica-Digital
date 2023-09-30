package com.quimicadigital.qumicadigital40.Math;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;

public class teorema {
    public void calcular(Button btn, TextView txt_title, TextView txt_title2, TextView txt1, TextView txt2, TextView txt3, TextView txt4, EditText edt1, EditText edt2, EditText edt3, EditText edt4, TextView resultado){
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
                                    txt_resultado+="H² = "+df.format(c1)+"² + "+df.format(c2)+"²\nH = " + df.format(h);
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
                }catch (Exception e){}}});
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
}

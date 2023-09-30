package com.quimicadigital.qumicadigital40.Math;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class equacaoSegundo {

    public void calcular(Button btn, TextView txt_title2, TextView txt1, TextView txt2, TextView txt3, TextView txt4, EditText edt1, EditText edt2, EditText edt3, EditText edt4, TextView resultado){
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
                }catch (Exception e){}}});
    }
}

package com.quimicadigital.qumicadigital40.Math;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;

public class funcaoPrimeiro {

    public void calcular(Button btn,TextView txt_title, TextView txt_title2, TextView txt1, TextView txt2, TextView txt3, TextView txt4, EditText edt1, EditText edt2, EditText edt3, EditText edt4, TextView resultado){
        txt_title.setText("Resolução:\nf(x) = ax + b");
        txt_title2.setText("A - coeficiente multiplicado por x |\nB - termo independente |\nX - número variável");
        txt1.setText("A");
        txt2.setText("X");
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
                        Toast.makeText(txt2.getContext(), "Campo X vazio!!!", Toast.LENGTH_SHORT).show();
                    }else {
                        DecimalFormat df = new DecimalFormat("#.##");
                        double a = Double.parseDouble(String.valueOf(edt1.getText()));
                        double x = Double.parseDouble(String.valueOf(edt2.getText()));
                        double b = Double.parseDouble(String.valueOf(edt3.getText()));

                        String txt_resultado = "Resultado:\ny = ("+df.format(a)+" . "+df.format(x)+") ";
                        if (b>0.0){
                            txt_resultado+="+";
                        }
                        txt_resultado+=b+")\n";
                        txt_resultado+="y = "+df.format((a*x) + b);
                        resultado.setText(txt_resultado);
                    }
                }catch (Exception e){}}});
    }
}

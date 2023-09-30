package com.quimicadigital.qumicadigital40.Math;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class verticeSegundo {

    public void calcular(Button btn, TextView txt_title, TextView txt_title2, TextView txt1, TextView txt2, TextView txt3, TextView txt4, EditText edt1, EditText edt2, EditText edt3, EditText edt4, TextView resultado){
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
                }catch (Exception e){}}});
    }
}

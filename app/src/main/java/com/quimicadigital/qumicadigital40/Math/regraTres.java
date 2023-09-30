package com.quimicadigital.qumicadigital40.Math;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class regraTres {

    public void calcular(Button btn,TextView txt_title2, TextView txt1, TextView txt2,TextView txt3, TextView txt4, EditText edt1, EditText edt2, EditText edt3, EditText edt4,TextView resultado) {
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
                }catch (Exception e){}}});
    }
}

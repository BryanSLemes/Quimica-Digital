package com.quimicadigital.qumicadigital40.Math;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Contas {


    public Contas(int number, Button btn, TextView txt_title, TextView txt_title2, TextView txt1, TextView txt2, TextView txt3, TextView txt4, TextView txt5, EditText edt1, EditText edt2, EditText edt3, EditText edt4,EditText edt5,TextView resultado){
        txt5.setVisibility(View.INVISIBLE);
        edt5.setVisibility(View.INVISIBLE);
        switch(number){
            case 1:
                new regraTres().calcular(btn,txt_title2,txt1,txt2,txt3,txt4,edt1,edt2,edt3,edt4, resultado);
                break;
            case 2:
                new equacaoSegundo().calcular(btn,txt_title2,txt1,txt2,txt3,txt4,edt1,edt2,edt3,edt4, resultado);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                new verticeSegundo().calcular(btn,txt_title,txt_title2,txt1,txt2,txt3,txt4,edt1,edt2,edt3,edt4, resultado);
                break;
            case 7:
                new teorema().calcular(btn,txt_title,txt_title2,txt1,txt2,txt3,txt4,edt1,edt2,edt3,edt4, resultado);
                break;
            case 8:
                new exponenciacao().calcular(btn,txt_title2,txt1,txt2,txt3,txt4,edt1,edt2,edt3,edt4, resultado);
                break;
            case 9:
                new progressao_aritmetica().calcular(btn,txt_title,txt_title2,txt1,txt2,txt3,txt4,txt5,edt1,edt2,edt3,edt4,edt5, resultado);
                break;
        }
    }
}

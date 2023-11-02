package com.quimicadigital.qumicadigital40.Math;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import java.text.DecimalFormat;

public class progressao_aritmetica {
    public void calcular(Button btn, TextView txt_title, TextView txt_title2, TextView txt1, TextView txt2, TextView txt3, TextView txt4, TextView txt5, EditText edt1, EditText edt2, EditText edt3, EditText edt4, EditText edt5, TextView resultado){
        txt_title.setText("Resolução:\nan = a₁ + (n -1).r\nSn = ((a₁ + an).n)/2");
        txt_title2.setText("a₁ - 1º termo | r - razão |\nan - Termo desejado |\nSn - Soma dos termos |\nn - número de termos");
        txt1.setText("an");
        txt2.setText("a₁");
        txt3.setText("r");
        txt4.setText("n");
        txt5.setText("Sn");
        txt5.setVisibility(View.VISIBLE);
        edt5.setVisibility(View.VISIBLE);
        txt5.setText("Sn");

        ViewGroup.LayoutParams params = resultado.getLayoutParams();
        if (params instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginParams = (ViewGroup.MarginLayoutParams) params;
            marginParams.topMargin = 200;
            resultado.setLayoutParams(marginParams);
        } else {
            ViewGroup.MarginLayoutParams newMarginParams = new ViewGroup.MarginLayoutParams(params);
            newMarginParams.topMargin = 200;
            resultado.setLayoutParams(newMarginParams);
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
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
                    if(!vazio(edt4)){
                        contagem = contagem +1;
                    }
                    if(!vazio(edt5)){
                        contagem = contagem +1;
                    }
                    switch (contagem){
                        case 0:
                            Toast.makeText(txt2.getContext(), "Todos os campos estão vazios!!!", Toast.LENGTH_SHORT).show();
                            break;
                        case 1:
                            Toast.makeText(txt2.getContext(), "Para calcular r informe apenas 3 destes campos an, a1, r ou n.", Toast.LENGTH_LONG).show();
                            Toast.makeText(txt2.getContext(), "Para calcular Sn informe apenas 3 destes campos an, a1, sn ou n.", Toast.LENGTH_LONG).show();
                            break;
                        case 2:
                            Toast.makeText(edt1.getContext(), "Para calcular r informe apenas 3 destes campos an, a1, r ou n.", Toast.LENGTH_LONG).show();
                            Toast.makeText(edt1.getContext(), "Para calcular Sn informe apenas 3 destes campos an, a1, sn ou n.", Toast.LENGTH_LONG).show();
                            break;
                        case 3:
                            if(vazio(edt3) && vazio(edt5)){
                                Dialog(edt1.getContext(),edt1,edt2,edt3,edt4,edt5,resultado);
                            }else if(vazio(edt1) && vazio(edt5)){
                                calcularTermo(edt1,edt2,edt3,edt4,resultado,1);
                            }else if(vazio(edt2) && vazio(edt5)){
                                calcularTermo(edt1,edt2,edt3,edt4,resultado,3);
                            }else if(vazio(edt4) && vazio(edt5)){
                                calcularTermo(edt1,edt2,edt3,edt4,resultado,4);
                            }else if(vazio(edt1) && vazio(edt3)){
                                calcularSomaTermos(edt1,edt2,edt4,edt5,resultado,1);
                            }else if(vazio(edt2) && vazio(edt3)){
                                calcularSomaTermos(edt1,edt2,edt4,edt5,resultado,3);
                            }else if(vazio(edt4) && vazio(edt3)){
                                calcularSomaTermos(edt1,edt2,edt4,edt5,resultado,4);
                            }
                            break;
                        default:
                            Toast.makeText(txt2.getContext(), "Preencha no máximo até três campos.", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }catch (Exception e){}}});
    }

    public void calcularTermo(EditText edt1,EditText edt2,EditText edt3,EditText edt4,TextView resultado, int escolha){
        DecimalFormat df = new DecimalFormat("#.##");
        String txt_resultado ="Resultado:\n";
        Double a1,an,r,n;

        switch (escolha){
            case 1:
                a1 = Double.parseDouble(String.valueOf(edt2.getText()));
                r = Double.parseDouble(String.valueOf(edt3.getText()));
                n = Double.parseDouble(String.valueOf(edt4.getText()));

                txt_resultado+="an = "+ df.format(a1) + " ";
                if(n > 0.0){
                    txt_resultado+="+";
                }
                txt_resultado+=df.format(n) +" . "+df.format(r)+"\n";

                txt_resultado+="an = "+ df.format(a1) +" ";
                if((n*r) > 0.0){
                    txt_resultado+="+";
                }
                txt_resultado+=df.format(n*r)+"\n";
                txt_resultado+="an = " +df.format(a1 + (n*r));
                break;
            case 2:
                an = Double.parseDouble(String.valueOf(edt1.getText()));
                a1 = Double.parseDouble(String.valueOf(edt2.getText()));
                n = Double.parseDouble(String.valueOf(edt4.getText())) -1;

                txt_resultado+="r = ("+ df.format(an) + " ";
                if((a1*-1.0) > 0.0){
                    txt_resultado+="+";
                }
                txt_resultado+=df.format(a1*-1.0) +") / "+df.format(n)+"\n";
                txt_resultado+="r = "+ df.format((a1*-1.0) + an ) +" / " + df.format(n)+"\n";
                txt_resultado+="r = " +df.format(((a1*-1.0) + an ) / n);
                break;
            case 3:
                an = Double.parseDouble(String.valueOf(edt1.getText()));
                r = Double.parseDouble(String.valueOf(edt3.getText()));
                n = Double.parseDouble(String.valueOf(edt4.getText()));
                a1 = an + (n*r*-1.0);

                txt_resultado+="a₁ = "+ df.format(an) + " -("+n+" . "+r+")\n";
                txt_resultado+="a₁ = "+ df.format(an) +" ";
                if((n*r*-1.0) > 0.0){
                    txt_resultado+="+";
                }
                txt_resultado+=df.format(n*r*-1.0)+"\n";
                txt_resultado+="a₁ = " +df.format(a1);
                break;
            case 4:
                an = Double.parseDouble(String.valueOf(edt1.getText()));
                a1 = Double.parseDouble(String.valueOf(edt2.getText()));
                r = Double.parseDouble(String.valueOf(edt3.getText()));
                n = (an + (a1*-1.0)) / r;

                txt_resultado+="n = ("+ df.format(an) + " ";
                if((a1*-1.0) >0.0){
                    txt_resultado+="+";
                }
                txt_resultado+=(a1*-1.0)+") / "+df.format(r) + "\n";
                txt_resultado+="n = "+ df.format(an-(a1)) +" / "+df.format(r)+"\n";
                txt_resultado+="n = " +df.format(n);
                break;
        }
        resultado.setText(txt_resultado);
    }

    public void calcularSomaTermos(EditText edt1,EditText edt2,EditText edt4,EditText edt5,TextView resultado, int escolha){
        DecimalFormat df = new DecimalFormat("#.##");
        String txt_resultado ="Resultado:\n";
        Double a1,an,sn,n;

        switch (escolha){
            case 1:
                a1 = Double.parseDouble(String.valueOf(edt2.getText()));
                n = Double.parseDouble(String.valueOf(edt4.getText()));
                sn = Double.parseDouble(String.valueOf(edt5.getText()));
                an = (sn -(a1*n/2.0)) / (n/2.0);

                txt_resultado+=df.format(n/2.0)+"an = "+ df.format(sn) +" ";
                if((a1*n/2.0*-1.0) > 0.0){
                    txt_resultado+="+";
                }
                txt_resultado+=(a1*n/2.0*-1.0)+ "\n";
                txt_resultado+="an = "+ df.format(sn -(a1*n/2.0)) +" / " + (n/2.0)+"\n";
                txt_resultado+="an = " +df.format(an);
                break;
            case 2:
                an = Double.parseDouble(String.valueOf(edt1.getText()));
                a1 = Double.parseDouble(String.valueOf(edt2.getText()));
                n = Double.parseDouble(String.valueOf(edt4.getText()));
                sn = ((a1 + an)*n)/2;

                txt_resultado+="Sn = (("+ df.format(a1)+" ";
                if (an > 0.0){
                    txt_resultado+="+";
                }
                txt_resultado+=df.format(an) +") . " +n+") / 2\n";
                txt_resultado+="Sn = ("+ df.format(a1 + an) +" . "+df.format(n)+") / 2\n";
                txt_resultado+="Sn = " +df.format(sn);
                break;
            case 3:
                an = Double.parseDouble(String.valueOf(edt1.getText()));
                n = Double.parseDouble(String.valueOf(edt4.getText()));
                sn = Double.parseDouble(String.valueOf(edt5.getText()));
                a1 = (sn -(an*n/2.0)) / (n/2.0);

                txt_resultado+=df.format(n/2.0)+"a₁ = "+ df.format(sn) +" ";
                if((an*n/2.0*-1.0) > 0.0){
                    txt_resultado+="+";
                }
                txt_resultado+=(an*n/2.0*-1.0)+ "\n";
                txt_resultado+="a₁ = "+ df.format(sn -(an*n/2.0)) +" / " + (n/2.0)+"\n";
                txt_resultado+="a₁ = " +df.format(a1);
                break;
            case 4:
                an = Double.parseDouble(String.valueOf(edt1.getText()));
                a1 = Double.parseDouble(String.valueOf(edt2.getText()));
                sn = Double.parseDouble(String.valueOf(edt5.getText()));
                n = (sn * 2.0) / (a1 + an);

                txt_resultado+=df.format(a1+an)+"n = "+ df.format(sn) + " . 2.0\n";
                txt_resultado+="n = "+ df.format((sn*2.0)) +" / "+df.format(a1+an)+"\n";
                txt_resultado+="n = " +df.format(n);
                break;
        }
        resultado.setText(txt_resultado);
    }

    public boolean vazio(TextView txt){
        String texto = String.valueOf(txt.getText()).replace("-","").replace(".","");
        if(texto.equals("")){
            return true;
        }
        return false;
    }

    public void Dialog(Context context,EditText edt1,EditText edt2,EditText edt3,EditText edt4,EditText edt5,TextView resultado) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setTitle("Escolha: ");
        builder.setMessage("Escolha uma das incognitas à calcular:");

        builder.setPositiveButton("Razão", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                calcularTermo(edt1,edt2,edt3,edt4,resultado,2);
                dialog.dismiss();
            }
        });

        builder.setNegativeButton("Soma dos termos", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                calcularSomaTermos(edt1,edt2,edt4,edt5,resultado,2);
                dialog.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}

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

public class progressao_geometrica {

    public void calcular(Button btn, TextView txt_title, TextView txt_title2, TextView txt1, TextView txt2, TextView txt3, TextView txt4, TextView txt5, EditText edt1, EditText edt2, EditText edt3, EditText edt4, EditText edt5, TextView resultado){
        txt_title.setText("Resolução:\nan = a₁ . q⁽ⁿ⁻¹⁾\nSn = (a₁ . (qⁿ - 1))/q - 1");//⁽ⁿ⁻¹⁾
        txt_title2.setText("a₁ - 1º termo | q - razão |\nan - Termo desejado |\nSn - Soma dos termos |\nn - número de termos");
        txt1.setText("an");
        txt2.setText("a₁");
        txt3.setText("q");
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
                            Toast.makeText(txt2.getContext(), "Para calcular q informe apenas 3 destes campos an, a1, q ou n.", Toast.LENGTH_LONG).show();
                            Toast.makeText(txt2.getContext(), "Para calcular Sn informe apenas 3 destes campos an, a1, sn ou n.", Toast.LENGTH_LONG).show();
                            break;
                        case 2:
                            Toast.makeText(edt1.getContext(), "Para calcular q informe apenas 3 destes campos an, a1, q ou n.", Toast.LENGTH_LONG).show();
                            Toast.makeText(edt1.getContext(), "Para calcular Sn informe apenas 3 destes campos an, a1, sn ou n.", Toast.LENGTH_LONG).show();
                            break;
                        case 3:
                            if(vazio(edt1) && vazio(edt5)){
                                Dialog(edt1.getContext(),edt1,edt2,edt3,edt4,edt5,resultado);//calcular sn ao an perguntando qual prefere com o diálogo
                            }else if(vazio(edt3) && vazio(edt5)){
                                calcularTermo(edt1,edt2,edt3,edt4,resultado,2);//calcular q com formula an
                            }else if(vazio(edt2) && vazio(edt5)){
                                calcularTermo(edt1,edt2,edt3,edt4,resultado,3);//calcular a1 com formula an
                            }else if(vazio(edt4) && vazio(edt5)){
                                calcularTermo(edt1,edt2,edt3,edt4,resultado,4);//calcular n com formula an
                            }else if(vazio(edt1) && vazio(edt3)){
                                calcularSomaTermos(edt3,edt2,edt4,edt5,resultado,1);//calcular q com formula sn
                            }else if(vazio(edt1) && vazio(edt2)){
                                calcularSomaTermos(edt3,edt2,edt4,edt5,resultado,3);//calcular a1 com formula sn
                            }else if(vazio(edt1) && vazio(edt4)){
                                calcularSomaTermos(edt3,edt2,edt4,edt5,resultado,4);//calcular n com formula sn
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
        Double a1,an,q,n;

        switch (escolha){
            case 1://finished
                a1 = Double.parseDouble(String.valueOf(edt2.getText()));
                q = Double.parseDouble(String.valueOf(edt3.getText()));
                n = Double.parseDouble(String.valueOf(edt4.getText()));

                txt_resultado+="an = "+ df.format(a1) + " . " + df.format(q) +"⁽"+numRaiz(n)+" ⁻¹⁾\n";
                txt_resultado+="an = "+ df.format(a1) + " . " + df.format(Math.pow(q,(n-1))) +"\n";
                txt_resultado+="an = "+ df.format(a1 * (Math.pow(q,(n-1))));
                break;
            case 2://finished
                an = Double.parseDouble(String.valueOf(edt1.getText()));
                a1 = Double.parseDouble(String.valueOf(edt2.getText()));
                n = Double.parseDouble(String.valueOf(edt4.getText()));

                txt_resultado+="q = "+numRaiz(n-1)+"√"+df.format(an) +" / " + df.format(a1)+"\n";
                txt_resultado+="q = "+numRaiz(n-1)+"√"+df.format(an/a1)+"\n";
                txt_resultado+="q = "+df.format(Math.pow((an/a1),1.0/(n-1)))+"\n";
                break;
            case 3://finished
                an = Double.parseDouble(String.valueOf(edt1.getText()));
                q = Double.parseDouble(String.valueOf(edt3.getText()));
                n = Double.parseDouble(String.valueOf(edt4.getText()));

                txt_resultado+="a₁ = "+ df.format(an) + " / "+df.format(q)+"⁽"+numRaiz(n-1)+"⁾\n";
                txt_resultado+="a₁ = "+ df.format(an) + " / "+df.format(Math.pow(q,(n-1)))+"\n";
                txt_resultado+="a₁ = "+ df.format(an / Math.pow(q,(n-1)));
                break;
            case 4://finished
                an = Double.parseDouble(String.valueOf(edt1.getText()));
                a1 = Double.parseDouble(String.valueOf(edt2.getText()));
                q = Double.parseDouble(String.valueOf(edt3.getText()));

                if((an/a1) <=0){
                    Toast.makeText(edt1.getContext(), "Não é possível calcular n pois an/a₁ é menor que zero", Toast.LENGTH_LONG).show();
                }else if(q <=0){
                    Toast.makeText(edt1.getContext(), "Não é possível calcular n pois q é menor que zero", Toast.LENGTH_LONG).show();
                }else{
                    n = encontrarExpoente((an/a1),q) +1;

                    txt_resultado+= df.format(an)+" / "+df.format(a1) +" = "+df.format(q)+"⁽ⁿ⁻¹⁾\n";
                    txt_resultado+= df.format(an/a1)+" = "+df.format(q)+"⁽ⁿ⁻¹⁾\n";
                    txt_resultado+= "n = " + df.format(n);
                }
                break;
        }
        resultado.setText(txt_resultado);
    }

    public void calcularSomaTermos(EditText edt3,EditText edt2,EditText edt4,EditText edt5,TextView resultado, int escolha){
        DecimalFormat df = new DecimalFormat("#.##");
        String txt_resultado ="Resultado:\n";
        Double a1,sn,n,q;

        switch (escolha){
            case 1://finished
                a1 = Double.parseDouble(String.valueOf(edt2.getText()));
                n = Double.parseDouble(String.valueOf(edt4.getText()));
                sn = Double.parseDouble(String.valueOf(edt5.getText()));
                double total = 0.00;

                for (q = 0.00; total < sn; q += 0.01) {
                    total = (a1 * (Math.pow(q, n) - 1)) / (q - 1);
                }

                txt_resultado+= "q = " + df.format(q)+"\nobs: não existe uma fórmula para calcular o q de uma pg através da fórmula sn, este valor é um valor aproximado";
                break;
            case 2://finished
                a1 = Double.parseDouble(String.valueOf(edt2.getText()));
                n = Double.parseDouble(String.valueOf(edt4.getText()));
                q = Double.parseDouble(String.valueOf(edt3.getText()));

                txt_resultado+="Sn = ("+ df.format(a1)+" . ("+df.format(q)+numRaiz(n)+" -1))/("+df.format(q)+" -1)\n";
                txt_resultado+="Sn = ("+ df.format(a1)+" . "+df.format(Math.pow(q,(n)) -1)+")/("+df.format(q-1)+")\n";
                txt_resultado+="Sn = "+ df.format(a1 * (Math.pow(q,(n)) -1))+"/"+df.format(q-1)+"\n";
                txt_resultado+="Sn = "+ df.format((a1 * (Math.pow(q,(n)) -1)) / (q-1));
                break;
            case 3://finished
                q = Double.parseDouble(String.valueOf(edt3.getText()));
                n = Double.parseDouble(String.valueOf(edt4.getText()));
                sn = Double.parseDouble(String.valueOf(edt5.getText()));

                txt_resultado+="a₁ = (("+ df.format(sn)+" . "+df.format(q-1)+") / ("+df.format(q)+numRaiz(n) + " -1))\n";
                txt_resultado+="a₁ = "+ df.format(sn*(q-1)) + " / "+df.format(Math.pow(q,n) -1)+"\n";
                txt_resultado+="a₁ = "+ df.format((sn*(q-1))/(Math.pow(q,n) -1));
                break;
            case 4://finished
                q = Double.parseDouble(String.valueOf(edt3.getText()));
                a1 = Double.parseDouble(String.valueOf(edt2.getText()));
                sn = Double.parseDouble(String.valueOf(edt5.getText()));

                txt_resultado+=df.format(a1)+" . ("+df.format(q)+"ⁿ -1) = "+df.format(sn)+" . "+df.format(q-1)+"\n";
                txt_resultado+=df.format(q)+"ⁿ = ("+df.format(sn * (q-1))+" / "+df.format(a1)+ ") +1\n";
                txt_resultado+=df.format(q)+"ⁿ = "+df.format((sn * (q-1) )/a1)+" +1\n";
                txt_resultado+="n = "+df.format(encontrarExpoente(((sn * (q-1) )/a1),q));
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

    public void Dialog(Context context, EditText edt1, EditText edt2, EditText edt3, EditText edt4, EditText edt5, TextView resultado) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setTitle("Escolha: ");
        builder.setMessage("Escolha uma das incognitas à calcular:");

        builder.setPositiveButton("AN", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                calcularTermo(edt1,edt2,edt3,edt4,resultado,1);
                dialog.dismiss();
            }
        });

        builder.setNegativeButton("Soma dos termos", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                calcularSomaTermos(edt3,edt2,edt4,edt5,resultado,2);
                dialog.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public String numRaiz(double num) {
        String numero = Double.toString(num);
        StringBuilder resultado = new StringBuilder();

        for (char digito : numero.toCharArray()) {
            if (Character.isDigit(digito)) {
                switch (digito) {
                    case '0':
                        resultado.append('⁰');
                        break;
                    case '1':
                        resultado.append('¹');
                        break;
                    case '2':
                        resultado.append('²');
                        break;
                    case '3':
                        resultado.append('³');
                        break;
                    case '4':
                        resultado.append('⁴');
                        break;
                    case '5':
                        resultado.append('⁵');
                        break;
                    case '6':
                        resultado.append('⁶');
                        break;
                    case '7':
                        resultado.append('⁷');
                        break;
                    case '8':
                        resultado.append('⁸');
                        break;
                    case '9':
                        resultado.append('⁹');
                        break;
                    default:
                        resultado.append(digito);
                }
            } else {
                if(digito == '.'){
                    resultado.append('·');
                }else if(digito == '-'){
                    resultado.append('⁻');
                }else{
                    resultado.append(digito);
                }
            }
        }
        return resultado.toString();//⁰¹²³⁴⁵⁶⁷⁸⁹
    }

    public double encontrarExpoente(double resultado, double base) {
        double expoente = Math.log(resultado) / Math.log(base);
        return expoente;
    }
}

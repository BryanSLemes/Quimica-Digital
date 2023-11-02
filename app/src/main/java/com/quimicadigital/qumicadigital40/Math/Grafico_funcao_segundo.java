package com.quimicadigital.qumicadigital40.Math;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.quimicadigital.qumicadigital40.R;
import com.quimicadigital.qumicadigital40.ui.logical_math;

import java.util.ArrayList;
import java.util.List;

public class Grafico_funcao_segundo extends AppCompatActivity {

    private Button btn_calcular;
    private TextView txt_1y;
    private TextView txt_2y;
    private TextView txt_3y;
    private TextView txt_4y;
    private TextView txt_5y;

    private EditText edt_x2;
    private EditText edt_x;
    private EditText edt_c;
    private EditText edt_1x;
    private EditText edt_2x;
    private EditText edt_3x;
    private EditText edt_4x;
    private EditText edt_5x;

    private View view_contas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafico_funcao_segundo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(logical_math.title);

        edt_x2 = findViewById(R.id.edt_2x);
        edt_x = findViewById(R.id.edt_x);
        edt_c = findViewById(R.id.edt_c);
        edt_1x = findViewById(R.id.edt_x1);
        edt_2x = findViewById(R.id.edt_x2);
        edt_3x = findViewById(R.id.edt_x3);
        edt_4x = findViewById(R.id.edt_x4);
        edt_5x = findViewById(R.id.edt_x5);

        txt_1y = findViewById(R.id.txt_y1);
        txt_2y = findViewById(R.id.txt_y2);
        txt_3y = findViewById(R.id.txt_y3);
        txt_4y = findViewById(R.id.txt_y4);
        txt_5y = findViewById(R.id.txt_y5);


        String hexColor = String.format("#%06X", (0xFFFFFF & ((ColorDrawable) findViewById(R.id.view_contas).getBackground()).getColor()));
        view_contas = findViewById(R.id.view_edts);
        if(hexColor.equals("#B2D8EB")){
            view_contas.setBackgroundResource(R.drawable.forma_borda_elemento_light);
            edt_x2.setTextColor(Color.parseColor("#FFFFFF"));
            edt_x.setTextColor(Color.parseColor("#FFFFFF"));
            edt_c.setTextColor(Color.parseColor("#FFFFFF"));
            edt_1x.setTextColor(Color.parseColor("#FFFFFF"));
            edt_2x.setTextColor(Color.parseColor("#FFFFFF"));
            edt_3x.setTextColor(Color.parseColor("#FFFFFF"));
            edt_4x.setTextColor(Color.parseColor("#FFFFFF"));
            edt_5x.setTextColor(Color.parseColor("#FFFFFF"));
        }

        btn_calcular = findViewById(R.id.btn_calcular);

        List<TextView> Y = new ArrayList();
        Y.add(txt_1y);
        Y.add(txt_2y);
        Y.add(txt_3y);
        Y.add(txt_4y);
        Y.add(txt_5y);

        List<EditText> X = new ArrayList();
        X.add(edt_1x);
        X.add(edt_2x);
        X.add(edt_3x);
        X.add(edt_4x);
        X.add(edt_5x);

        new graficoFuncaoSegundo().calcular(btn_calcular,edt_x2,edt_x,edt_c,X,Y);

        edt_x2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    View nextView = edt_x;
                    nextView.requestFocus();
                    return true;
                }
                return false;
            }
        });

        edt_x.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    View nextView = edt_c;
                    nextView.requestFocus();
                    return true;
                }
                return false;
            }
        });

        edt_c.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    View nextView = edt_1x;
                    nextView.requestFocus();
                    return true;
                }
                return false;
            }
        });

        edt_1x.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    View nextView = edt_2x;
                    nextView.requestFocus();
                    return true;
                }
                return false;
            }
        });

        edt_2x.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    View nextView = edt_3x;
                    nextView.requestFocus();
                    return true;
                }
                return false;
            }
        });

        edt_3x.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    View nextView = edt_4x;
                    nextView.requestFocus();
                    return true;
                }
                return false;
            }
        });

        edt_4x.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    View nextView = edt_5x;
                    nextView.requestFocus();
                    return true;
                }
                return false;
            }
        });

        edt_5x.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    btn_calcular.performClick();
                    return true;
                }
                return false;
            }
        });
    }
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(menuItem);
    }

}
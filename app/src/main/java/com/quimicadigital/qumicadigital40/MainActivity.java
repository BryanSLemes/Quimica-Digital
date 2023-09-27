package com.quimicadigital.qumicadigital40;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.android.play.core.tasks.OnCompleteListener;
import com.google.android.play.core.tasks.Task;
import com.quimicadigital.qumicadigital40.Database.conexao;
import com.quimicadigital.qumicadigital40.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static conexao con;
    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    public static Activity main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        con = new conexao(this);
        if(con.banco_povoado()){
            con.inserir();
        }
        SharedPreferences prefs = getSharedPreferences("MY_APP_PREFS", Context.MODE_PRIVATE);
        boolean updateShown = prefs.getBoolean("update_shown", false);
        atualização(updateShown,prefs);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.appBarMain.toolbar);
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;

        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_Ajuda, R.id.nav_informacao, R.id.logical_math, R.id.physycs_facilitating)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        main = (Activity) MainActivity.this;
    }

    private void atualização(boolean updateShown,SharedPreferences prefs){
        if (!updateShown) {
            // exiba a nota de atualização para o usuário
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(getString(R.string.update_message) + "\n*App Logical Math acoplado ao Química Digital "+
                            "\n*App Facilitating Physics acoplado ao Química Digital")
                    .setCancelable(false)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // armazene um valor verdadeiro no armazenamento compartilhado para indicar que a nota de atualização já foi exibida
                            SharedPreferences.Editor editor = prefs.edit();
                            editor.putBoolean("update_shown", true);
                            editor.apply();
                        }
                    });
            AlertDialog alert = builder.create();
            alert.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public void onShow(DialogInterface dialog) {
                    Button positiveButton = alert.getButton(AlertDialog.BUTTON_POSITIVE);
                    if((String.format("#%06X", (0xFFFFFF & ((ColorDrawable) findViewById(R.id.layout_principal).getBackground()).getColor()))).equals("#B2D8EB")){
                        positiveButton.setTextColor(getResources().getColor(R.color.black));
                    }else{
                        positiveButton.setTextColor(getResources().getColor(R.color.white));
                    }
                }
            });
            alert.show();
        }
    }

    public static void requestReview(Context context,Activity activity) {
        ReviewManager reviewManager = ReviewManagerFactory.create(context);
        Task<ReviewInfo> request = reviewManager.requestReviewFlow();
        request.addOnCompleteListener(new OnCompleteListener<ReviewInfo>() {
            @Override
            public void onComplete(@NonNull Task<ReviewInfo> task) {
                if (task.isSuccessful()) {
                    // A solicitação de avaliação foi bem-sucedida, mostrar o fluxo de avaliação
                    ReviewInfo reviewInfo = task.getResult();
                    Task<Void> flow = reviewManager.launchReviewFlow(activity, reviewInfo);
                    flow.addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            // O fluxo de avaliação foi concluído
                            // Você pode adicionar lógica adicional aqui, se necessário
                        }
                    });
                }
            }
        });
    }

    public static Activity getContexto(){
        return  main;
    }

    public static conexao getConexao(){
        return con;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
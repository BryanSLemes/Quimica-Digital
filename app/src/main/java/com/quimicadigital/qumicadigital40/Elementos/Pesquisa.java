package com.quimicadigital.qumicadigital40.Elementos;

import static com.quimicadigital.qumicadigital40.ui.PesquisaPrincipal.removerAcentos;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.quimicadigital.qumicadigital40.Database.conexao;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Pesquisa {

    private SQLiteDatabase db;
    private Cursor cursor;
    private String sql,aux;
    static CRUD crudto;
    public String au;



    public boolean pesquisaPrincipal(String elemento){

        if((isInteger(elemento)) && ((forInteger(elemento) <= 0 || forInteger(elemento) >=119))){
            return false;
        }

        if((isInteger(elemento)) && ((forInteger(elemento) > 0 && forInteger(elemento) <119))){
                povoarCRUD(forInteger(elemento));
                return true;
        }

        if(elemento.length() == 2 || elemento.length() == 1){
            for(int i=1;i<119;i++){
                sql = "select simbolo from Elementos where num_atomico = " + i;
                cursor = db.rawQuery(sql,null);
                cursor.moveToFirst();
                aux = (removerAcentos((cursor.getString(0)).toLowerCase(Locale.ROOT))).replaceAll(" ","");
                if(aux.equals(elemento)){
                    povoarCRUD(i);
                    return true;
                }
                cursor.moveToNext();
            }
        }

        for(int i=1;i<119;i++){
            sql = "select nome from Elementos where num_atomico = " + i;
            cursor = db.rawQuery(sql,null);
            cursor.moveToFirst();
            aux = (removerAcentos((cursor.getString(0)).toLowerCase(Locale.ROOT))).replaceAll(" ","");
            if(aux.equals(elemento)){
                povoarCRUD(i);
                return true;
            }
            cursor.moveToNext();
        }
        return false;
    }

    public boolean isInteger(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int forInteger(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public ArrayList<String> povoarAutocomplete(conexao con){
        ArrayList<String> array = new ArrayList<String>();
        db = con.getDatabase();
        sql = "select num_atomico,nome,simbolo from Elementos";
        cursor = db.rawQuery(sql,null);
        cursor.moveToFirst();
        for(int i=1;i<119;i++){
            array.add(i+"");
            array.add(cursor.getString(1) + "");
            array.add(cursor.getString(2) + "");
            cursor.moveToNext();
        }
        return array;
    }

    public void povoarCRUD(int num){
        CRUD(num);
    }

    public void povoarCRUD(int num,SQLiteDatabase db){
        this.db = db;
        CRUD(num);
    }

    private void CRUD(int num){
        CRUD crud = new CRUD();
        sql = "select * from Elementos where num_atomico = " + num;
        cursor = db.rawQuery(sql,null);
        cursor.moveToFirst();

        crud.num_atomico = num;
        crud.grupo = cursor.getString(1);
        crud.periodo = cursor.getString(2);
        crud.nome = cursor.getString(3);
        crud.simbolo = cursor.getString(4);

        au = num+" - "+cursor.getString(3)+" - "+cursor.getString(4);

        crud.massa = cursor.getDouble(5);
        crud.ponto_fusao = cursor.getDouble(6);
        crud.ponto_ebulicao = cursor.getDouble(7);

        crud.estado = cursor.getString(8);
        crud.descricao = cursor.getString(9);

        //Estado
        sql = "select * from Estado where id_estado = " + crud.estado;
        cursor = db.rawQuery(sql,null);
        cursor.moveToFirst();
        crud.estado = cursor.getString(1);

        //Nox
        sql = "select * from Nox where num_atomico = " + num + " order by descricao desc";
        cursor = db.rawQuery(sql,null);
        cursor.moveToFirst();

        for(int i=0;i<3;i+=1){
            aux = crud.simbolo + " ";
            if(i==0 && !(cursor.moveToFirst())){
                break;
            }

            if(cursor.getInt(1) > 0){
                aux += "+"+cursor.getInt(1)+" - Cátion";
            }else if(cursor.getInt(1) == 0){
                aux += cursor.getInt(1)+" - Nêutron";
            }
            else{
                aux += " "+cursor.getInt(1)+" - Ânion";
            }

            if(!((cursor.getString(2)) == null)){
                aux += " - " + cursor.getString(2);
            }
            i = 2;
            i-=1;
            crud.noxtxt.add(aux);
            crud.nox.add(cursor.getInt(1));
            if(!cursor.moveToNext()){
                i = 3;
            }
        }
        Distribuicao distribuicao = new Distribuicao(num);
        crud.camadas = distribuicao.getCamadas();
        crudto = crud;
    }

    public static CRUD getCrud(){
        return crudto;
    }

    public boolean proximo(){
        int num =(crudto.num_atomico) + 1;
        return pesquisaPrincipal(num + "");
    }
    public boolean anterior(){
        int num =(crudto.num_atomico) - 1;
        return pesquisaPrincipal(num + "");
    }

    public List<String> nomear(SQLiteDatabase db){
        List<String> nomes = new ArrayList();

        sql = "select nome,simbolo from Elementos";
        cursor = db.rawQuery(sql,null);
        cursor.moveToFirst();

        for (int i =1;i<=118;i++){
            nomes.add(cursor.getString(0));
            nomes.add(cursor.getString(1));
            cursor.moveToNext();
        }
        return nomes;
    }

}

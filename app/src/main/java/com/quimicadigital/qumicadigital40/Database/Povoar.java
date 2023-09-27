package com.quimicadigital.qumicadigital40.Database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class Povoar {

    public Povoar(ContentValues cv, SQLiteDatabase db){
        ContentValues c = cv;
        povoarElementos(c, db);
        db.execSQL("update Elementos set ponto_fusao = null where ponto_fusao = 0;");
        db.execSQL("update Elementos set ponto_ebulicao = null where ponto_ebulicao = 0;");
        c = new ContentValues();
        povoarEstado(c, db);
        c = new ContentValues();
        povoarNox(c, db);
        db.execSQL("update Nox set descricao = null where descricao = 'null';");

        db.execSQL("CREATE INDEX num_atomico ON Elementos(num_atomico);");
        db.execSQL("CREATE INDEX nome ON Elementos(nome);");
        db.execSQL("CREATE INDEX simbolo ON Elementos(simbolo);");

        db.execSQL("CREATE INDEX id_estado ON Estado(id_estado);");
        db.execSQL("CREATE INDEX numero_atomico ON Nox(num_atomico);");
    }

    private void povoarNox(ContentValues cv, SQLiteDatabase db){
        cv.put("num_atomico",1);
        cv.put("nox",1);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",1);
        cv.put("nox",-1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",2);
        cv.put("nox",0);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",3);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",4);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",5);
        cv.put("nox",-3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",6);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",6);
        cv.put("nox",-4);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",7);
        cv.put("nox",5);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",7);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",7);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",7);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",7);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",7);
        cv.put("nox",-1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",7);
        cv.put("nox",-2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",7);
        cv.put("nox",-3);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",8);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",8);
        cv.put("nox",-2);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",9);
        cv.put("nox",-1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",10);
        cv.put("nox",0);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",11);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",12);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",13);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",14);
        cv.put("nox",4);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",14);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",14);
        cv.put("nox",-1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",14);
        cv.put("nox",-2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",14);
        cv.put("nox",-3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",14);
        cv.put("nox",-4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",15);
        cv.put("nox",5);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",15);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",15);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",15);
        cv.put("nox",-3);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",16);
        cv.put("nox",6);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",16);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",16);
        cv.put("nox",-3);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",17);
        cv.put("nox",7);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",17);
        cv.put("nox",5);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",17);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",17);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",17);
        cv.put("nox",-1);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",18);
        cv.put("nox",0);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",19);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",20);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",21);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",22);
        cv.put("nox",4);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",22);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",22);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",23);
        cv.put("nox",5);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",23);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",23);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",23);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",24);
        cv.put("nox",6);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",24);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",24);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",25);
        cv.put("nox",7);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",25);
        cv.put("nox",4);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",25);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",26);
        cv.put("nox",3);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",26);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",27);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",27);
        cv.put("nox",2);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",28);
        cv.put("nox",2);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",28);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",29);
        cv.put("nox",2);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",29);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",30);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",31);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",32);
        cv.put("nox",4);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",32);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",32);
        cv.put("nox",-1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",32);
        cv.put("nox",-2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",32);
        cv.put("nox",-3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",32);
        cv.put("nox",-4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",33);
        cv.put("nox",5);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",33);
        cv.put("nox",3);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",33);
        cv.put("nox",-3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",34);
        cv.put("nox",6);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",34);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",34);
        cv.put("nox",-2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",35);
        cv.put("nox",5);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",35);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",35);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",35);
        cv.put("nox",-1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",36);
        cv.put("nox",0);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",37);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",38);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",39);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",40);
        cv.put("nox",4);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",40);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",41);
        cv.put("nox",5);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",41);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",41);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",41);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",42);
        cv.put("nox",6);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",42);
        cv.put("nox",5);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",42);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",42);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",42);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",43);
        cv.put("nox",7);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",43);
        cv.put("nox",6);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",43);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",44);
        cv.put("nox",8);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",44);
        cv.put("nox",6);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",44);
        cv.put("nox",4);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",44);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",44);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",45);
        cv.put("nox",6);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",45);
        cv.put("nox",4);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",45);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",45);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",46);
        cv.put("nox",4);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",46);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",47);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",48);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",49);
        cv.put("nox",3);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",49);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",49);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",50);
        cv.put("nox",4);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",50);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",51);
        cv.put("nox",5);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",51);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",51);
        cv.put("nox",-3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",52);
        cv.put("nox",6);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",52);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",52);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",52);
        cv.put("nox",-2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",53);
        cv.put("nox",7);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",53);
        cv.put("nox",5);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",53);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",53);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",53);
        cv.put("nox",-1);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",54);
        cv.put("nox",8);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",54);
        cv.put("nox",6);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",54);
        cv.put("nox",4);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",54);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",54);
        cv.put("nox",0);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",55);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",56);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",57);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",57);
        cv.put("nox",3);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",57);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",58);
        cv.put("nox",4);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",58);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",59);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",59);
        cv.put("nox",3);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",60);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",61);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",62);
        cv.put("nox",3);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",62);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",63);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",63);
        cv.put("nox",3);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",64);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",65);
        cv.put("nox",3);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",65);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",66);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",67);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",68);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",69);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",70);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",70);
        cv.put("nox",2);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",71);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",72);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",73);
        cv.put("nox",5);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",74);
        cv.put("nox",6);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",74);
        cv.put("nox",5);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",74);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",74);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",74);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",75);
        cv.put("nox",7);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",75);
        cv.put("nox",6);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",75);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",75);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",75);
        cv.put("nox",-1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",76);
        cv.put("nox",8);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",76);
        cv.put("nox",6);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",76);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",76);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",76);
        cv.put("nox",2);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",76);
        cv.put("nox",-2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",77);
        cv.put("nox",8);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",77);
        cv.put("nox",6);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",77);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",77);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",77);
        cv.put("nox",2);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",78);
        cv.put("nox",4);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",78);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",79);
        cv.put("nox",3);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",79);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",80);
        cv.put("nox",2);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",80);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",81);
        cv.put("nox",3);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",81);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",82);
        cv.put("nox",4);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",82);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",83);
        cv.put("nox",5);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",83);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",84);
        cv.put("nox",6);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",84);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",84);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",84);
        cv.put("nox",-2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",85);
        cv.put("nox",7);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",85);
        cv.put("nox",5);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",85);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",85);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",85);
        cv.put("nox",-1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",86);
        cv.put("nox",0);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",87);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",88);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",89);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",90);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",91);
        cv.put("nox",5);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",91);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",92);
        cv.put("nox",6);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",92);
        cv.put("nox",4);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",92);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",93);
        cv.put("nox",6);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",93);
        cv.put("nox",5);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",93);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",93);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",94);
        cv.put("nox",7);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",94);
        cv.put("nox",6);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",94);
        cv.put("nox",5);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",94);
        cv.put("nox",4);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",94);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",95);
        cv.put("nox",3);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",95);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",96);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",97);
        cv.put("nox",4);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",97);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",98);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",98);
        cv.put("nox",3);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",99);
        cv.put("nox",3);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",99);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",100);
        cv.put("nox",3);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",100);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",101);
        cv.put("nox",3);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",101);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",102);
        cv.put("nox",3);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",102);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",103);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",104);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",105);
        cv.put("nox",5);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",106);
        cv.put("nox",6);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",107);
        cv.put("nox",7);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",107);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",108);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",109);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",110);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",111);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",112);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",113);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",114);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",114);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",114);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",114);
        cv.put("nox",6);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",115);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",116);
        cv.put("nox",2);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",116);
        cv.put("nox",6);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",116);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",116);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",117);
        cv.put("nox",-1);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",117);
        cv.put("nox",1);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",117);
        cv.put("nox",7);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",117);
        cv.put("nox",5);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",117);
        cv.put("nox",3);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",118);
        cv.put("nox",1);
        cv.put("descricao","Mais comum");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",118);
        cv.put("nox",4);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);


        cv.put("num_atomico",118);
        cv.put("nox",2);
        cv.put("descricao","null");
        db.insert("Nox",null,cv);
    }

    private void povoarEstado(ContentValues cv, SQLiteDatabase db){
        cv.put("Id_estado",1);
        cv.put("descricao","Sólido");
        db.insert("Estado",null,cv);

        cv.put("id_estado",2);
        cv.put("descricao","Gasoso");
        db.insert("Estado",null,cv);

        cv.put("id_estado",3);
        cv.put("descricao","Líquido");
        db.insert("Estado",null,cv);

        cv.put("id_estado",4);
        cv.put("descricao","Sólido Artificial(10 anos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",5);
        cv.put("descricao","Sólido Artificial(8,1 h)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",6);
        cv.put("descricao","Sólido Artificial(21,77 anos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",7);
        cv.put("descricao","Sólido Artificial(1,4 x 10 anos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",8);
        cv.put("descricao","Artificial(0,00125 segundos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",9);
        cv.put("descricao","Artificial(0,010 segundos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",10);
        cv.put("descricao","Sólido Artificial(32.500 anos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",11);
        cv.put("descricao","Sólido Artificial(4,46 x 10 anos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",12);
        cv.put("descricao","Sólido Artificial(2,14 x 10 anos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",13);
        cv.put("descricao","Sólido Artificial(8,2 x 10 anos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",14);
        cv.put("descricao","Sólido Artificial(7370 anos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",15);
        cv.put("descricao","Sólido Artificial(1400 anos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",16);
        cv.put("descricao","Sólido Artificial(898 anos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",17);
        cv.put("descricao","Sólido Artificial(1,29 anos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",18);
        cv.put("descricao","Sólido Artificial(100,5 anos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",19);
        cv.put("descricao","Sólido Artificial(51,5 anos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",20);
        cv.put("descricao","Sólido Artificial(58 minutos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",21);
        cv.put("descricao","Sólido Artificial(3,6 horas)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",22);
        cv.put("descricao","Artificial(10 minutos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",23);
        cv.put("descricao","Artificial(4 segundos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",24);
        cv.put("descricao","Artificial(21 segundos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",25);
        cv.put("descricao","Artificial(9,8 segundos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",26);
        cv.put("descricao","Artificial(11 minutos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",27);
        cv.put("descricao","Artificial(0,72 segundos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",28);
        cv.put("descricao","Artificial(1,1 minuto)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",29);
        cv.put("descricao","Artificial(3,6 segundos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",30);
        cv.put("descricao","Artificial(1,196 segundos)");
        db.insert("Estado",null,cv);

        cv.put("id_estado",31);
        cv.put("descricao","Artificial(0,280 segundos)");
        db.insert("Estado",null,cv);
    }

    private void povoarElementos(ContentValues cv, SQLiteDatabase db){
        cv.put("Num_atomico",1);
        cv.put("Grupo","1A");
        cv.put("Periodo","1");
        cv.put("Nome","Hidrogênio");
        cv.put("Simbolo","H");
        cv.put("Massa",1.01);
        cv.put("Ponto_fusao",-259.14);
        cv.put("Ponto_ebulicao",-252.87);
        cv.put("Estado","2");
        cv.put("Descricao","O Hidrogênio é o elemento mais abundante do universo e é o elemento básico de toda e qualquer estrela. Cerca de 90% dos átomos presentes no universo são átomos de Hidrogênio. De forma molecular sempre diatômica, o Hidrogênio é um gás incolor, inodoro (sem odor) e insípido (sem sabor). O hidrogênio puro é usado principalmente no refino de petróleo e na produção de amônia, principalmente para fertilizantes, enquanto os gases misturados são fornecidos para produção de metanol e aço. O hidrogênio puro ainda não é comumente utilizado como combustível.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",2);
        cv.put("Grupo","8A");
        cv.put("Periodo","1");
        cv.put("Nome","Hélio");
        cv.put("Simbolo","He");
        cv.put("Massa",4.0);
        cv.put("Ponto_fusao",-272.2);
        cv.put("Ponto_ebulicao",-268.9);
        cv.put("Estado","2");
        cv.put("Descricao","Gás nobre, incolor e inodoro. O Hélio equivale ao segundo elemento químico mais abundante no Universo e só perde para o hidrogênio, é encontrado em 20 % da matéria das estrelas, mas na atmosfera terrestre a quantidade é mínima. O gás hélio é usado para o enchimento de balões e como líquido refrigerador de materiais supercondutores. Outra aplicação é como gás engarrafado, utilizado por mergulhadores de grande profundidade.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",3);
        cv.put("Grupo","1A");
        cv.put("Periodo","2");
        cv.put("Nome","Lítio");
        cv.put("Simbolo","Li");
        cv.put("Massa",6.94);
        cv.put("Ponto_fusao",180.5);
        cv.put("Ponto_ebulicao",1342.0);
        cv.put("Estado","1");
        cv.put("Descricao","O lítio é um metal de coloração branco acinzentada pertencente ao grupo dos metais alcalinos. É bastante reativo e possui a menor densidade dentre os metais, além de ser o mais eletropositivo dentre eles. Pode ser encontrado em salmouras ou também na crosta terrestre, em minerais como a petalita. O uso de lítio está indicado para o tratamento de Transtorno Bipolar em crianças e adolescentes (Consoli et al, 2007). Como a sensibilidade aos efeitos colaterais parece ser maior nessa população, a dose deve ser titulada com maior cuidado e lentidão.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",4);
        cv.put("Grupo","2A");
        cv.put("Periodo","2");
        cv.put("Nome","Berílio");
        cv.put("Simbolo","Be");
        cv.put("Massa",9.01);
        cv.put("Ponto_fusao",1287.0);
        cv.put("Ponto_ebulicao",2469.0);
        cv.put("Estado","1");
        cv.put("Descricao","Berílio é um metal alcalino-terroso do segundo período da Tabela Periódica. Possui boa resistência à corrosão, além de ter alto ponto de fusão e boa condutividade térmica. É utilizado na produção de giroscópios e guias inerciais de mísseis e foguetes. Mas a sua principal aplicação é na fabricação de ligas de cobre-berílio, que são usadas em reatores nucleares.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",5);
        cv.put("Grupo","3A");
        cv.put("Periodo","2");
        cv.put("Nome","Boro");
        cv.put("Simbolo","B");
        cv.put("Massa",10.81);
        cv.put("Ponto_fusao",2075.8);
        cv.put("Ponto_ebulicao",3926.8);
        cv.put("Estado","1");
        cv.put("Descricao","O boro, em sua forma pura, é um ametal de coloração preta lustrosa. Apesar de quebradiço, na escala Mohs de dureza, que varia de 1 a 10 e quantifica a resistência ao risco que uma substância possui sobre outra, o boro apresenta valor de 9,3, bem próximo ao limite máximo. Tem um importante papel na fisiologia animal e vegetal, atuando nos processos metabólicos relacionados à estrutura óssea e à produção de minerais. Tem sido muito aplicado na produção de suplementos para o tratamento de deficiências de cálcio, magnésio e vitamina D.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",6);
        cv.put("Grupo","4A");
        cv.put("Periodo","2");
        cv.put("Nome","Carbono");
        cv.put("Simbolo","C");
        cv.put("Massa",12.01);
        cv.put("Ponto_fusao",3500.0);
        cv.put("Ponto_ebulicao",4830.0);
        cv.put("Estado","2");
        cv.put("Descricao","Assim como outros elementos da mesma família, o carbono é tetravalente, ou seja, forma quatro ligações com outros elementos. Devido à facilidade em formar compostos, o carbono possui várias utilizações, que vão desde usinas de produção de energia até a fabricação de joias. Na forma de combustíveis fósseis, o carbono é utilizado para abastecer máquinas em indústrias e usinas, além de abastecer meios de transporte.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",7);
        cv.put("Grupo","5A");
        cv.put("Periodo","2");
        cv.put("Nome","Nitrogênio");
        cv.put("Simbolo","N");
        cv.put("Massa",14.01);
        cv.put("Ponto_fusao",-209.9);
        cv.put("Ponto_ebulicao",-195.8);
        cv.put("Estado","2");
        cv.put("Descricao","Naturalmente, é encontrado como gás (N2) na atmosfera terrestre. Ademais, é incolor, inodoro e insípido. O nitrogénio é comumente usado durante a preparação de amostras em análises químicas. Assim como também para concentrar e reduzir o volume de amostras líquidas. O nitrogênio também é importante para a indústria química. É usado na produção de fertilizantes, ácido nítrico, nylon, corantes e explosivos.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",8);
        cv.put("Grupo","6A");
        cv.put("Periodo","2");
        cv.put("Nome","Oxigênio");
        cv.put("Simbolo","O");
        cv.put("Massa",16.0);
        cv.put("Ponto_fusao",-222.0);
        cv.put("Ponto_ebulicao",-183.0);
        cv.put("Estado","2");
        cv.put("Descricao","O oxigênio é um gás essencial para a sobrevivência da maioria dos seres vivos de nosso planeta. Ele é necessário para que ocorra a respiração celular, um processo responsável pela liberação da energia necessária para a célula realizar suas atividades vitais.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",9);
        cv.put("Grupo","7A");
        cv.put("Periodo","2");
        cv.put("Nome","Flúor");
        cv.put("Simbolo","F");
        cv.put("Massa",19.0);
        cv.put("Ponto_fusao",-220.0);
        cv.put("Ponto_ebulicao",-188.0);
        cv.put("Estado","2");
        cv.put("Descricao","Coloração amarelo-pálida e tóxico. No estado líquido, possui uma coloração amarela. É o elemento mais eletronegativo da Tabela Periódica e, por isso, é muito reativo.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",10);
        cv.put("Grupo","8A");
        cv.put("Periodo","2");
        cv.put("Nome","Neônio");
        cv.put("Simbolo","Ne");
        cv.put("Massa",20.18);
        cv.put("Ponto_fusao",-248.67);
        cv.put("Ponto_ebulicao",-246.05);
        cv.put("Estado","2");
        cv.put("Descricao","É um gás nobre incolor, praticamente inerte, presente em pequena quantidade no ar atmosférico, porém muito abundante no Universo, que proporciona um tom arroxeado característico à luz das lâmpadas de descarga elétrica ou lâmpadas néon nas quais o gás é empregado. Quando misturado ao seu vizinho Argônio, dá origem a válvulas para raios-X; Se torna muito útil em laboratórios na forma de detector de íons; As pequenas lâmpadas de sinalização usadas em aparelhos elétricos e eletrônicos contêm gás Neônio em sua composição.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",11);
        cv.put("Grupo","1A");
        cv.put("Periodo","3");
        cv.put("Nome","Sódio");
        cv.put("Simbolo","Na");
        cv.put("Massa",22.99);
        cv.put("Ponto_fusao",98.0);
        cv.put("Ponto_ebulicao",892.0);
        cv.put("Estado","1");
        cv.put("Descricao","Ele tem a cor branca é vital para a manutenção de importantes processos do organismo. Por exemplo: o sódio permite a transmissão de informações entre as células nervosas, é o desencadeador da contração muscular e regulador da pressão arterial. O sódio também está presente no transporte de nutrientes no intestino delgado e nos rins.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",12);
        cv.put("Grupo","2A");
        cv.put("Periodo","3");
        cv.put("Nome","Magnésio");
        cv.put("Simbolo","Mg");
        cv.put("Massa",24.3);
        cv.put("Ponto_fusao",650.0);
        cv.put("Ponto_ebulicao",1107.0);
        cv.put("Estado","1");
        cv.put("Descricao","O elemento Magnésio é aplicado na fabricação de fogos de artifício, lâmpadas e ainda está presente nos flashes fotográficos. Pode ser usado também como catalisador em reações orgânicas: reações de adição e redução, desalogenização e condensação.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",13);
        cv.put("Grupo","3A");
        cv.put("Periodo","3");
        cv.put("Nome","Alumínio");
        cv.put("Simbolo","Al");
        cv.put("Massa",26.98);
        cv.put("Ponto_fusao",660.0);
        cv.put("Ponto_ebulicao",2450.0);
        cv.put("Estado","1");
        cv.put("Descricao","Seu peso específico é de cerca de 2,70 g/cm3, aproximadamente 35% do peso do aço e 30% do peso do cobre. Resistência à corrosão: O alumínio possui uma fina e invisível camada de óxido, a qual protege o metal de oxidações posteriores. Na indústria, é usado para fabricar latas, é usado em tintas na forma de pó de alumínio, por ser um bom condutor de eletricidade é usado em cabos suspensos. Sua leveza, resistência à corrosão e baixo ponto de fusão, lhe conferem uma multiplicidade de aplicações, especialmente na aeronáutica.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",14);
        cv.put("Grupo","4A");
        cv.put("Periodo","3");
        cv.put("Nome","Silício");
        cv.put("Simbolo","Si");
        cv.put("Massa",28.09);
        cv.put("Ponto_fusao",1410.0);
        cv.put("Ponto_ebulicao",2350.0);
        cv.put("Estado","1");
        cv.put("Descricao","Elemento muito abundante na crosta terrestre (25,7% do seu peso) e presente também no Sol, nas estrelas, e aerólitos e nos tectitos. Ocorre principalmente como óxido e silicatos, nunca no estado livre. Cristalino, com cor cinza e brilho metálico, ou amorfo, relativamente inerte. Mas a aplicação mais conhecida do silício é em semicondutores, usados em componentes de circuitos e chips eletrônicos. O silício é um sólido duro, de cor cinza escuro com um certo brilho metálico, que é muito usado na produção da maior parte dos circuitos eletrônicos.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",15);
        cv.put("Grupo","5A");
        cv.put("Periodo","3");
        cv.put("Nome","Fósforo");
        cv.put("Simbolo","P");
        cv.put("Massa",30.97);
        cv.put("Ponto_fusao",44.0);
        cv.put("Ponto_ebulicao",280.0);
        cv.put("Estado","1");
        cv.put("Descricao","Em sua forma pura consiste em uma substância semi transparente, de consistência mole, semelhante a uma cera e que brilha no escuro. É um elemento que sofre oxidação espontânea em contato com o ar atmosférico. O fósforo apresenta dez variedades alotrópicas, sendo as mais importantes o fosforo branco, vermelho e negro. Ele ajuda a criar diversas proteínas essenciais para o corpo e ainda regula os níveis de pH do sangue, impedindo que ele se torne ácido ou alcalino demais. Também controla os batimentos cardíacos e atua no equilíbrio hormonal.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",16);
        cv.put("Grupo","6A");
        cv.put("Periodo","3");
        cv.put("Nome","Enxofre");
        cv.put("Simbolo","S");
        cv.put("Massa",32.07);
        cv.put("Ponto_fusao",115.0);
        cv.put("Ponto_ebulicao",445.0);
        cv.put("Estado","1");
        cv.put("Descricao","O enxofre é um sólido amarelo pálido, inodoro, sem sabor, insolúvel em água, quebradiço e mau condutor de eletricidade.Industrialmente, o enxofre é utilizado na produção de fertilizantes químicos, na produção de baterias e no processamento da borracha.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",17);
        cv.put("Grupo","7A");
        cv.put("Periodo","3");
        cv.put("Nome","Cloro");
        cv.put("Simbolo","Cl");
        cv.put("Massa",35.45);
        cv.put("Ponto_fusao",-101.0);
        cv.put("Ponto_ebulicao",-35.0);
        cv.put("Estado","2");
        cv.put("Descricao","O cloro pode ser encontrado na natureza combinado com outros compostos, principalmente na forma de cloreto de sódio e, também, em outros minerais. Apesar da sua forma gasosa, pode ser encontrada comercialmente sob as formas de gel, em pó ou sólido, assemelhando-se a sal grosso. O cloro é uma substância utilizada para oxidar a matéria orgânica proveniente dos mananciais e que possa aparecer na rede de distribuição. Isso significa que ele elimina ou impede que bactérias, vírus e protozoários causadores de doenças surjam e se multipliquem no percurso da estação de tratamento até as residências.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",18);
        cv.put("Grupo","8A");
        cv.put("Periodo","3");
        cv.put("Nome","Argônio");
        cv.put("Simbolo","Ar");
        cv.put("Massa",39.95);
        cv.put("Ponto_fusao",-189.0);
        cv.put("Ponto_ebulicao",-186.0);
        cv.put("Estado","2");
        cv.put("Descricao","A aplicado em peças de museus para uma melhor conservação das relíquias. O argônio, uma vez presente, evita que o material sofra ação corrosiva. A chamada soldagem especial com atmosfera protetora, conta com a ajuda do argônio para ocorrer. O gás é responsável por proteger a solda da oxidação.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",19);
        cv.put("Grupo","1A");
        cv.put("Periodo","4");
        cv.put("Nome","Potássio");
        cv.put("Simbolo","K");
        cv.put("Massa",39.1);
        cv.put("Ponto_fusao",64.0);
        cv.put("Ponto_ebulicao",774.0);
        cv.put("Estado","1");
        cv.put("Descricao","Em temperatura ambiente é muito macio. Trata-se do oitavo elemento mais abundante da crosta terrestre, encontrado em minerais e em águas salgadas. É um nutriente essencial para as plantas e para os animais. Sua principal aplicação é na composição dos fertilizantes. Possui aplicações na indústria alimentícia e têxtil, na fabricação de explosivos, fogos de artifício, entre outras.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",20);
        cv.put("Grupo","2A");
        cv.put("Periodo","4");
        cv.put("Nome","Cálcio");
        cv.put("Simbolo","Ca");
        cv.put("Massa",40.08);
        cv.put("Ponto_fusao",839.0);
        cv.put("Ponto_ebulicao",1440.0);
        cv.put("Estado","1");
        cv.put("Descricao","O cálcio é um metal de baixa dureza, prateado, que reage facilmente com o oxigênio do ar e com a água. Na natureza ele nunca foi achado isolado, como metal, sendo encontrado principalmente como constituinte de rochas, calcários e mármores . O cálcio está presente na constituição dos ossos e dentes, e sua deficiência pode gerar algumas doenças, como a osteoporose.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",21);
        cv.put("Grupo","3B");
        cv.put("Periodo","4");
        cv.put("Nome","Escândio");
        cv.put("Simbolo","Sc");
        cv.put("Massa",44.96);
        cv.put("Ponto_fusao",1539.0);
        cv.put("Ponto_ebulicao",2730.0);
        cv.put("Estado","1");
        cv.put("Descricao","Suas ligas são utilizadas na confecção de objetos que necessitem de baixa densidade, alta durabilidade e resistência à abrasão oferecida pelo calor. É o caso dos aviões russos MIG e da indústria aeroespacial. Encontram-se ligas de escândio.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",22);
        cv.put("Grupo","4B");
        cv.put("Periodo","4");
        cv.put("Nome","Titânio");
        cv.put("Simbolo","Ti");
        cv.put("Massa",47.87);
        cv.put("Ponto_fusao",1660.0);
        cv.put("Ponto_ebulicao",3277.0);
        cv.put("Estado","1");
        cv.put("Descricao","Ele é encontrado em meteoritos e em rochas lunares. Na crosta terrestre, é o nono elemento mais abundante, ocorrendo na natureza na forma de combinações químicas, geralmente, com oxigênio e ferro. O titânio é um metal de transição que agrega valor a ligas metálicas por ser leve e resistente. Não é um bom condutor elétrico ou térmico, sendo, por isso, utilizado também em materiais refratários. Também é usado na fabricação de joias pelo seu aspecto metálico lustroso, entre outras aplicações do elemento.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",23);
        cv.put("Grupo","5B");
        cv.put("Periodo","4");
        cv.put("Nome","Vanádio");
        cv.put("Simbolo","V");
        cv.put("Massa",50.94);
        cv.put("Ponto_fusao",1902.0);
        cv.put("Ponto_ebulicao",3377.0);
        cv.put("Estado","1");
        cv.put("Descricao","O vanádio é utilizado na indústria, principalmente em metalurgia, onde é adicionado a ligas para obtenção de aços especiais. Quando combinado com crômio, níquel, manganês, boro, tungstênio e outros elementos, é usado na produção de aços de carbono com alta resistência.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",24);
        cv.put("Grupo","6B");
        cv.put("Periodo","4");
        cv.put("Nome","Cromo");
        cv.put("Simbolo","Cr");
        cv.put("Massa",52.0);
        cv.put("Ponto_fusao",1857.0);
        cv.put("Ponto_ebulicao",2627.0);
        cv.put("Estado","1");
        cv.put("Descricao","O cromo é amplamente utilizado na produção de aço inoxidável, liga de ferro cromo, refratários, na indústria química e nos processos de fundição.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",25);
        cv.put("Grupo","7B");
        cv.put("Periodo","4");
        cv.put("Nome","Manganês");
        cv.put("Simbolo","Mn");
        cv.put("Massa",54.94);
        cv.put("Ponto_fusao",1244.0);
        cv.put("Ponto_ebulicao",2067.0);
        cv.put("Estado","1");
        cv.put("Descricao","O minério de manganês é considerado material essencial na fabricação de ligas metálicas, combinando, especialmente com o ferro, na produção de aço. Pode ser utilizado ainda em ligas de cobre, zinco, alumínio, estanho e chumbo.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",26);
        cv.put("Grupo","8B");
        cv.put("Periodo","4");
        cv.put("Nome","Ferro");
        cv.put("Simbolo","Fe");
        cv.put("Massa",55.85);
        cv.put("Ponto_fusao",1536.0);
        cv.put("Ponto_ebulicao",3000.0);
        cv.put("Estado","1");
        cv.put("Descricao","O nome ferro é derivado do latim ferrum, é um metal maleável, tenaz, de coloração branco-acizentada apresentando propriedades magnéticas; é ferromagnético à temperatura ambiente, assim como o Níquel e o Cobalto. É duro e resistente, mas ao mesmo tempo é maleável e dúctil. O ferro possui propriedades como: bom condutor de calor e eletricidade, atualmente é utilizado extensivamente para a produção de aço, liga metálica para a produção de ferramentas, máquinas, veículos de transporte (automóveis, navios, etc.), como elemento estrutural de pontes, edifícios, e uma infinidade de outras.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",27);
        cv.put("Grupo","8B");
        cv.put("Periodo","4");
        cv.put("Nome","Cobalto");
        cv.put("Simbolo","Co");
        cv.put("Massa",58.93);
        cv.put("Ponto_fusao",1495.0);
        cv.put("Ponto_ebulicao",2877.0);
        cv.put("Estado","1");
        cv.put("Descricao","Apresentando dureza acentuada, constituição quebradiça e cor cinza-aço, o cobalto é semelhante e constantemente confundido com o ferro. Hoje em dia, os sais de cobalto ainda são utilizados na confecção de pigmentos para cerâmica, enquanto sua forma metálica é explorada na indústria metalúrgica para a produção de tipos de aço. Já os óxidos de cobalto podem ser utilizados como catalisadores na indústria química.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",28);
        cv.put("Grupo","8B");
        cv.put("Periodo","4");
        cv.put("Nome","Níquel");
        cv.put("Simbolo","Ni");
        cv.put("Massa",58.69);
        cv.put("Ponto_fusao",1455.0);
        cv.put("Ponto_ebulicao",2887.0);
        cv.put("Estado","1");
        cv.put("Descricao","Na fabricação de aço inoxidável e aços ligados (ligas com mais metal que carbono). Superligas de níquel são utilizadas em indústrias aeroespaciais. Como revestimento de outros metais, para proteção contra corrosão e oxidação. Na fabricação de moedas. Possui melhor ductilidade, boa soldabilidade, como também resistência mecânica e proteção à corrosão e à oxidação a altas temperaturas; além disso, possui ainda tenacidade a baixas temperaturas.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",29);
        cv.put("Grupo","1B");
        cv.put("Periodo","4");
        cv.put("Nome","Cobre");
        cv.put("Simbolo","Cu");
        cv.put("Massa",63.55);
        cv.put("Ponto_fusao",1083.0);
        cv.put("Ponto_ebulicao",2582.0);
        cv.put("Estado","1");
        cv.put("Descricao","O cobre é utilizado na produção de materiais condutores de eletricidade (fios e cabos), bem como em ligas metálicas (latão e bronze). As maiores propriedades do cobre são sua alta capacidade de deformação e ductilidade.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",30);
        cv.put("Grupo","2B");
        cv.put("Periodo","4");
        cv.put("Nome","Zinco");
        cv.put("Simbolo","Zn");
        cv.put("Massa",65.41);
        cv.put("Ponto_fusao",420.0);
        cv.put("Ponto_ebulicao",907.0);
        cv.put("Estado","1");
        cv.put("Descricao","É um metal utilizado na produção de ligas metálicas: latão, bronze de molas, ligas paras soldas, com níquel e para tipografia, entre outros, e na fabricação de baterias, pilhas e telhas.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",31);
        cv.put("Grupo","3A");
        cv.put("Periodo","4");
        cv.put("Nome","Gálio");
        cv.put("Simbolo","Ga");
        cv.put("Massa",69.72);
        cv.put("Ponto_fusao",30.0);
        cv.put("Ponto_ebulicao",2450.0);
        cv.put("Estado","1");
        cv.put("Descricao","O gálio é um metal mole, grisáceo no estado líquido e prateado brilhante ao solidificar. Quando sólido desagrega a baixas temperaturas pois funde ao redor da temperatura ambiente (como o césio, mercúrio e rubídio), inclusive quando colocado nas mãos, devido ao seu baixo ponto de fusão . A aplicação principal do gálio está na indústria de produção de semicondutores: pode-se fabricar, por exemplo, diodos, LEDs, ou transistores, assim como, servir de dopante, para alterar as propriedades de determinado semicondutor. Além de sensores de temperatura, luz e campos magnéticos.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",32);
        cv.put("Grupo","4A");
        cv.put("Periodo","4");
        cv.put("Nome","Germânio");
        cv.put("Simbolo","Ge");
        cv.put("Massa",72.64);
        cv.put("Ponto_fusao",937.0);
        cv.put("Ponto_ebulicao",2830.0);
        cv.put("Estado","1");
        cv.put("Descricao","As aplicações do germânio estão limitadas ao seu alto custo e em muitos casos estuda-se a sua substituição por materiais mais econômicos. Sua aplicação principal é como semicondutor em eletrônica, produção de fibras ópticas e equipamentos de visão noturna.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",33);
        cv.put("Grupo","5A");
        cv.put("Periodo","4");
        cv.put("Nome","Arsênio");
        cv.put("Simbolo","As");
        cv.put("Massa",74.92);
        cv.put("Ponto_fusao",817.0);
        cv.put("Ponto_ebulicao",887.0);
        cv.put("Estado","1");
        cv.put("Descricao","Ele é encontrado naturalmente na crosta terrestre, na nossa água, no ar que respiramos e em muitos dos alimentos que consumimos. – Exposição dérmica a poeira, solo ou água, embora isto seja geralmente considerado como sendo de menor importância no caso de exposição ao arsênio.  Ele é usado na produção de cerâmica, vidro e de pigmentos, semicondutores (arsenito de gálio); Mineração: de cobre, zinco e chumbo; Ligas metálicas, como cobre, zinco, chumbo etc; Sínteses químicas (arsina).");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",34);
        cv.put("Grupo","6A");
        cv.put("Periodo","4");
        cv.put("Nome","Selênio");
        cv.put("Simbolo","Se");
        cv.put("Massa",78.96);
        cv.put("Ponto_fusao",221.0);
        cv.put("Ponto_ebulicao",687.0);
        cv.put("Estado","1");
        cv.put("Descricao","O selênio é um poderoso antioxidante que ajuda a reduzir a quantidade de radicais livres no organismo. Esses radicais livres são formados naturalmente durante o metabolismo corporal, mas podem causar danos como inflamação, alterações no funcionamento das células e envelhecimento.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",35);
        cv.put("Grupo","7A");
        cv.put("Periodo","4");
        cv.put("Nome","Bromo");
        cv.put("Simbolo","Br");
        cv.put("Massa",79.9);
        cv.put("Ponto_fusao",-7.0);
        cv.put("Ponto_ebulicao",58.0);
        cv.put("Estado","3");
        cv.put("Descricao","O bromo não é facilmente encontrado na natureza, mas é abundante na forma de sais de bromo na água do mar e em algumas rochas. O bromo é o único não-metal que forma uma substância simples líquida nas condições ambientais. Tem cor marrom-avermelhada e seus vapores apresentam um odor bastante desagradável. O bromo foi utilizado em diferentes segmentos como o tratamento da água, redução das emissões de mercúrio, armazenamento e geração de energia, produção de medicamentos e em borracha de melhor qualidade, além da segurança contra incêndio.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",36);
        cv.put("Grupo","8A");
        cv.put("Periodo","4");
        cv.put("Nome","Criptônio");
        cv.put("Simbolo","Kr");
        cv.put("Massa",83.8);
        cv.put("Ponto_fusao",-157.0);
        cv.put("Ponto_ebulicao",-153.0);
        cv.put("Estado","2");
        cv.put("Descricao","É produzido por meio da destilação fracionada do ar atmosférico liquefeito. É aplicado em lâmpadas incandescentes para aumentar sua eficiência e até na detecção de atividades nucleares.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",37);
        cv.put("Grupo","1A");
        cv.put("Periodo","5");
        cv.put("Nome","Rubídio");
        cv.put("Simbolo","Rb");
        cv.put("Massa",85.47);
        cv.put("Ponto_fusao",39.0);
        cv.put("Ponto_ebulicao",688.0);
        cv.put("Estado","1");
        cv.put("Descricao","Utilizações do metal Rubídio se destaca a utilização em tubos de vácuo, como células fotoelétricas. Já as formas variantes, como o carbonato de rubídio, são empregadas na indústria vidreira.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",38);
        cv.put("Grupo","2A");
        cv.put("Periodo","5");
        cv.put("Nome","Estrôncio");
        cv.put("Simbolo","Sr");
        cv.put("Massa",87.62);
        cv.put("Ponto_fusao",770.0);
        cv.put("Ponto_ebulicao",1380.0);
        cv.put("Estado","1");
        cv.put("Descricao","O estrôncio é utilizado na confecção de fogos de artifício. Em aplicação industrial, carbonato de estrôncio é sinterizado (pulverizado e aquecido) com óxido de ferro para formar ímãs de ferrite (ou cerâmica), usados em ímãs de geladeira, alto-falantes e pequenos motores elétricos.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",39);
        cv.put("Grupo","3B");
        cv.put("Periodo","5");
        cv.put("Nome","Ítrio");
        cv.put("Simbolo","Y");
        cv.put("Massa",88.91);
        cv.put("Ponto_fusao",1526.0);
        cv.put("Ponto_ebulicao",2927.0);
        cv.put("Estado","1");
        cv.put("Descricao","Ele é  utilizado no campo dos eletrônicos por conta de suas propriedades luminescentes. Também é utilizado na fabricação de lasers. Compostos de ítrio podem ser usados como supercondutores, o que permitiu o avanço da técnica de levitação magnética.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",40);
        cv.put("Grupo","4B");
        cv.put("Periodo","5");
        cv.put("Nome","Zircônio");
        cv.put("Simbolo","Zr");
        cv.put("Massa",91.22);
        cv.put("Ponto_fusao",1852.0);
        cv.put("Ponto_ebulicao",3580.0);
        cv.put("Estado","1");
        cv.put("Descricao","O zircônio tem grande aplicação na indústria nuclear, pois sua baixa absorção de nêutrons faz dele um excelente revestimento para o combustível, rico em dióxido de urânio. Além disso, por ser considerado atóxico e muito biocompatível, o zircônio é aplicado em próteses e implantes cirúrgicos.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",41);
        cv.put("Grupo","5B");
        cv.put("Periodo","5");
        cv.put("Nome","Nióbio");
        cv.put("Simbolo","Nb");
        cv.put("Massa",92.91);
        cv.put("Ponto_fusao",2468.0);
        cv.put("Ponto_ebulicao",4930.0);
        cv.put("Estado","1");
        cv.put("Descricao","O nióbio atualmente é utilizado para fortalecer ligas metálicas aplicadas a tubos condutores de fluidos, peças aerodinâmicas e automotivas, e medicinalmente é utilizado em diagnósticos de imagem, isso tudo se deve às suas propriedades.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",42);
        cv.put("Grupo","6B");
        cv.put("Periodo","5");
        cv.put("Nome","Molibdênio");
        cv.put("Simbolo","Mo");
        cv.put("Massa",95.96);
        cv.put("Ponto_fusao",2617.0);
        cv.put("Ponto_ebulicao",5560.0);
        cv.put("Estado","1");
        cv.put("Descricao","O molibdênio auxilia um pequeno número de enzimas, as proteínas que ajudam as reações químicas que ocorrem no corpo. A mais importante dessas enzimas é a sulfito oxidase, que está envolvida no metabolismo dos aminoácidos (os blocos de construção da proteína) que contêm enxofre.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",43);
        cv.put("Grupo","7B");
        cv.put("Periodo","5");
        cv.put("Nome","Tecnécio");
        cv.put("Simbolo","Tc");
        cv.put("Massa",98.0);
        cv.put("Ponto_fusao",2200.0);
        cv.put("Ponto_ebulicao",4265.0);
        cv.put("Estado","1");
        cv.put("Descricao","O principal uso do tecnécio ocorre na medicina nuclear, especificamente no diagnóstico de tumores,  É um procedimento não invasivo, que possibilita avaliações anatômicas, morfológicas e funcionais. A utilização deste elemento em exames possibilita, por exemplo, o diagnóstico precoce de alguns tipos de câncer, bem como o acompanhamento pós-tratamento.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",44);
        cv.put("Grupo","8B");
        cv.put("Periodo","5");
        cv.put("Nome","Rutênio");
        cv.put("Simbolo","Ru");
        cv.put("Massa",101.07);
        cv.put("Ponto_fusao",2250.0);
        cv.put("Ponto_ebulicao",3727.0);
        cv.put("Estado","1");
        cv.put("Descricao","É um metal de transição, pouco abundante, encontrado normalmente em minas de platina. É empregado como catalisador e em ligas metálicas de alta resistência com platina ou paládio.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",45);
        cv.put("Grupo","8B");
        cv.put("Periodo","5");
        cv.put("Nome","Ródio");
        cv.put("Simbolo","Rh");
        cv.put("Massa",102.91);
        cv.put("Ponto_fusao",1965.0);
        cv.put("Ponto_ebulicao",3720.0);
        cv.put("Estado","1");
        cv.put("Descricao","É demandado na indústria eletrônica, que o utiliza em alguns equipamentos ópticos e em certos tipos de espelhos. Na joalheria, é utilizado em quantidades muito pequenas para aumentar a resistência do ouro e lhe dar uma aparência mais brilhante.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",46);
        cv.put("Grupo","8B");
        cv.put("Periodo","5");
        cv.put("Nome","Paládio");
        cv.put("Simbolo","Pd");
        cv.put("Massa",106.42);
        cv.put("Ponto_fusao",1555.0);
        cv.put("Ponto_ebulicao",3027.0);
        cv.put("Estado","1");
        cv.put("Descricao","O paládio é também utilizado na produção de equipamento de uso militar, aeroespacial e civil. Entre 75% e 80% do paládio extraído das minas são utilizados na fabricação de catalisadores.  Esses dispositivos são responsáveis pela conversão de gases nocivos, como hidrocarbonetos e monóxido de carbono, em vapor d'água e CO2, composto que também polui, mas em menor grau.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",47);
        cv.put("Grupo","1B");
        cv.put("Periodo","5");
        cv.put("Nome","Prata");
        cv.put("Simbolo","Ag");
        cv.put("Massa",107.87);
        cv.put("Ponto_fusao",961.0);
        cv.put("Ponto_ebulicao",2212.0);
        cv.put("Estado","1");
        cv.put("Descricao","Hoje, o uso da prata abrange muitas tecnologias modernas , incluindo painéis solares, veículos elétricos e dispositivos 5G. No entanto, o uso da prata na moeda, na medicina, na arte e na joalheria ajudou a promover a civilização, o comércio e a tecnologia por milhares de anos.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",48);
        cv.put("Grupo","2B");
        cv.put("Periodo","5");
        cv.put("Nome","Cádmio");
        cv.put("Simbolo","Cd");
        cv.put("Massa",112.41);
        cv.put("Ponto_fusao",321.0);
        cv.put("Ponto_ebulicao",767.0);
        cv.put("Estado","1");
        cv.put("Descricao","O cádmio é um elemento químico muito utilizado na indústria de eletrônicos, cimento e fertilizantes fosfatados. A galvanoplastia, processo de cobrir um metal com outro, é uma das atividades industriais que mais utiliza cádmio.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",49);
        cv.put("Grupo","3A");
        cv.put("Periodo","5");
        cv.put("Nome","Índio");
        cv.put("Simbolo","In");
        cv.put("Massa",114.82);
        cv.put("Ponto_fusao",156.0);
        cv.put("Ponto_ebulicao",2027.0);
        cv.put("Estado","1");
        cv.put("Descricao","O índio é utilizado na produção de ligas metálicas empregadas na fabricação de semicondutores, e em reatores nucleares, como capturador de nêutrons. O inAs e o inSb são utilizados na produção de transistores e termistores de baixa temperatura.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",50);
        cv.put("Grupo","4A");
        cv.put("Periodo","5");
        cv.put("Nome","Estanho");
        cv.put("Simbolo","Sn");
        cv.put("Massa",118.71);
        cv.put("Ponto_fusao",232.0);
        cv.put("Ponto_ebulicao",2270.0);
        cv.put("Estado","1");
        cv.put("Descricao","Tem baixo ponto de fusão, o que lhe permite ser muito utilizado na fabricação de ligas metálicas. É resistente á corrosão. Na sua forma metálica, não é tóxico para seres humanos. É utilizado na fabricação do bronze e diversas outras ligas.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",51);
        cv.put("Grupo","5A");
        cv.put("Periodo","5");
        cv.put("Nome","Antimônio");
        cv.put("Simbolo","Sb");
        cv.put("Massa",121.76);
        cv.put("Ponto_fusao",630.0);
        cv.put("Ponto_ebulicao",1577.0);
        cv.put("Estado","1");
        cv.put("Descricao","O antimônio é um metalóide encontrado na crosta terrestre, que ocorre em diversos minerais. Os compostos de antimônio, principalmente trióxido de antimônio, são usados como retardante de chama para têxteis, plásticos, adesivos, tintas, papel e borracha. O antimônio já foi aplicado na medicina para induzir o vômito em pacientes, mas seu uso foi discriminado por provocar a morte, pois a dose letal é muito próxima da permitida.");
                db.insert("Elementos",null,cv);

        cv.put("Num_atomico",52);
        cv.put("Grupo","6A");
        cv.put("Periodo","5");
        cv.put("Nome","Telúrio");
        cv.put("Simbolo","Te");
        cv.put("Massa",127.6);
        cv.put("Ponto_fusao",450.0);
        cv.put("Ponto_ebulicao",987.0);
        cv.put("Estado","1");
        cv.put("Descricao","A indústria que mais consome telúrio é a metalúrgica, pois esse elemento é importante em ligas para ferros fundidos, aços inoxidáveis, ligas de cobre e chumbo. Ele é aplicado em pequenas quantidades em alguns aços e em chumbo, para aumentar a resistência mecânica desses elementos.");
                db.insert("Elementos",null,cv);

        cv.put("Num_atomico",53);
        cv.put("Grupo","7A");
        cv.put("Periodo","5");
        cv.put("Nome","Iodo");
        cv.put("Simbolo","I");
        cv.put("Massa",126.9);
        cv.put("Ponto_fusao",114.0);
        cv.put("Ponto_ebulicao",182.0);
        cv.put("Estado","1");
        cv.put("Descricao","Os compostos de iodo são importantes no campo da química orgânica e são muito úteis na medicina; iodetos, assim como a tiroxina, que contém iodo, são utilizados em medicina interna. O iodeto de potássio, KI, é empregado em fotografia.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",54);
        cv.put("Grupo","8A");
        cv.put("Periodo","5");
        cv.put("Nome","Xenônio");
        cv.put("Simbolo","Xe");
        cv.put("Massa",131.29);
        cv.put("Ponto_fusao",-112.0);
        cv.put("Ponto_ebulicao",-107.0);
        cv.put("Estado","2");
        cv.put("Descricao","Xenônio é aplicado como dispositivo emissor de luz azul. Nesta forma, pode ser usado em tubos de descargas (tubo de gás néon), em tubos eletrônicos e em lâmpadas ultravioletas (para bronzeamento artificial). - Usado como anestésico em anestesia geral.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",55);
        cv.put("Grupo","1A");
        cv.put("Periodo","6");
        cv.put("Nome","Césio");
        cv.put("Simbolo","Cs");
        cv.put("Massa",132.91);
        cv.put("Ponto_fusao",28.0);
        cv.put("Ponto_ebulicao",705.0);
        cv.put("Estado","1");
        cv.put("Descricao","É usado como catalisador na hidrogenação de certos compostos orgânicos; Isótopos radioativos de césio são usados no campo médico para tratar de certos tipos de câncer; O fluoreto de césio é usado extensivamente na química orgânica como base e como fonte de íons fluoretos.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",56);
        cv.put("Grupo","2A");
        cv.put("Periodo","6");
        cv.put("Nome","Bário");
        cv.put("Simbolo","Ba");
        cv.put("Massa",137.33);
        cv.put("Ponto_fusao",729.0);
        cv.put("Ponto_ebulicao",1500.0);
        cv.put("Estado","1");
        cv.put("Descricao","O bário não é um elemento essencial ao ser humano. A toxicidade do metal é produzida pelo cátion livre e os compostos muito solúveis são mais tóxicos que os insolúveis, como o sulfato de bário. A principal via de exposição da população geral é a ingestão de água e alimentos.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",57);
        cv.put("Grupo","Série dos Lantanídeos - 3B");
        cv.put("Periodo","6");
        cv.put("Nome","Lantânio");
        cv.put("Simbolo","La");
        cv.put("Massa",138.91);
        cv.put("Ponto_fusao",920.0);
        cv.put("Ponto_ebulicao",3460.0);
        cv.put("Estado","1");
        cv.put("Descricao","O lantânio é usado como aditivo nalguns vidros ópticos para melhorar as suas propriedades óticas. A principal aplicação do lantânio é, no entanto, como catalisador na transformação dos derivados de crude.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",58);
        cv.put("Grupo","Série dos Lantanídeos - 3B");
        cv.put("Periodo","6");
        cv.put("Nome","Cério");
        cv.put("Simbolo","Ce");
        cv.put("Massa",140.12);
        cv.put("Ponto_fusao",798.0);
        cv.put("Ponto_ebulicao",3468.0);
        cv.put("Estado","1");
        cv.put("Descricao","A indústria de vidros utiliza o cério para vários usos, como em polimento, descoloração e pigmentação. O elemento também possui aplicação no campo dos catalisadores, como no controle da emissão automotiva, tratamento de rejeitos líquidos, craqueamento do petróleo e diversos processos orgânicos.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",59);
        cv.put("Grupo","Série dos Lantanídeos - 3B");
        cv.put("Periodo","6");
        cv.put("Nome","Praseodímio");
        cv.put("Simbolo","Pr");
        cv.put("Massa",145.0);
        cv.put("Ponto_fusao",935.0);
        cv.put("Ponto_ebulicao",3127.0);
        cv.put("Estado","1");
        cv.put("Descricao","O praseodímio é usado em metais mistos, numa liga de elementos das terras raras contendo 5% de praseodímio e em pedras para isqueiros. Uma outra mistura de elementos das terras raras contendo 30% de praseodímio é usada como catalisador no cracking de óleo de crude.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",60);
        cv.put("Grupo","Série dos Lantanídeos - 3B");
        cv.put("Periodo","6");
        cv.put("Nome","Neodímio");
        cv.put("Simbolo","Nd");
        cv.put("Massa",144.24);
        cv.put("Ponto_fusao",1020.0);
        cv.put("Ponto_ebulicao",3030.0);
        cv.put("Estado","1");
        cv.put("Descricao","Ele é usado em aplicações em que uma elevada força magnética é necessária a partir do menor volume possível de material magnético. Mesmo pequenos ímãs de neodímio têm uma quantidade surpreendente de força magnética e são capazes de levantar mais de 1.000 vezes o seu próprio peso.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",61);
        cv.put("Grupo","Série dos Lantanídeos - 3B");
        cv.put("Periodo","6");
        cv.put("Nome","Promécio");
        cv.put("Simbolo","Pm");
        cv.put("Massa",145.0);
        cv.put("Ponto_fusao",931.0);
        cv.put("Ponto_ebulicao",2730.0);
        cv.put("Estado","4");
        cv.put("Descricao","O promécio é produzido artificialmente em reatores nucleares a partir da fissão do urânio, do tório e do plutônio. Alguns vestígios do metal foram encontrados no mineral pechblenda e identificados no espectro de uma estrela da constelação de Andrômeda. O promécio-147 tem interesse como fonte de energia de decaimentobeta, mas o promécio-146 e o promécio-148 que emitem radiação gama penetrante têm de ser primeiramente removidos. Pode ainda ser usado para converter luz em corrente elétrica, como fonte de energia para sondas e satélites e como portador de raios X.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",62);
        cv.put("Grupo","Série dos Lantanídeos - 3B");
        cv.put("Periodo","6");
        cv.put("Nome","Samário");
        cv.put("Simbolo","Sm");
        cv.put("Massa",150.36);
        cv.put("Ponto_fusao",1072.0);
        cv.put("Ponto_ebulicao",1900.0);
        cv.put("Estado","1");
        cv.put("Descricao","O samário tem aplicação como componente de ligas de cério (miskmetal) e utiliza-se para obter ligas apropriadas para ímanes permanentes e na dopagem de cristais nas técnicas de laser e maser. É ainda usado em reagentes orgânicos, vidros especiais, catalisadores e cerâmica.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",63);
        cv.put("Grupo","Série dos Lantanídeos - 3B");
        cv.put("Periodo","6");
        cv.put("Nome","Európio");
        cv.put("Simbolo","Eu");
        cv.put("Massa",151.96);
        cv.put("Ponto_fusao",826.0);
        cv.put("Ponto_ebulicao",1490.0);
        cv.put("Estado","1");
        cv.put("Descricao","O Európio é usado para fazer dopagem de vidros e plásticos para lasers; Utilização com o fósforo vermelho em tubos de raios catódicos para televisores e laser de infravermelho, e na fabricação de cristal líquido para tela de computadores; Utilização em alguns reatores nucleares como absorvedor de nêutrons.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",64);
        cv.put("Grupo","Série dos Lantanídeos - 3B");
        cv.put("Periodo","6");
        cv.put("Nome","Gadolíneo");
        cv.put("Simbolo","Gd");
        cv.put("Massa",157.25);
        cv.put("Ponto_fusao",1312.0);
        cv.put("Ponto_ebulicao",3000.0);
        cv.put("Estado","1");
        cv.put("Descricao","O gadolínio é reconhecido pela eficácia na identificação de lesões e tumores, além da baixa taxa de reações adversas.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",65);
        cv.put("Grupo","Série dos Lantanídeos - 3B");
        cv.put("Periodo","6");
        cv.put("Nome","Térbio");
        cv.put("Simbolo","Tb");
        cv.put("Massa",158.93);
        cv.put("Ponto_fusao",1356.0);
        cv.put("Ponto_ebulicao",2800.0);
        cv.put("Estado","1");
        cv.put("Descricao","O térbio é usado como um agente de impurezas em dispositivos de semicondutores. É também usado juntamente com óxido de zircónio como um estabilizador de cristal das células de fuel que operam a elevadas temperaturas e em ligas metálicas.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",66);
        cv.put("Grupo","Série dos Lantanídeos - 3B");
        cv.put("Periodo","6");
        cv.put("Nome","Disprósio");
        cv.put("Simbolo","Dy");
        cv.put("Massa",162.5);
        cv.put("Ponto_fusao",1407.0);
        cv.put("Ponto_ebulicao",2600.0);
        cv.put("Estado","1");
        cv.put("Descricao","O disprósio é usado, em conjunto com o vanádio e outros elementos, como componente de materiais para lasers. Sua alta secção eficaz de absorção de nêutrons térmicos e seu alto ponto de fusão sugerem sua utilidade para uso em barras de controle nuclear.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",67);
        cv.put("Grupo","Série dos Lantanídeos - 3B");
        cv.put("Periodo","6");
        cv.put("Nome","Hólmio");
        cv.put("Simbolo","Ho");
        cv.put("Massa",164.93);
        cv.put("Ponto_fusao",1470.0);
        cv.put("Ponto_ebulicao",2720.0);
        cv.put("Estado","1");
        cv.put("Descricao","Os sais e outros compostos de hólmio são utilizados na fabricação de vidros especiais, cerâmicas, dopagem de granadas para fabricação de lasers, catalisadores na produção de combustíveis e sínteses orgânicas.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",68);
        cv.put("Grupo","Série dos Lantanídeos - 3B");
        cv.put("Periodo","6");
        cv.put("Nome","Érbio");
        cv.put("Simbolo","Er");
        cv.put("Massa",167.26);
        cv.put("Ponto_fusao",1522.0);
        cv.put("Ponto_ebulicao",2900.0);
        cv.put("Estado","1");
        cv.put("Descricao","o érbio serve para amplificar o sinal luminoso que se propaga nos cabos ópticos na forma de lazer. Elas são fundamentais porque, na medida em que a luz trafega por uma rede óptica, ela vai sendo absorvida e seu sinal é atenuado");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",69);
        cv.put("Grupo","Série dos Lantanídeos - 3B");
        cv.put("Periodo","6");
        cv.put("Nome","Túlio");
        cv.put("Simbolo","Tm");
        cv.put("Massa",168.93);
        cv.put("Ponto_fusao",1545.0);
        cv.put("Ponto_ebulicao",1727.0);
        cv.put("Estado","1");
        cv.put("Descricao","O túlio tem sido usado em ligas para a tecnologia nuclear porque é um absorvente de nêutrons. O bombardeamento de Túlio-169 num reator nuclear pode ser usado como fonte de radiação em equipamentos portáteis de raios X.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",70);
        cv.put("Grupo","Série dos Lantanídeos - 3B");
        cv.put("Periodo","6");
        cv.put("Nome","Itérbio");
        cv.put("Simbolo","Yb");
        cv.put("Massa",173.04);
        cv.put("Ponto_fusao",820.0);
        cv.put("Ponto_ebulicao",1427.0);
        cv.put("Estado","1");
        cv.put("Descricao","Ele é utilizado na produção de ácidos, laser, em tubos de raios-X e na melhoria da resistência mecânica do aço, em forma de pó pode causar queimaduras nos olhos e riscos de explosões.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",71);
        cv.put("Grupo","Série dos Lantanídeos - 3B");
        cv.put("Periodo","6");
        cv.put("Nome","Lutécio");
        cv.put("Simbolo","Lu");
        cv.put("Massa",174.97);
        cv.put("Ponto_fusao",1675.0);
        cv.put("Ponto_ebulicao",3327.0);
        cv.put("Estado","1");
        cv.put("Descricao","O lutécio é um metal trivalente de coloração branco prateado, resistente a corrosão e relativamente estável em presença do ar. É o elemento mais pesado e duro de todas as terras raras. O lutécio é usado como catalisador nas reações de cracking catalítico, hidrogenação e alquilação e também pode ser utilizado em ligas metálicas.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",72);
        cv.put("Grupo","4B");
        cv.put("Periodo","6");
        cv.put("Nome","Háfnio");
        cv.put("Simbolo","Hf");
        cv.put("Massa",178.49);
        cv.put("Ponto_fusao",2227.0);
        cv.put("Ponto_ebulicao",5400.0);
        cv.put("Estado","1");
        cv.put("Descricao","O háfnio é pouco presente na crosta terrestre, mas possui aplicações importantes. Uma delas é na fabricação de barras de controles de nêutrons em reatores nucleares, as quais controlam as reações de fissão. Também pode ser usado na produção de superligas metálicas e em cerâmicas de alta temperatura. ");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",73);
        cv.put("Grupo","5B");
        cv.put("Periodo","6");
        cv.put("Nome","Tântalo");
        cv.put("Simbolo","Ta");
        cv.put("Massa",180.95);
        cv.put("Ponto_fusao",3017.0);
        cv.put("Ponto_ebulicao",5425.0);
        cv.put("Estado","1");
        cv.put("Descricao","Em temperaturas abaixo de 150°C o tântalo é quase completamente imune ao ataque químico, mesmo pela agressiva água régia. Tais propriedades fazem o tântalo ser amplamente utilizado na fabricação de ligas metálicas, capacitores para telefones celulares e outros dispositivos eletrônicos, fornos de alta temperatura, além de próteses e outros equipamentos cirúrgicos.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",74);
        cv.put("Grupo","6B");
        cv.put("Periodo","6");
        cv.put("Nome","Tungstênio");
        cv.put("Simbolo","W");
        cv.put("Massa",183.84);
        cv.put("Ponto_fusao",3422.0);
        cv.put("Ponto_ebulicao",5555.0);
        cv.put("Estado","1");
        cv.put("Descricao","O tungstênio elementar é usado em muitas aplicações de alta temperatura, como filamentos de lâmpadas, tubos de raios catódicos e válvulas termiônicas, resistências de aquecimento, e tubeiras de foguetes.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",75);
        cv.put("Grupo","7B");
        cv.put("Periodo","6");
        cv.put("Nome","Rênio");
        cv.put("Simbolo","Re");
        cv.put("Massa",186.21);
        cv.put("Ponto_fusao",3180.0);
        cv.put("Ponto_ebulicao",5597.0);
        cv.put("Estado","1");
        cv.put("Descricao","O rênio é utilizado, principalmente, como catalisador para o refino de petróleo e em ligas metálicas de alto desempenho, com grande resistência à temperatura, já que é o segundo metal de maior ponto de fusão da Tabela Periódica. ");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",76);
        cv.put("Grupo","8B");
        cv.put("Periodo","6");
        cv.put("Nome","Ósmio");
        cv.put("Simbolo","Os");
        cv.put("Massa",190.23);
        cv.put("Ponto_fusao",3027.0);
        cv.put("Ponto_ebulicao",5012.0);
        cv.put("Estado","1");
        cv.put("Descricao","Difícil de ser trabalhado, mesmo a altas temperaturas, o ósmio é usado principalmente como endurecedor em ligas de metais platínicos, antes de ser substituído pelo rutênio. Na forma de ligas, emprega-se na fabricação de contatos elétricos e de pontas de canetas.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",77);
        cv.put("Grupo","8B");
        cv.put("Periodo","6");
        cv.put("Nome","Irídio");
        cv.put("Simbolo","Ir");
        cv.put("Massa",192.22);
        cv.put("Ponto_fusao",2443.0);
        cv.put("Ponto_ebulicao",4527.0);
        cv.put("Estado","1");
        cv.put("Descricao","É empregado principalmente na produção de ligas de platina (que contém de 5 a 10% do elemento), mais duras e resistentes ao ataque químico que a platina pura. Essas ligas são usadas em canetas esferográficas, jóias, grampos e pinos cirúrgicos, contatos elétricos e pontos de ignição.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",78);
        cv.put("Grupo","8B");
        cv.put("Periodo","6");
        cv.put("Nome","Platina");
        cv.put("Simbolo","Pt");
        cv.put("Massa",195.08);
        cv.put("Ponto_fusao",1769.0);
        cv.put("Ponto_ebulicao",3627.0);
        cv.put("Estado","1");
        cv.put("Descricao","A platina é utilizada nos conversores catalíticos, nos equipamentos de laboratório, nos contatos elétricos e nos eletrodos, nas termorresistências, nos equipamentos odontológicos e na indústria de jóias.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",79);
        cv.put("Grupo","1B");
        cv.put("Periodo","6");
        cv.put("Nome","Ouro");
        cv.put("Simbolo","Au");
        cv.put("Massa",196.97);
        cv.put("Ponto_fusao",1063.0);
        cv.put("Ponto_ebulicao",2966.0);
        cv.put("Estado","1");
        cv.put("Descricao","Um dos usos mais tradicionais do ouro é o de fabricação de moedas, entretanto atualmente tem larga aplicação também na confecção de jóias (anéis, relógios, colares) e medalhas olímpicas na forma de ligas, além de confecção de componentes eletrônicos.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",80);
        cv.put("Grupo","2B");
        cv.put("Periodo","6");
        cv.put("Nome","Mercúrio");
        cv.put("Simbolo","Hg");
        cv.put("Massa",200.59);
        cv.put("Ponto_fusao",-39.0);
        cv.put("Ponto_ebulicao",357.0);
        cv.put("Estado","3");
        cv.put("Descricao","O mercúrio é um metal obtido através da ustulação de sulfetos e outros minerais. Ele é utilizado em garimpos, em antigas fábricas de cloro e soda (como catalisador em alguns processos químicos) e em pilhas de óxido de mercúrio.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",81);
        cv.put("Grupo","3A");
        cv.put("Periodo","6");
        cv.put("Nome","Tálio");
        cv.put("Simbolo","Tl");
        cv.put("Massa",204.38);
        cv.put("Ponto_fusao",303.0);
        cv.put("Ponto_ebulicao",1457.0);
        cv.put("Estado","1");
        cv.put("Descricao","O tálio está presente na crosta terrestre com concentração média de 1ppm (relativamente abundante, quando compara-se ao antimônio, bismuto ou prata), mas é economicamente inviável realizar sua extração direta: assim, geralmente é obtido como produto secundário de minerais de potássio.Atualmente é usado em detectores de radiação infravermelha, radiação gama, e em medicina nuclear. É encontrado e obtido a partir do mineral pirita e, também, é obtido como subproduto de minérios de chumbo e zinco.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",82);
        cv.put("Grupo","4A");
        cv.put("Periodo","6");
        cv.put("Nome","Chumbo");
        cv.put("Simbolo","Pb");
        cv.put("Massa",207.21);
        cv.put("Ponto_fusao",327.0);
        cv.put("Ponto_ebulicao",1755.0);
        cv.put("Estado","1");
        cv.put("Descricao","Em seu estado puro, o chumbo raramente é encontrado na natureza, pois existe uma quantidade pequena dele na crosta terrestre. Quando encontrado, geralmente está na forma de composto mineral. Ele também pode ser extraído do urânio e do tório, a partir da desintegração radioativa desses radioisótopos. O mais amplo uso do chumbo é na fabricação de acumuladores. Outras aplicações importantes são na fabricação de forros para cabos, elementos de construção civil, pigmentos, soldas suaves e munições. ");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",83);
        cv.put("Grupo","5A");
        cv.put("Periodo","6");
        cv.put("Nome","Bismuto");
        cv.put("Simbolo","Bi");
        cv.put("Massa",208.98);
        cv.put("Ponto_fusao",271.0);
        cv.put("Ponto_ebulicao",1560.0);
        cv.put("Estado","1");
        cv.put("Descricao","O bismuto é um metal quebradiço, de coloração prata esbranquiçada (embora sua superfície possa apresentar uma coloração levemente rósea), de baixo ponto de fusão e que reage com o oxigênio somente a temperaturas elevadas. O bismuto livres de chumbo são usados na fabricação de medicamentos, como remédios para diarreia, indigestão e dores estomacais. Também é utilizado na fabricação de procedimentos médicos e cosméticos, como tinturas para cabelo, sombras de olho e blush.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",84);
        cv.put("Grupo","6A");
        cv.put("Periodo","6");
        cv.put("Nome","Polônio");
        cv.put("Simbolo","Po");
        cv.put("Massa",209.0);
        cv.put("Ponto_fusao",254.0);
        cv.put("Ponto_ebulicao",962.0);
        cv.put("Estado","1");
        cv.put("Descricao","O polônio é utilizado normalmente como fonte de raios alfa para a pesquisa e a medicina, mas também, entre outras coisas, como fonte de calor nos veículos espaciais.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",85);
        cv.put("Grupo","7A");
        cv.put("Periodo","6");
        cv.put("Nome","Astato");
        cv.put("Simbolo","At");
        cv.put("Massa",210.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","5");
        cv.put("Descricao","O astato tem importância somente no campo teórico e não é conhecida aplicação prática deste elemento, provavelmente por ele ser tão radioativo que vaporiza a si mesmo quando ajustado em uma quantia apreciável.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",86);
        cv.put("Grupo","8A");
        cv.put("Periodo","6");
        cv.put("Nome","Radônio");
        cv.put("Simbolo","Rn");
        cv.put("Massa",222.0);
        cv.put("Ponto_fusao",-71.0);
        cv.put("Ponto_ebulicao",-62.0);
        cv.put("Estado","2");
        cv.put("Descricao","O Radônio é usado na radioterapia e na composição de cápsulas para aplicação em pacientes com câncer.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",87);
        cv.put("Grupo","1A");
        cv.put("Periodo","7");
        cv.put("Nome","Frâncio");
        cv.put("Simbolo","Fr");
        cv.put("Massa",223.0);
        cv.put("Ponto_fusao",27.0);
        cv.put("Ponto_ebulicao",680.0);
        cv.put("Estado","1");
        cv.put("Descricao","Não há aplicações comerciais para o frâncio devido a sua vida muito curta, também não é possível obter este elemento em quantidades comerciais significativas. Somente é usado em tarefas de investigação, tanto no campo da biologia como também no da estrutura atômica.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",88);
        cv.put("Grupo","2A");
        cv.put("Periodo","7");
        cv.put("Nome","Rádio");
        cv.put("Simbolo","Ra");
        cv.put("Massa",226.0);
        cv.put("Ponto_fusao",700.0);
        cv.put("Ponto_ebulicao",1737.0);
        cv.put("Estado","1");
        cv.put("Descricao","O rádio (geralmente na forma de cloreto de rádio) é usado em medicina para produzir o gás radônio, usado para o tratamento do câncer; Uma unidade da radioatividade, curie, se baseia na radioatividade do rádio-226; Hoje a grande maioria das pessoas que tem câncer necessitam do medicamento à base desse metal.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",89);
        cv.put("Grupo","Série dos Actinídeos - 3B");
        cv.put("Periodo","7");
        cv.put("Nome","Actínio");
        cv.put("Simbolo","Ac");
        cv.put("Massa",227.0);
        cv.put("Ponto_fusao",1050.0);
        cv.put("Ponto_ebulicao",3300.0);
        cv.put("Estado","6");
        cv.put("Descricao","O actínio tem relativamente poucas aplicações por que ele é um elemento sintético ou seja artificial.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",90);
        cv.put("Grupo","Série dos Actinídeos - 3B");
        cv.put("Periodo","7");
        cv.put("Nome","Tório");
        cv.put("Simbolo","Th");
        cv.put("Massa",232.04);
        cv.put("Ponto_fusao",1755.0);
        cv.put("Ponto_ebulicao",4690.0);
        cv.put("Estado","7");
        cv.put("Descricao","O tório é usado como componente de ligas aumentando a resistência ao fogo e ao calor dos materiais metálicos. Também se utiliza como aditivo de catalisadores mistos. Em reatores reprodutores, o tório é empregado na produção de urânio-233.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",91);
        cv.put("Grupo","Série dos Actinídeos - 3B");
        cv.put("Periodo","7");
        cv.put("Nome","Protactínio");
        cv.put("Simbolo","Pa");
        cv.put("Massa",231.04);
        cv.put("Ponto_fusao",1157.0);
        cv.put("Ponto_ebulicao",4027.0);
        cv.put("Estado","10");
        cv.put("Descricao","Não existe atualmente nenhum uso para o protactínio fora do âmbito da pesquisa científica básica.  ");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",92);
        cv.put("Grupo","Série dos Actinídeos - 3B");
        cv.put("Periodo","7");
        cv.put("Nome","Urânio");
        cv.put("Simbolo","U");
        cv.put("Massa",238.03);
        cv.put("Ponto_fusao",1132.0);
        cv.put("Ponto_ebulicao",4131.0);
        cv.put("Estado","11");
        cv.put("Descricao","O urânio com baixa concentração de U-235 (de 3% a 5%) é usado para a produção de combustível de usinas nucleares. O de concentração de pelo menos 20% é normalmente utilizado para pesquisas. Já o urânio com 90% de U-235 pode ser usado para a produção de armas nucleares.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",93);
        cv.put("Grupo","Série dos Actinídeos - 3B");
        cv.put("Periodo","7");
        cv.put("Nome","Netúnio");
        cv.put("Simbolo","Np");
        cv.put("Massa",237.0);
        cv.put("Ponto_fusao",640.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","12");
        cv.put("Descricao","Pode ser usado na composição de equipamentos para a detecção de nêutrons e como combustível nuclear, o Neptúnio é eu elemento sintético ou seja artificial . ");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",94);
        cv.put("Grupo","Série dos Actinídeos - 3B");
        cv.put("Periodo","7");
        cv.put("Nome","Plutônio");
        cv.put("Simbolo","Pu");
        cv.put("Massa",244.0);
        cv.put("Ponto_fusao",640.0);
        cv.put("Ponto_ebulicao",3327.0);
        cv.put("Estado","13");
        cv.put("Descricao","É o isótopo usado principalmente para a fabricação de armas nucleares, mas também é usado como combustível nuclear em reatores de energia e em projetos de pesquisa. O plutônio geralmente é produzido em reatores nucleares (isso é feito bombardeando átomos de urânio com os nêutrons que o reator produz) e usado como combustível em bombas atômicas. Mas ele também existe, em quantidades muito pequenas, na natureza – misturado às jazidas de urânio.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",95);
        cv.put("Grupo","Série dos Actinídeos - 3B");
        cv.put("Periodo","7");
        cv.put("Nome","Amerício");
        cv.put("Simbolo","Am");
        cv.put("Massa",243.0);
        cv.put("Ponto_fusao",994.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","14");
        cv.put("Descricao","O amerício é usado como fonte de ionização para detectores de fumos e o amerício-241 como fonte portátil de raios gama, o amerício não tem tantas aplicações por ser um elemento  sintético ou seja artificial");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",96);
        cv.put("Grupo","Série dos Actinídeos - 3B");
        cv.put("Periodo","7");
        cv.put("Nome","Cúrio");
        cv.put("Simbolo","Cm");
        cv.put("Massa",247.0);
        cv.put("Ponto_fusao",1067.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","15");
        cv.put("Descricao",":  O cúrio não é encontrado no ambiente terrestre, mas pode ocorrer artificialmente. Suas propriedades químicas são semelhantes aos elementos da série dos lantanídeos, e ele poderia ser facilmente confundido com um desses elementos se não fosse a sua radioatividade. O cúrio é usado em  fontes de energia portátil, em marcapassos e instrumentos de localização remotos.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",97);
        cv.put("Grupo","Série dos Actinídeos - 3B");
        cv.put("Periodo","7");
        cv.put("Nome","Berquélio");
        cv.put("Simbolo","Bk");
        cv.put("Massa",247.0);
        cv.put("Ponto_fusao",986.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","15");
        cv.put("Descricao","Não há aplicações desse elemento para outros fins além da pesquisa científica por ser um elemento sintético ou seja artificial.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",98);
        cv.put("Grupo","Série dos Actinídeos - 3B");
        cv.put("Periodo","7");
        cv.put("Nome","Califórnio");
        cv.put("Simbolo","Cf");
        cv.put("Massa",251.0);
        cv.put("Ponto_fusao",900.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","16");
        cv.put("Descricao","O califórnio possui aplicações muito específicas. O califórnio-252 constitui uma intensa fonte de neutrões, tornando-o útil em análises de ativações por neutrões e potencialmente útil como uma fonte de radiação em medicina (terapia do cancro).");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",99);
        cv.put("Grupo","Série dos Actinídeos - 3B");
        cv.put("Periodo","7");
        cv.put("Nome","Einstênio");
        cv.put("Simbolo","Es");
        cv.put("Massa",252.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","17");
        cv.put("Descricao","Não são conhecidos usos comerciais deste elemento, até agora amostras de einstênio só foram utilizados na produção de elementos mais pesados em laboratório. Como todos os elementos sintéticos transurânicos, isótopos de einstênio são altamente radioativos e muito perigosos à saúde.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",100);
        cv.put("Grupo","Série dos Actinídeos - 3B");
        cv.put("Periodo","7");
        cv.put("Nome","Férmio");
        cv.put("Simbolo","Fm");
        cv.put("Massa",257.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","18");
        cv.put("Descricao","O férmio não ocorre naturalmente na Natureza. É estudado em poucos laboratórios de investigação, onde a sua elevada radioatividade requer cuidados especiais de manuseamento e técnicas apropriadas. O férmio não possui aplicações por ser um elemento sintético ou seja artificial. ");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",101);
        cv.put("Grupo","Série dos Actinídeos - 3B");
        cv.put("Periodo","7");
        cv.put("Nome","Mendelévio");
        cv.put("Simbolo","Md");
        cv.put("Massa",258.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","19");
        cv.put("Descricao","O mendelévio não ocorre naturalmente na Natureza. Este é estudado em poucos laboratórios de investigação, onde a sua elevada radioatividade requer cuidados especiais de manuseamento e técnicas apropriadas. O mendelévio não possui aplicações por ser um elemento sintético ou seja artificial.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",102);
        cv.put("Grupo","Série dos Actinídeos - 3B");
        cv.put("Periodo","7");
        cv.put("Nome","Nobélio");
        cv.put("Simbolo","No");
        cv.put("Massa",259.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","20");
        cv.put("Descricao","O nobélio não ocorre naturalmente na Natureza. Este é estudado em poucos laboratórios de investigação, onde a sua elevada radioatividade requer cuidados especiais de manuseamento e técnicas apropriadas. O nobélio não possui aplicações por ser um elemento sintético ou seja artificial.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",103);
        cv.put("Grupo","Série dos Actinídeos - 3B");
        cv.put("Periodo","7");
        cv.put("Nome","Laurêncio");
        cv.put("Simbolo","Lr");
        cv.put("Massa",262.0);
        cv.put("Ponto_fusao",1627.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","21");
        cv.put("Descricao","O laurêncio não ocorre naturalmente na Natureza. Este é estudado em poucos laboratórios de investigação, onde a sua elevada radioatividade requer cuidados especiais de manuseamento e técnicas apropriadas. O laurêncio não possui aplicações.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",104);
        cv.put("Grupo","4B");
        cv.put("Periodo","7");
        cv.put("Nome","Rutherfórdio");
        cv.put("Simbolo","Rf");
        cv.put("Massa",263.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","22");
        cv.put("Descricao","O rutherfórdio não tem aplicações práticas, dado que seu isótopo mais estável tem cerca de duas horas e meia de tempo de meia-vida. Contudo, estudos em sistemas gasosos e em soluções comprovam sua similaridade química com os demais elementos do grupo 4, como zircônio e háfnio.  ");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",105);
        cv.put("Grupo","5B");
        cv.put("Periodo","7");
        cv.put("Nome","Dúbnio");
        cv.put("Simbolo","Db");
        cv.put("Massa",262.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","23");
        cv.put("Descricao","O dúbnio é um elemento artificial, não está presente na natureza, sendo sintetizado apenas em pequenas quantidades. Não há aplicações práticas para o dúbnio e desconhecem-se as suas reações com o ar, a água, os halogênios, os ácidos e as bases.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",106);
        cv.put("Grupo","6B");
        cv.put("Periodo","7");
        cv.put("Nome","Seabórgio");
        cv.put("Simbolo","Sg");
        cv.put("Massa",266.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","24");
        cv.put("Descricao","O seabórgio não apresenta aplicações práticas e desconhecem-se as suas reações com o ar, a água, os halogéneos, os ácidos e as bases por ser um elemento sintético ou seja artificial.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",107);
        cv.put("Grupo","7B");
        cv.put("Periodo","7");
        cv.put("Nome","Bóhrio");
        cv.put("Simbolo","Bh");
        cv.put("Massa",272.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","25");
        cv.put("Descricao","Este elemento não é encontrado naturalmente e é utilizado apenas na área de pesquisas por  ser um elemento sintético ou seja artificial. ");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",108);
        cv.put("Grupo","8B");
        cv.put("Periodo","7");
        cv.put("Nome","Hássio");
        cv.put("Simbolo","Hs");
        cv.put("Massa",277.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","26");
        cv.put("Descricao","O hássio não apresenta aplicações práticas. Além disso, não se tem conhecimento sobre suas reações com o ar, a água, os halogênios, os ácidos e as bases por ser um elemento sintético ou seja artificial.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",109);
        cv.put("Grupo","8B");
        cv.put("Periodo","7");
        cv.put("Nome","Meitnério");
        cv.put("Simbolo","Mt");
        cv.put("Massa",276.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","27");
        cv.put("Descricao","Meitnério não tem aplicação por ser um elemento sintético  ou seja artificial.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",110);
        cv.put("Grupo","8B");
        cv.put("Periodo","7");
        cv.put("Nome","Darmstadtio");
        cv.put("Simbolo","Ds");
        cv.put("Massa",281.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","28");
        cv.put("Descricao","Este elemento não apresenta aplicações práticas e desconhecem-se as suas reações com o ar, a água, os halogéneos, os ácidos e as bases por ser um  elemento sintético ou seja artificial. ");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",111);
        cv.put("Grupo","1B");
        cv.put("Periodo","7");
        cv.put("Nome","Roentgênio");
        cv.put("Simbolo","Rg");
        cv.put("Massa",280.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","29");
        cv.put("Descricao","Este elemento não apresenta aplicações práticas e desconhecem-se as suas reações com o ar, a água, os halogéneos, os ácidos e as bases por ser um elemento sintético ou seja artificial.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",112);
        cv.put("Grupo","2B");
        cv.put("Periodo","7");
        cv.put("Nome","Copernício");
        cv.put("Simbolo","Cn");
        cv.put("Massa",285.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","26");
        cv.put("Descricao","O Copernício não tem aplicação por ser um elemento sintético ou seja artificial.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",113);
        cv.put("Grupo","3A");
        cv.put("Periodo","7");
        cv.put("Nome","Nihônio");
        cv.put("Simbolo","Nh");
        cv.put("Massa",286.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","30");
        cv.put("Descricao","Não pode ser encontrado na natureza, pois para obtê-lo a sua estrutura tem de ser modificada para chegar a um resultado exato. O elemento atualmente não possui nenhum uso, por ser quase desconhecido.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",114);
        cv.put("Grupo","4A");
        cv.put("Periodo","7");
        cv.put("Nome","Fleróvio");
        cv.put("Simbolo","Fl");
        cv.put("Massa",289.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","24");
        cv.put("Descricao"," É um elemento químico sintético extremamente radioativo, provavelmente metálico, sólido e de aspecto prateado.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",115);
        cv.put("Grupo","5A");
        cv.put("Periodo","7");
        cv.put("Nome","Moscóvio");
        cv.put("Simbolo","Mc");
        cv.put("Massa",288.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","31");
        cv.put("Descricao","Antes de ter sido nomeado oficialmente, o moscóvio era chamado pelo nome temporário de Ununpêntio (Uup). Ele é colocado como o maior membro do grupo 15 (5A), embora um isótopo estável não é ainda suficientemente conhecido para permitir experimentos químicos que confirmem sua posição como um pesado homólogo do bismuto.  Moscóvio  é elemento sintético ou seja artificial.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",116);
        cv.put("Grupo","6A");
        cv.put("Periodo","7");
        cv.put("Nome","Livermório");
        cv.put("Simbolo","Lv");
        cv.put("Massa",292.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","1");
        cv.put("Descricao","Em função de sua instabilidade, bem como seu reduzido tempo de meia-vida e dificuldade de coleta, não há maneiras viáveis de aplicações industriais ou comerciais para este elemento. Sua implementação se limita apenas para pesquisa científica por ser um elemento sintético ou seja artificial . ");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",117);
        cv.put("Grupo","7A");
        cv.put("Periodo","7");
        cv.put("Nome","Tennessio");
        cv.put("Simbolo","Ts");
        cv.put("Massa",294.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","9");
        cv.put("Descricao","Não é encontrado na natureza na forma de nenhum isótopo e, por isso, deve ser produzido em laboratório, sendo portanto um elemento químico sintético. As propriedades do tenesso ainda estão sendo estudadas por meio da química teórica e dos cálculos matemáticos, tendo em vista sua baixa taxa de produção.");
        db.insert("Elementos",null,cv);

        cv.put("Num_atomico",118);
        cv.put("Grupo","8A");
        cv.put("Periodo","7");
        cv.put("Nome","Oganessônio");
        cv.put("Simbolo","Og");
        cv.put("Massa",294.0);
        cv.put("Ponto_fusao",0.0);
        cv.put("Ponto_ebulicao",0.0);
        cv.put("Estado","8");
        cv.put("Descricao","Devido a sua vida muito curta e a insuficiência de isótopos de vida longa, o elemento não possui aplicações.");
        db.insert("Elementos",null,cv);
    }
}
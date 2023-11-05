package com.quimicadigital.qumicadigital40.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class conexao extends SQLiteOpenHelper {

    private static final String DBName = "DBQuimica.db";
    Context context;

    public conexao(Context context){
        super(context,DBName, null, 1);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String qry = "CREATE TABLE Elementos (" +
                "   Num_atomico    INTEGER      PRIMARY KEY NOT NULL," +
                "   Grupo          TEXT NOT NULL," +
                "   Periodo        TEXT  NOT NULL," +
                "   Nome           TEXT NOT NULL," +
                "   Simbolo        TEXT  NOT NULL," +
                "   Massa          REAL (6, 2)  NOT NULL," +
                "   Ponto_fusao    REAL (6, 2)," +
                "   Ponto_ebulicao REAL (6, 2)," +
                "   Estado         INTEGER      REFERENCES Estado (Id_estado) NOT NULL," +
                "   Descricao      TEXT         NOT NULL);";
        db.execSQL(qry);

        qry="CREATE TABLE Estado (Id_estado INTEGER NOT NULL, descricao TEXT NOT NULL);";
        db.execSQL(qry);

        qry="CREATE TABLE Nox (num_atomico INTEGER NOT NULL, nox INTEGER NOT NULL, descricao TEXT);";
        db.execSQL(qry);

        qry="CREATE TABLE Recentes(Id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,descricao TEXT NOT NULL);";
        db.execSQL(qry);
    }
    public void inserir(){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        Povoar povoar = new Povoar(cv,db);
    }

    public SQLiteDatabase getDatabase(){return this.getReadableDatabase();}
    public SQLiteDatabase getDatabaseWritable(){return this.getWritableDatabase();}

    public boolean banco_povoado(){
        Cursor cursor = this.getReadableDatabase().rawQuery("Select num_atomico from Elementos where num_atomico = 1;",null);
        if(cursor.getCount() == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists Elementos");
        db.execSQL("drop table if exists Estado");
        db.execSQL("drop table if exists Nox");
        db.execSQL("drop table if exists Recentes");
        onCreate(db);
    }
}

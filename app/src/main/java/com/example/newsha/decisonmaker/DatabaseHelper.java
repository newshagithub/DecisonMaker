package com.example.newsha.decisonmaker;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by newsha on 11/16/16.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 2;
    private static final String DATABASE_NAME = "decisions.db";
    private static final String TABLE_NAME = "decision";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_TOPIC = "topic";
    private static final String COLUMN_OPTION = "option";
    private static final String COLUMN_FACTOR = "factor";
    private static final String COLUMN_WEIGHT = "weight";
    private static final String COLUMN_F1RATE = "f1rate";
    private static final String COLUMN_F2RATE = "f2rate";
    private static final String COLUMN_F3RATE = "f3rate";
    private static final String COLUMN_F4RATE = "f4rate";
    private static final String COLUMN_F5RATE = "f5rate";
    private static final String COLUMN_RESULT = "result";

    //declare variable here
    SQLiteDatabase db;
    private static String TABLE_CREATE = "CREATE TABLE " + TABLE_NAME +
            "(" + COLUMN_ID + " INTEGER NOT NULL UNIQUE, " +
            COLUMN_TOPIC + " TEXT NOT NULL, " +
            COLUMN_OPTION + " TEXT, " +
            COLUMN_FACTOR + " TEXT, " +
            COLUMN_WEIGHT + " INTEGER, " +
            COLUMN_F1RATE + " INTEGER, " +
            COLUMN_F2RATE + " INTEGER, " +
            COLUMN_F3RATE + " INTEGER, " +
            COLUMN_F4RATE + " INTEGER, " +
            COLUMN_F5RATE + " INTEGER, " +
            COLUMN_RESULT + " TEXT);";

    //constructor
    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //execute query here
        db.execSQL(TABLE_CREATE);
        this.db = db;
    }

    public void addDecision(Decision decision) {
        //make it writable to insert decision object into db
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();


        String query = "select * from "+TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        int count = cursor.getCount();

        values.put(COLUMN_ID, count); // would that work?! PK?
        values.put(COLUMN_TOPIC, decision.getTopic());
        values.put(COLUMN_OPTION, decision.getOption());
        values.put(COLUMN_FACTOR, decision.getFactor());
        values.put(COLUMN_WEIGHT, decision.getWeight());
        values.put(COLUMN_F1RATE, decision.getF1rate());
        values.put(COLUMN_F2RATE, decision.getF2rate());
        values.put(COLUMN_F3RATE, decision.getF3rate());
        values.put(COLUMN_F4RATE, decision.getF4rate());
        values.put(COLUMN_F5RATE, decision.getF5rate());
        values.put(COLUMN_RESULT, decision.getResult());


        db.insert(TABLE_NAME, null, values);
        db.close();
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //drop the table
        String query = "DROP TABLE IF EXISTS "+TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }

    // operations



    // Getting single decision result
    public Decision getDecisionByTopic(String topic) {

        Decision decision = null;

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_NAME, new String[]{
                        COLUMN_TOPIC,
                        COLUMN_RESULT},
                COLUMN_TOPIC + "=?", new String[]{topic}, null, null, null, null);

        if (cursor != null) {
            cursor.moveToFirst();
        }

        decision = new Decision(cursor.getString(0),
                Integer.parseInt(cursor.getString(1)));

        return decision;

    }

   // public List<Result> getListResultByDecisionTopic(int topic) {

   //     List<Result> listResult = null;

   //     SQLiteDatabase db = this.getWritableDatabase();

   //     String query = "SELECT option, result"
    //            + "FROM decision"
    //            + "WHERE topic = " + topic;

    //    Cursor cursor = db.rawQuery(query, null);

    //    if (cursor.moveToFirst()) {
    //        listResult = new ArrayList<>();
    //        do {
    //            Result result = new Result(
    //                    cursor.getString(0),
    //                    Integer.parseInt(cursor.getString(1))
    //            );
    //            listResult.add(result);
    //        } while (cursor.moveToNext());
    //    }

    //    return listResult;

    //}

   // public List<Result> getListFactorByDecisionTopic(int topic) {

    //    List<Result> listResult = null;

    //    SQLiteDatabase db = this.getWritableDatabase();

    //    String query = "SELECT factor, weight"
    //            + "FROM decision"
    //            + "WHERE topic = " + topic;

    //    Cursor cursor = db.rawQuery(query, null);

    //    if (cursor.moveToFirst()) {
    //        listResult = new ArrayList<>();
    //        do {
    //            Result result = new Result(
    //                    cursor.getString(0),
    //                    Integer.parseInt(cursor.getString(1))
    //            );
    //            listResult.add(result);
    //        } while (cursor.moveToNext());
    //    }

    //    return listResult;

    //}

    //public List<Result> getListOptionByDecisionTopic(int topic) {

    //    List<Result> listResult = null;

     //   SQLiteDatabase db = this.getWritableDatabase();

     //   String query = "SELECT option"
     //           + "FROM decision"
     //           + "WHERE topic = " + topic;

     //   Cursor cursor = db.rawQuery(query, null);

     //   if (cursor.moveToFirst()) {
     //       listResult = new ArrayList<>();
     //       do {
     //           Result result = new Result(
     //                   cursor.getString(0)
     //           );
     //           listResult.add(result);
    //        } while (cursor.moveToNext());
    //    }

    //    return listResult;

   // }

}


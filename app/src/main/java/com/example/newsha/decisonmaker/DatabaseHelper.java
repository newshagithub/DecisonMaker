package com.example.newsha.decisonmaker;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by newsha on 11/16/16.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
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
            COLUMN_OPTION + " TEXT NOT NULL, " +
            COLUMN_FACTOR + " TEXT NOT NULL, " +
            COLUMN_WEIGHT + " INTEGER NOT NULL, " +
            COLUMN_F1RATE + " INTEGER NOT NULL, " +
            COLUMN_F2RATE + " INTEGER NOT NULL, " +
            COLUMN_F3RATE + " INTEGER NOT NULL, " +
            COLUMN_F4RATE + " INTEGER NOT NULL, " +
            COLUMN_F5RATE + " INTEGER NOT NULL, " +
            COLUMN_RESULT + " TEXT NOT NULL);";

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
}


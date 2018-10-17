package com.patenio.simplenotetakingapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.provider.Telephony.Mms.Part.TEXT;

public class DbHelper extends SQLiteOpenHelper {

    public static final String TAG = "DbHelper";

    public static final int DATABASE_VERSION = 1;
    public static final  String DATABASE_NAME = "app.db";

    public static final String TABLENOTE = "notes";
    public static final String ID = "id";
    public static final String TITLE = "Title";
    public static final String BODY = "body";
    public static final String CREATEDAT = "Create_t";
    public static final String UPDATE = "Update_t";

    public DbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase){
        String createnotetable = " CREATE TABLE " + TABLENOTE + "(" + ID + " INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, "
                + TITLE + "TEXT," +
                BODY + "TEXT," +
                CREATEDAT + "TEXT," +
                UPDATE + "TEXT" +")";

        sqLiteDatabase.execSQL(createnotetable);
    }

    @Override
    public void onUpgrade (SQLiteDatabase sqLiteDatabase, int i, int il){

    }
}


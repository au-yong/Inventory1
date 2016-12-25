package com.example.user.inventory1.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.user.inventory1.data.InventoryContract.InventoryEntry;
/**
 * Created by User on 25/12/2016.
 */

public class InventoryDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "inventory.db";

    private static final String createDatabase = "CREATE TABLE "
            +InventoryEntry.TABLE_NAME
            +" ("+InventoryEntry._ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"
            +InventoryEntry.STOCK_NAME+" TEXT NOT NULL,"
            +InventoryEntry.STOCK_TYPE+" TEXT,"
            +InventoryEntry.STOCK_COST+" TEXT,"
            +InventoryEntry.STOCK_DATE+" TEXT NOT NULL);";


    private static final String upgradeDatabase = "DROP IF TABLE EXISTS" + InventoryEntry.TABLE_NAME;

    public InventoryDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Log.d("the database","is created");
        sqLiteDatabase.execSQL(createDatabase);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

        sqLiteDatabase.execSQL(upgradeDatabase);
        onCreate(sqLiteDatabase);
    }
}

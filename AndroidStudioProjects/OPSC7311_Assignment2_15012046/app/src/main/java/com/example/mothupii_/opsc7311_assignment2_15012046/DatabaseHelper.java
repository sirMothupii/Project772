package com.example.mothupii_.opsc7311_assignment2_15012046;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.IOException;

import static android.content.ContentValues.*;

/**
 * Created by Mothupii_ on 2017-05-10.
 */

public class DatabaseHelper extends SQLiteOpenHelper
{
    public static final String DATABASE_NAME = "Employee.db";
    public static final String TABLE_NAME = "Employee_Table";
    public static final String COL_1 = "EmployeeID";
    public static final String COL_2 = "FullNames";
    public static final String COL_3 = "Profession";
    public static final String COL_4 = "Salary";

    public DatabaseHelper(Context context)
    {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        //Exceptional handling to prevent errors
        try
        {
            //intantiating/declaring global variable
            String createTable;
            String craeateTable = "create table";

            db.execSQL("create table" +TABLE_NAME + " (EMPLOYEE ID PRIMARY KEY AUTOINCREMENT,NAME TEXT, FULL NAMES TEXT, PROFESSION TEXT, SALARY TEXT)");
        }
        catch (Exception exc)
        {
            exc.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String EmployeeID, String FullNames, String Profession, String Salary)
    {
        SQLiteDatabase db = this.getReadableDatabase();

        //Instance of a class contentValue
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, EmployeeID);
        contentValues.put(COL_2, FullNames);
        contentValues.put(COL_3, Profession);
        contentValues.put(COL_4, Salary);

        //Inserting db instance
        long result = db.insert(TABLE_NAME, null, contentValues);

        //if statements to check if values inserted return true
        if (result == -1) {
            return false;
        }
        else
        {
            return true;
        }
    }
        //Method to dispaly data on the android device
        public Cursor getData()
    {
    //Query to get all the data
    SQLiteDatabase db = this.getReadableDatabase();

    //creating the instance of the cursor class
    Cursor res = db.rawQuery("select * from" + TABLE_NAME, null);
    return res;

    }

    public boolean updateData(String EmployeeID, String FullNames, String Profession, String Salary)
    {


        //create SQLite database instance
        SQLiteDatabase db = this.getReadableDatabase();

        //creating an instance of content values
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, EmployeeID);
        contentValues.put(COL_2, FullNames);
        contentValues.put(COL_3, Profession);
        contentValues.put(COL_4, Salary);

        db.update(TABLE_NAME, contentValues, "Employee ID = ?",new String[]{EmployeeID});
        return true;
    }

    public Integer deleteData (String EmployeeID)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.delete(TABLE_NAME, "EmployeeID = ?", new String[] {EmployeeID});
    }
}



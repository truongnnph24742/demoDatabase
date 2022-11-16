package com.example.myapplicationd;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class NghesiDAO {
    MyDBHelper myDBHelper;
    SQLiteDatabase database;
    public NghesiDAO(Context context){
        myDBHelper = new MyDBHelper(context);
        database = myDBHelper.getWritableDatabase();

    }
    public ArrayList<nghesi> selectall(){
        ArrayList<nghesi> list = new ArrayList<>();
        database = myDBHelper.getReadableDatabase();
        Cursor c = database.rawQuery("SELECT * FROM NGHESI",null);
        if(c.moveToFirst()){
            while (!c.isAfterLast()){
                nghesi ls = new nghesi();
                ls.setId_ns(c.getInt(0));
                ls.setName_ns(c.getString(1));
                list.add(ls);
                c.moveToNext();
            }
        }

        return list;
    }
}

package com.example.myapplicationd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDBHelper extends SQLiteOpenHelper {
    final static String db_name = "curd";
    final static int verion = 1;

    public MyDBHelper(Context context) {
        super(context, db_name, null,verion);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String NgheSi = "CREATE TABLE NGHESI(id_ns integer primary key autoincrement, ten_ns text)";
        String baiHat = "CREATE TABLE  BAIHAT(id_bh integer primary key autoincrement, ten_bh text, id_ns references NGHESI(id_ns) )";
        sqLiteDatabase.execSQL(NgheSi);
        sqLiteDatabase.execSQL(baiHat);

        sqLiteDatabase.execSQL("INSERT INTO NGHESI VALUES(1,'Sơn Từng'),(2,'Mono'),(3,'Binz'),(4,'Đen vâu')");
        sqLiteDatabase.execSQL("INSERT INTO BAIHAT VALUES(1,'Nắng ấm xa dần',1),(2,'Cơn mua ngang qua',1),(3,'Waiting for you',2)," +
                        "(4,'Lối nhỏ',4),(5,'Em là',2),(6,'Cao gót',3),(7,'Đưa nhau đi trốn',4)"
                );


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

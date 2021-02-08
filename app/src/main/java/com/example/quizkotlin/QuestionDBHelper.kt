package com.example.quizkotlin

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.quizkotlin.DatabaseManager.QuestionEntry.COLUMN_OPZIONE1
import com.example.quizkotlin.DatabaseManager.QuestionEntry.COLUMN_OPZIONE2
import com.example.quizkotlin.DatabaseManager.QuestionEntry.COLUMN_OPZIONE3
import com.example.quizkotlin.DatabaseManager.QuestionEntry.COLUMN_RISPOSTA
import com.example.quizkotlin.DatabaseManager.QuestionEntry.COLUMN_RISPOSTA_UTENTE
import com.example.quizkotlin.DatabaseManager.QuestionEntry.COLUMN_TESTO
import com.example.quizkotlin.DatabaseManager.QuestionEntry.TABLE_NAME
import com.example.quizkotlin.DatabaseManager.QuestionEntry._ID

class QuestionDBHelper(context : Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "myquestions.db"
        private const val DATABASE_VERSION = 1
        private const val SQL_CREATE_DIARY_TABLE = "CREATE TABLE $TABLE_NAME (" +
                "$_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$COLUMN_TESTO TEXT, "+
                "$COLUMN_OPZIONE1 TEXT, "+
                "$COLUMN_OPZIONE2 TEXT, "+
                "$COLUMN_OPZIONE3 TEXT, "+
                "$COLUMN_RISPOSTA INTEGER, "+
                "$COLUMN_RISPOSTA_UTENTE INTEGER )"

        private const val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS $TABLE_NAME"

    }
    override fun onCreate(db: SQLiteDatabase?) {
        db!!.execSQL(SQL_CREATE_DIARY_TABLE)
        // Popolarla, con excSQL
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL(SQL_DELETE_ENTRIES)
    }
}
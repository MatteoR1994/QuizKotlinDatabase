package com.example.quizkotlin

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.quizkotlin.DatabaseManager.QuestionEntry.COLUMN_OPZIONE1
import com.example.quizkotlin.DatabaseManager.QuestionEntry.COLUMN_OPZIONE2
import com.example.quizkotlin.DatabaseManager.QuestionEntry.COLUMN_OPZIONE3
import com.example.quizkotlin.DatabaseManager.QuestionEntry.COLUMN_RISPOSTA
import com.example.quizkotlin.DatabaseManager.QuestionEntry.COLUMN_RISPOSTAU
import com.example.quizkotlin.DatabaseManager.QuestionEntry.COLUMN_TESTO
import com.example.quizkotlin.DatabaseManager.QuestionEntry.TABLE_NAME
import com.example.quizkotlin.DatabaseManager.QuestionEntry._ID

class QuestionDBHelper(context : Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "myquestions.db"
        private const val DATABASE_VERSION = 2
        private const val SQL_CREATE_DIARY_TABLE = "CREATE TABLE $TABLE_NAME (" +
                "$_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$COLUMN_TESTO TEXT, "+
                "$COLUMN_OPZIONE1 TEXT, "+
                "$COLUMN_OPZIONE2 TEXT, "+
                "$COLUMN_OPZIONE3 TEXT, "+
                "$COLUMN_RISPOSTA INTEGER, "+
                "$COLUMN_RISPOSTAU INTEGER )"

        private const val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS $TABLE_NAME"

    }
    override fun onCreate(db: SQLiteDatabase?) {
        db!!.execSQL(SQL_CREATE_DIARY_TABLE)
        popolateDB(db)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL(SQL_DELETE_ENTRIES)
        db!!.execSQL(SQL_CREATE_DIARY_TABLE)
        popolateDB(db)
    }

    override fun onDowngrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL(SQL_DELETE_ENTRIES)
        db!!.execSQL(SQL_CREATE_DIARY_TABLE)
        popolateDB(db)
    }
    fun popolateDB(db: SQLiteDatabase?) {
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('Cos è il polimorfismo?','Un animale africano','La capacità di un reference x di puntare ad un oggetto che implementa/estende x','Una pratica carnevalesca',1,null)")
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('Cos è una classe?','Una questione di stile','Un social network','Un tipo di dato definito da stato e comportamento',2,null)")
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('Perchè studiamo kotlin?','Perchè java è superato per le app android','Mi piace come suona il nome','Per masochismo',0,null)")
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('Come si definisce il layout grafico di un app?','Con le mani','Con un file XML','Non lo so',1,null)")
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('Come viene definita una mappa?','Una carta geografica per non farmi perdere','Una lista custom','Una struttura dati con un set di chiavi e una collection di dati',2,null)")
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('Posso modificare una variabile dichiarata come val?','No','Si','Che ne so',0,null)")
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('L ereditarietà e il polimorfismo sono due dei tre pilastri della programmazione ad oggetti, sai il terzo?','Incapsulamento','Array','Biscotti',0,null)")
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('URL sta per...','Uniform Resource Result','Unilateral Resource Replace','Uniform Resource Locator',2,null)")
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('Un interfaccia può mantenere uno stato?','Si','No','Forse',1,null)")
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('Definizione di Entity','Classe che rappresenta una riga di una tabella','Presenza demoniaca','Tipo di dato statico',0,null)")
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('L insieme delle colonne da selezionare in un database è definito','Persistenza','Proiezione','JSON',1,null)")
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('Un programmatore che lavora sia in Backend che Frontend si dice...','Malato','Full programmer','Fullstack developer',2,null)")
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('Una set ammette valori duplicati?','No','Si','Se ne ha voglia',0,null)")
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('LIFO sta per?','Lazy Input Fake Output','Last Ingress First Output','Last In First Out',2,null)")
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('La sintassi per definire che la classe Gatto estende animale è...','class Gatto() : Animale() {...}','class Gatto() -> Animale() {...}','class Gatto() &% Animale() {...}',0,null)")
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('Kotlin deriva da Java?','Può darsi','Si','No',1,null)")
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('onStart viene chiamato prima di OnCreate?','Si','A volte','No',2,null)")
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('Cos è una funzione?','Una cosa che fa cose per fare cose','Codice scritto in ASSEMBLY','Un blocco di codice identificato da un nome ed eseguibile più volte',2,null)")
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('Il database usato da Android è:','MySQL','SQLite','PostgreSQL',1,null)")
        db!!.execSQL("INSERT INTO $TABLE_NAME($COLUMN_TESTO,$COLUMN_OPZIONE1,$COLUMN_OPZIONE2,$COLUMN_OPZIONE3,$COLUMN_RISPOSTA,$COLUMN_RISPOSTAU) " +
                "VALUES('Come si può anche definire un ciclo che fa 10 giri oltre a: for(i in 0..9) {...}','for(i in 0..11) {...}','for(i in 0 until 10) {...}','for(i in 0..10) {...}',1,null)")
    }
}
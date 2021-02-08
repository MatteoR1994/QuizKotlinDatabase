package com.example.quizkotlin

import android.provider.BaseColumns

object DatabaseManager {

    object QuestionEntry : BaseColumns {

        const val TABLE_NAME ="domande"

        const val _ID = BaseColumns._ID

        const val COLUMN_TESTO = "testo"

        const val COLUMN_OPZIONE1 = "opzione1"

        const val COLUMN_OPZIONE2 = "opzione2"

        const val COLUMN_OPZIONE3 = "opzione3"

        const val COLUMN_RISPOSTA = "risposta"

        const val COLUMN_RISPOSTA_UTENTE = "risposta utente"

    }
}
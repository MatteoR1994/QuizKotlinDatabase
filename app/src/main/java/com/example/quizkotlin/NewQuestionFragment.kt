package com.example.quizkotlin

import android.content.ContentValues
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation
import com.example.quizkotlin.DatabaseManager.QuestionEntry.TABLE_NAME

class NewQuestionFragment : Fragment() {

    lateinit var editTextDomanda: EditText
    lateinit var editTextRisposta1: EditText
    lateinit var editTextRisposta2: EditText
    lateinit var editTextRisposta3: EditText
    lateinit var editTextRispostaEsatta: EditText
    lateinit var buttonInserisciDomanda: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_new_question, container, false)
        editTextDomanda = v.findViewById(R.id.inputQuestion)
        editTextRisposta1 = v.findViewById(R.id.risposta1)
        editTextRisposta2 = v.findViewById(R.id.risposta2)
        editTextRisposta3 = v.findViewById(R.id.risposta3)
        editTextRispostaEsatta = v.findViewById(R.id.rispostaEsatta)
        buttonInserisciDomanda = v.findViewById(R.id.insertButton)
        buttonInserisciDomanda.setOnClickListener{
            insertQuestion()
        }
        return v
    }
    fun insertQuestion() {
        val domandaInserita = editTextDomanda.text.toString()
        val risposta1 = editTextRisposta1.text.toString()
        val risposta2 = editTextRisposta2.text.toString()
        val risposta3 = editTextRisposta3.text.toString()
        val rispostaEsatta = editTextRispostaEsatta.text.toString().toInt()

        val mDBHelper = QuestionDBHelper(requireContext())

        val db = mDBHelper.writableDatabase
        // syntactic sugar
        val values = ContentValues().apply {
            put(DatabaseManager.QuestionEntry.COLUMN_TESTO, domandaInserita)
            put(DatabaseManager.QuestionEntry.COLUMN_OPZIONE1, risposta1)
            put(DatabaseManager.QuestionEntry.COLUMN_OPZIONE2, risposta2)
            put(DatabaseManager.QuestionEntry.COLUMN_OPZIONE3, risposta3)
            put(DatabaseManager.QuestionEntry.COLUMN_RISPOSTA, rispostaEsatta)
            put(DatabaseManager.QuestionEntry.COLUMN_RISPOSTAU, -1)
        }


        val rowId = db.insert(TABLE_NAME, null, values)
    }
}
package com.example.quizkotlin

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CustomAdapter(val lista: MutableList<String>) : BaseAdapter() {
    override fun getCount() = lista.size

    override fun getItem(position: Int) = lista[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val context = parent?.context
        var rowView = convertView
        val inflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        if(rowView == null) {
            rowView = inflater.inflate(R.layout.riepilogo_lista_elemento,parent,false)
        }

        val numeroDomanda = rowView?.findViewById<TextView>(R.id.textView3)
        val numero = position + 1
        numeroDomanda?.text = numero.toString()

        val esitoRisposta = QuestionarioMemoria.riepilogo[position]
        if(esitoRisposta == "ESATTO") {
            val testoEsito = rowView?.findViewById<TextView>(R.id.textView4)
            testoEsito?.setTextColor(Color.GREEN)
            testoEsito?.text = esitoRisposta
        } else {
            val testoEsito = rowView?.findViewById<TextView>(R.id.textView4)
            testoEsito?.setTextColor(Color.RED)
            testoEsito?.text = esitoRisposta
        }

        val testoDomanda = rowView?.findViewById<TextView>(R.id.textView5)
        testoDomanda?.text = QuestionarioMemoria.questions[position].question

        return rowView!!
    }
}
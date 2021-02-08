package com.example.quizkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ListView
import androidx.navigation.Navigation

class LoserFragment : Fragment() {
    lateinit var playAgainButtonLoser: Button
    lateinit var listaRiepilogo2: ListView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_loser, container, false)
        playAgainButtonLoser = v.findViewById(R.id.buttonLoserPlayAgain)
        listaRiepilogo2 = v.findViewById(R.id.listaRisultati3)
        //val adapter = ArrayAdapter(v.context,android.R.layout.simple_list_item_1,Questionario.riepilogo)
        val adapter = CustomAdapter(QuestionarioMemoria.riepilogo)
        listaRiepilogo2.adapter = adapter
        playAgainButtonLoser.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_loserFragment_to_questionFragment)
        )
        return v
    }
}
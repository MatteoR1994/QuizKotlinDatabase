package com.example.quizkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ListView
import androidx.navigation.Navigation

class WinnerFragment : Fragment() {
    lateinit var playAgainButtonWinner: Button
    lateinit var listaRiepilogo: ListView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_winner, container, false)
        playAgainButtonWinner = v.findViewById(R.id.buttonWinnerPlayAgain)
        listaRiepilogo = v.findViewById(R.id.riepilogoRisultati)
        //val adapter = ArrayAdapter(v.context,android.R.layout.simple_list_item_1,Questionario.riepilogo)
        //val adapter = CustomAdapter(QuestionarioMemoria.riepilogo)
        //listaRiepilogo.adapter = adapter
        playAgainButtonWinner.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_winnerFragment_to_questionFragment)
        )
        return v
    }
}
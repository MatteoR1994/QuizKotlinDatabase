package com.example.quizkotlin

class QuestionarioMemoria() : Questionario {
        override val questions= mutableListOf(
            Question("Cos'è una classe?", listOf(
                "una questione di stile",
                "un social network",
                "un tipo di dato definito da stato e comportamento"
            ),2),
            Question("Cos'è il polimorfismo?", listOf(
                "un animale africano",
                "la capacità di un reference x di puntare ad un oggetto che implementa/estende x",
                "una pratica carnevalesca"
            ),1),
            Question("Perchè studiamo kotlin", listOf(
                "perchè java è superato per le app android",
                "mi piace come suona il nome",
                "per masochismo"
            ),0),
            Question("cos'è una variabile?", listOf(
                "è un contenitore di dati",
                "è una classe",
                "è una funzione"
            ),0),
            Question("Perchè studiamo kotlin", listOf(
                "perchè java è superato per le app android",
                "mi piace come suona il nome",
                "per masochismo"
            ),0),
            Question("Quali sono i tipi di variabili?", listOf(
                "numeri interi, numeri con la virgola, booleani, caratteri e stringe",
                "numeri non interi, caratteri e stringhe",
                "numeri senza virgola, numeri interi e booleani"
            ),0),
            Question("Quali sono le due sintassi delle variabili?", listOf(
                "vr e vl",
                "var, val e va",
                "var e val"
            ),2),
            Question("Cosa fanno gli array?", listOf(
                "permettono di raccogliere una sequenza di classi",
                "permettono di raccogliere una sequenza di oggetti di tipo omogeneo",
                "permettono di raccogliere una sequenza di variabili"
            ),1),
            Question("Cosa determina il costrutto if?", listOf(
                "determina se devono essere eseguite le operazioni indicate, in base ad un valore booleano contenuto in una variabile o restituito come risultato di un'espressione" +
                "determina se devono essere eseguite le operazioni indicate, in base a string",
                "determina se devono essere eseguite le operazioni indicate, in base a numeri interi"
            ),0),
            Question("Cos'è una classe astratta?", listOf(
                "una classe di valori",
                "una classe inutile",
                "una classe che non può essere instanziata"
            ),2),
            Question("Cos'è una classe astratta pura?", listOf(
                "una classe senza difetti",
                "Una classe astratta che implementa solo metodi e proprietà astratte",
                "una classe senza metodi diversi"
            ),1),
            Question("Cosa implementano le classi astratte?", listOf(
                "il concetto di ereditarietà",
                "il concetto di polimorfismo",
                "le classi normali"
            ),1),
            Question("Come si definisce una classe astratta?", listOf(
                "le funzioni",
                "nulla",
                "bisogna anteporre alla definizione della classe la keyword abstract e i metodi astratti"
            ),2),
            Question("Cos'è un interfaccia?", listOf(
                "una collezione di metodi correlati",
                "una collezione di classi",
                "una collezione di dati"
            ),0),
            Question("Come funziona l'ereditarietà?", listOf(
                "crea nuova classe acquisendo un membro di una classe esistente",
                "crea una funzione",
                "crea un if"
            ),0),
            Question("Cos'è l’overriding?", listOf(
                "un meccanismo inutile",
                "il meccanismo che permette la sovrapposizione dei metodi di una superclasse da parte di una sottoclasse",
                "il meccanismo che permette la sovrapposizione dei metodi di una classe astratta da parte di una funzione"
            ),1),
            Question("Per poter sovrapporre un metodo proveniente da una superclasse cosa bisogna avere?", listOf(
                "lo stesso nome, lo stesso tipo di ritorno, la stessa lista di parametri e visibilità non inferiore",
                "niente",
                "una classe astratta"
            ),0),
            Question("La parola chiave super è utilizzata in Kotlin per riferirsi a quali elementi della classe base?", listOf(
                "proprieta e costrutti",
                "funzioni e variabili",
                "metodi, proprietà e variabili"
            ),2),
            Question("Con quali metoti viene inizializzato un array?", listOf(
                "arrayShort",
                "arrayInt",
                "arrayOf o con intArrayOf, byteArrayOf, floatArrayOf"
            ),2),
            Question("A cosa serve il metodo Equals?", listOf(
                "serve a gestire l'ugualianza tra gli oggetti",
                "serve a gestire le interfacce e le classi",
                "serve a gestire var e val"
            ),0),
        )
        //val riepilogo = Array<String>(3){""}
        //override val riepilogo = mutableListOf("","","")
}
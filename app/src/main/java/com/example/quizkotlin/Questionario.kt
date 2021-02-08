package com.example.quizkotlin

interface Questionario {
    val questions: MutableList<Question>?
    val riepilogo: MutableList<String>
}
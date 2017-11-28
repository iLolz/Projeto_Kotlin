package main

import java.util.*
import javax.swing.JOptionPane

class StringAlgorithm(description: String, title: String, author: String, version: Int) : Algorithm(description, title, author, version) {


    fun cesarCypher(inputText: String) :String
    {
        val shift: Int = 3
        var d: Char
        val Text = CharArray(inputText.length)
        for ((index, c) in inputText.withIndex()) {
            if (c in 'A'..'Z') {
                d = c + shift
                if (d > 'Z') d -= 26
            }
            else {
                if (c in 'a'..'z') {
                    d = c + shift
                    if (d > 'z') d -= 26
                } else
                    d = c
            }
            Text[index] = d
        }
        return Text.joinToString("")
    }



    fun countOcurrences(frase: String): String {
        var conta: Int = 0
        var resp: String = ""

        frase.toLowerCase()

        for (x in 'a'..'z') {
            for (i in frase) if (x == i) conta++

            if (conta != 0) {
                resp += (conta.toString() + x)
            }
            conta = 0
        }
        return resp
    }

    fun sheduleExpression(texto: String): String {
        var resp: String = ""
        var verif: Boolean = false


        for (x in texto.toUpperCase()) {
            // Verifica se ja foram inseridos os dias

            if (verif == false) {
                if (x == '2') resp += "Segunda - feira, "
                else if (x == '3') resp += "Terça - feira, "
                else if (x == '4') resp += "Quarta - feira, "
                else if (x == '5') resp += "Quinta - feira, "
                else if (x == '6') resp += "Sexta - feira, "
                else if (x == '7') resp += "Sábado, "
            }
            // Define o Turno
            if (x == 'M') {
                verif = true
                resp += "Manhã,"
            } else if (x == 'T') {
                verif = true
                resp += "Tarde,"
            } else if (x == 'N') {
                verif = true
                resp += "Noite,"
            }

            // verifica se String contem o turno
            if (resp.contains("Manhã")) {
                //Define os horários noturnos
                if (x == '1') resp += " 7h:00m,"
                if (x == '2') resp += " 7h:55m,"
                if (x == '3') resp += " 8h:50m,"
                if (x == '4') resp += " 10h:05m,"
                if (x == '5') resp += " 11h:10m."

            }
            // verifica se String contem turno
            if (resp.contains("Tarde")) {
                //Define horários noturnos
                if (x == '1') resp += " 13h:30m,"
                if (x == '2') resp += " 14h:25m,"
                if (x == '3') resp += " 15h:45m,"
                if (x == '4') resp += " 16h:40m,"
                if (x == '5') resp += " 17h:40m."

            }

            //verifica se String contem turno
            if (resp.contains("Noite")) {
                //Define horários noturnos
                if (x == '1') resp += " 19h:00m,"
                if (x == '2') resp += " 19h:50m,"
                if (x == '3') resp += " 21h:00m."
            }

        }
        return resp
    }

    fun cleanIpuntText(text: String): String {

        var cleanText: String = ""

        var verif: Boolean = false
        var verif1: Boolean = false
        var verif2: Boolean = false

        for (x in text) {

            verif = false
            verif1 = false
            verif2 = false

            for (y in 'a'..'z') {
                for (z in 'A'..'Z') {
                    for (w in '0'..'9') {
                        if ((x == y) && !verif) {
                            cleanText += x
                            verif = true
                        }
                        if ((x == z) && !verif1) {
                            cleanText += x
                            verif1 = true
                        }
                        if ((x == w) && !verif2) {
                            cleanText += x
                            verif2 = true
                        }
                    }
                }
            }
        }
        return cleanText
    }



}
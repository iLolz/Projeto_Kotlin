package main

import javax.swing.JOptionPane

fun countOcurrences(frase: String) : String {
    var conta: Int = 0
    var resp: String = ""

    for (x in 'a'..'z') {
        for (i in frase) if (x == i) conta++

        if (conta != 0) {
            resp += (conta.toString() + x + " ")
        }
        conta = 0
    }
    return resp
}
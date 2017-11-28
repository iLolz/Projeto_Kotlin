package main

import javax.swing.JOptionPane

fun main(args: Array<String>) {

    var text : String

    var op : Int = JOptionPane.showInputDialog("Digite a opção desejada : \n 1) Numeric Algorithm\n " +
            "2) String Algorithm ").toInt()


    if (op == 1) {
        text = JOptionPane.showInputDialog("Digite a String a ser analisada :")

        // main.countOcurrences chamada ->  A funçao main.countOcurrences verifica quantas vezes derterminado caracter aparece na sequencia inserida

        NumericAlgorithm("","","Sávio",2)


    } else if (op == 2) {
        text = JOptionPane.showInputDialog("Digite a String a ser analisada :").toString()

        StringAlgorithm("String Algorithm text manipulation", " Teste", "Alencar - Victória", 1)

        System.exit(0)

    } else {
        JOptionPane.showMessageDialog(null, " Opção Inválida! ")
        System.exit(0)
    }
}


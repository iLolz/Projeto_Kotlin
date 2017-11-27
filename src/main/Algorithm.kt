package main

open class Algorithm(val description: String, val title: String, val author: String, val version: Int = 1)


fun main(args: Array<String>) {
    val salg = StringAlgorithm("Just a test", "TOP", "SAVIOLLAGE", 1)
    val nalg = NumericAlgorithm("Just a test", "TOP", "SAVIOLLAGE", 1)
    var op: Int = 0
    var text: String = "0"
    // var aa: String = salg.createPattern()

    /*op = JOptionPane.showInputDialog("Digite a opção desejada : \n 1) Count Ocurrences\n 2) Shedule Expression").toInt()

    if (op == 1) {
        text = JOptionPane.showInputDialog("Digite a String a ser analisada :")

        /// main.countOcurrences chamada ->  A funçao main.countOcurrences verifica quantas vezes derterminado caracter aparece na sequencia inserida

        text = main.countOcurrences(text)

        JOptionPane.showMessageDialog(null, text)

    } else {
        if (op == 2) {
            text  = JOptionPane.showInputDialog("Digite a String a ser analisada :").toString()

            text = main.sheduleExpression(text)
            JOptionPane.showMessageDialog(null, text)

            System.exit(0)

        } else {
            JOptionPane.showMessageDialog(null, " Opção Inválida! ")
            System.exit(0)
        }
    }*/

    println("10 para base 62: " + nalg.shortenerEncode(10))
    println("20 para base 62: " + nalg.shortenerEncode(20))
    println("30 para base 62: " + nalg.shortenerEncode(30))
    println("70 para base 62: " + nalg.shortenerEncode(70))
    println("170 para base 62: " + nalg.shortenerEncode(170))
    println()
    println("A para base 10: " + nalg.shortenerDecode("A"))
    println("K para base 10: " + nalg.shortenerDecode("K"))
    println("U para base 10: " + nalg.shortenerDecode("U"))
    println("U para base 10: " + nalg.shortenerDecode("18"))
    println("2k para base 10: " + nalg.shortenerDecode("2k"))





}
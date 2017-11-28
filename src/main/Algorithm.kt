package main

import javax.swing.JOptionPane

open class Algorithm(val description: String, val title: String, val author: String, val version: Int = 1)


fun main(args: Array<String>) {
    val salg = StringAlgorithm("Just a test", "TOP", "SAVIOLLAGE", 1)
    val nalg = NumericAlgorithm("Just a test", "TOP", "SAVIOLLAGE", 1)

    // var aa: String = salg.createPattern()

    println("10 para base 62: " + nalg.shortenerEncode(10))
    println("20 para base 62: " + nalg.shortenerEncode(20))
    println("30 para base 62: " + nalg.shortenerEncode(30))
    println("70 para base 62: " + nalg.shortenerEncode(70))
    println("170 para base 62: " + nalg.shortenerEncode(170))
    println("400 para base 62: " + nalg.shortenerEncode(400))

    println()

    println("A para base 10: " + nalg.shortenerDecode("A"))
    println("K para base 10: " + nalg.shortenerDecode("K"))
    println("U para base 10: " + nalg.shortenerDecode("U"))
    println("U para base 10: " + nalg.shortenerDecode("18"))
    println("2k para base 10: " + nalg.shortenerDecode("2k"))
    println("6S para base 10: " + nalg.shortenerDecode("6S"))

    println()

    println("Teste: " + nalg.generateNumberSequence("Teste"))
    println("Teste: " + "Teste".hashCode())


}
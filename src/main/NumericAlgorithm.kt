package main

import java.lang.Math.pow

class NumericAlgorithm (description: String, title: String, author: String, version : Int): Algorithm(description,title,author,version)
{

    private val map: String = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"

    fun shortenerEncode(inputNumber: Int): String {

        var inputNumber: Int = inputNumber
        var newBase =  StringBuilder()


        while(inputNumber > 0)
        {
            newBase.append(map[inputNumber%62])
            inputNumber/=62
        }

        return newBase.reverse().toString()
    }


    fun shortenerDecode (inputNumber: String): Int
    {
        var inputNumber: String = inputNumber.reversed()
        var tam = 0
        var newNum: Int = 0
        var aux = 0

        while (tam < inputNumber.length)
        {

            for(indice in map.indices)
                if (inputNumber[tam] == map[indice])
                     aux = indice


             newNum = newNum + pow(62.0, tam.toDouble()).toInt() * aux
             tam++

        }

        return newNum
    }



   
    fun generateNumberSequence(inputText: String): Int {



    }
   





}
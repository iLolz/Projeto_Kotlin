package test

import main.NumericAlgorithm
import org.testng.Assert
import org.testng.annotations.Test

class   testNumeric {
    var numeric = NumericAlgorithm("Teste do algoritmo numerico","Teste Numerico","Saviollage",1)


    @Test
    fun testEncodeDecode()
   {
       var num1 = numeric.shortenerEncode(10)
       var str1 = numeric.shortenerDecode("A")


       var num2 = numeric.shortenerEncode(350)
       var str2 = numeric.shortenerDecode("5e")



       //TESTE COM VALORES MENORES QUE 62
       Assert.assertEquals(
               str1,
               10
       )

       Assert.assertEquals(
               num1,
               "A"
       )


       //TESTES COM VALORES MAIORES QUE 62
       Assert.assertEquals(
               str2,
               350
       )

       Assert.assertEquals(
               num2,
               "5e"
       )

   }


    @Test
    fun testHash(){

        var stringGenerated1 = numeric.generateNumberSequence("Teste")
        var stringGenerated2 = numeric.generateNumberSequence("Hash")


        //TESTE DO HASH
        Assert.assertEquals(
                stringGenerated1,
                "Teste".hashCode()
        )

        Assert.assertEquals(
                stringGenerated2,
                "Hash".hashCode()
        )
    }



}



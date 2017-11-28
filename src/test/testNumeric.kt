package test

import main.NumericAlgorithm
import org.testng.Assert
import org.testng.annotations.Test

class testNumeric {
    var numeric = NumericAlgorithm("oi","teste","saviollage",1)
   @Test
    fun testNumeric()
   {
       var num1 = numeric.shortenerEncode(10)
       var str1 = numeric.shortenerDecode("A")

       var num2 = numeric.shortenerEncode(350)
       var str2 = numeric.shortenerDecode("5e")

       var stringGenerated = numeric.generateNumberSequence("Teste")

       //TESTE COM VALORES MENORES QUE 62
       Assert.assertEquals(
               str1,
               10
       )

       Assert.assertEquals(
               num1,
               "A"
       )


       //TESTES COM VAORES MAIORES QUE 62
       Assert.assertEquals(
               str2,
               350
       )

       Assert.assertEquals(
               num2,
               "5e"
       )
        //TESTE DO HASH
       Assert.assertEquals(
               stringGenerated,
               "Teste".hashCode()
       )
   }


}



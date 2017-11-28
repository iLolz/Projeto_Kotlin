package test

import main.NumericAlgorithm
import org.testng.Assert
import org.testng.annotations.Test

class testNumeric {


    var numeric = NumericAlgorithm("oi","teste","saviollage",1)


   @Test
    fun testNumeric()
   {
       var num2String = numeric.shortenerEncode(10)
       var string2Num = numeric.shortenerDecode("A")

       var stringGenerated = numeric.generateNumberSequence("Teste")




       Assert.assertEquals(
               string2Num,
               10
       )

       Assert.assertEquals(
               num2String,
               "A"
       )

       Assert.assertEquals(
               stringGenerated,
               "Teste".hashCode()
       )
   }


}



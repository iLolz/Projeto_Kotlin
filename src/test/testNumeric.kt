package test

import main.NumericAlgorithm
import org.testng.Assert
import org.testng.annotations.Test

class   testNumeric {
    var numeric = NumericAlgorithm("Teste do algoritmo numerico","Teste Numerico","Saviollage",1)


    @Test
    fun testEncode()
   {
       var numero1 = numeric.shortenerEncode(10)
       var numero2 = numeric.shortenerEncode(60)
       var numero3 = numeric.shortenerEncode(300)
       var numero4 = numeric.shortenerEncode(1000)
       var numero5 = numeric.shortenerEncode(62)



       Assert.assertEquals(
               numero1,
               "A"
       )

       Assert.assertEquals(
               numero2,
               "y"
       )

       Assert.assertEquals(
               numero3,
               "4q"
       )

       Assert.assertEquals(
               numero4,
               "G8"
       )
       Assert.assertEquals(
               numero5,
               "10"
       )
   }

    @Test
    fun testDecode(){

        var exp1 = numeric.shortenerDecode("A")
        var exp2 = numeric.shortenerDecode("y")
        var exp3 = numeric.shortenerDecode("4q")
        var exp4 = numeric.shortenerDecode("G8")
        var exp5 = numeric.shortenerDecode("0")

        Assert.assertEquals(
                exp1,
                10
        )

        Assert.assertEquals(
                exp2,
                60
        )

        Assert.assertEquals(
                exp3,
                300
        )

        Assert.assertEquals(
                exp4,
                1000
        )
        Assert.assertEquals(
                exp5,
                0
        )
    }


    @Test
    fun testHash(){

        var stringGenerated1 = numeric.generateNumberSequence("Savio")
        var stringGenerated2 = numeric.generateNumberSequence("Alencar")
        var stringGenerated3 = numeric.generateNumberSequence("Victoria")
        var stringGenerated4 = numeric.generateNumberSequence("Nagai")
        var stringGenerated5 = numeric.generateNumberSequence("Teste")


        //TESTE DO HASH
        Assert.assertEquals(
                stringGenerated1,
                "Savio".hashCode()
        )

        Assert.assertEquals(
                stringGenerated2,
                "Alencar".hashCode()
        )

        Assert.assertEquals(
                stringGenerated3,
                "Victoria".hashCode()
        )

        Assert.assertEquals(
                stringGenerated4,
                "Nagai".hashCode()
        )

        Assert.assertEquals(
                stringGenerated5,
                "Teste".hashCode()
        )
    }



}



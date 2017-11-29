package test

import main.StringAlgorithm
import org.testng.Assert
import org.testng.annotations.Test

class testString {

    var string = StringAlgorithm("Teste do algoritmo de string", "Teste String", "Saviollage", 1)

    @Test
    fun testCountOcurrences(){

        var String1 = string.countOcurrences("aaaaabcccdddeeffff")
        var String1Expected = "5a1b3c3d2e4f"

        var String2 = string.countOcurrences("qqqqqqqqqquhannnnnnn")
        var String2Expected = "1a1h7n10q1u"

        var String3 = string.countOcurrences("abcabcabc")
        var String3Expected = "3a3b3c"

        var String4 = string.countOcurrences("aaaaaaaacddcddc")
        var String4Expected  ="8a3c4d"

        var String5 = string.countOcurrences("teste")
        var String5Expected = "2e1s2t"


        Assert.assertEquals(
                String1,
                String1Expected
        )

        Assert.assertEquals(
                String2,
                String2Expected
        )

        Assert.assertEquals(
                String3,
                String3Expected
        )

        Assert.assertEquals(
                String4,
                String4Expected
        )

        Assert.assertEquals(
                String5,
                String5Expected
        )


    }

    @Test
    fun testCleanInputText(){
        var firstExpression  = string.cleanIpuntText("A funçao Clean Input Text, deve remover todas as pontuacoes, caracteres escpeciais e espacos do texto !")
        var firstExpressionExpected  = "AfunaoCleanInputTextdeveremovertodasaspontuacoescaracteresescpeciaiseespacosdotexto"

        var secondExpression  = string.cleanIpuntText(" V@r!0$ C@R@cT&R&$ @!3@t0r!0$")
        var secondExpressionExpected  = "Vr0CRcTR3t0r0"

        var thirdExpression  = string.cleanIpuntText("a@][;']b!$];'c[.!$].'./'.'.@#$%ˆ*(&ˆ$#@!˜_def")
        var thirdExpressionExpected = "abcdef"

        var fourthExpression = string.cleanIpuntText("T!e@st%¨#%and{o a][~= fu)([-%&&nc&!@a@@@@@o cl[]e[a]n")
        var fourthExpressionExpected = "Testandoafuncaoclean"

        var fifthExpression = string.cleanIpuntText("v!a@@@@@i B  r     a[]s[i!!!l")
        var fifthExpressionExpected = "vaiBrasil"

        Assert.assertEquals(
                firstExpression,
                firstExpressionExpected
        )

        Assert.assertEquals(
                secondExpression,
                secondExpressionExpected
        )

        Assert.assertEquals(
                thirdExpression,
                thirdExpressionExpected
        )

        Assert.assertEquals(
                fourthExpression,
                fourthExpressionExpected
        )

        Assert.assertEquals(
                fifthExpression,
                fifthExpressionExpected
        )
    }


    @Test
    fun testSheduleExpression(){

        var firstExpression = string.sheduleExpression("2M34")
        var firstExpressionExpected = "Segunda - feira, Manhã, 8h:50m, 10h:05m,"

        Assert.assertEquals(
                firstExpression,
                firstExpressionExpected
        )
    }


    @Test
    fun testCesarChypher(){
        var text1 = string.cesarCypher("Teste")

        Assert.assertEquals(
                text1,
                "Whvwh"
                )

    }
}
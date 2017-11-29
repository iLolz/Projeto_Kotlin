package test

import main.StringAlgorithm
import org.testng.Assert
import org.testng.annotations.Test

class testString {

    var string = StringAlgorithm("Teste do algoritmo de string", "Teste String", "Saviollage", 1)

    @Test
    fun testCountOcurrences(){

        var firstString = string.countOcurrences("aaaaabcccdddeeffff")
        var firstStringExpected = "5a1b3c3d2e4f"



        Assert.assertEquals(
                firstString,
                firstStringExpected
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
    }


    @Test
    fun testSheduleExpression(){

        var firstExpression = string.sheduleExpression("2M34")
        var firstExpressionExpected = "Segunda - feira, Manhã, 8h:50m, 10h:05m,"

        Assert.assertEquals(
                firstExpression,
                firstExpressionExpected
        )

        var secondExpression = string.sheduleExpression("246T23")
        var secondExpressionExpected = "Segunda - feira, Quarta - feira, Sexta - feira, Tarde, 14h:25m, 15h:45m,"

        Assert.assertEquals(
                secondExpression,
                secondExpressionExpected)

        var thirExpression = string.sheduleExpression("6N23")
        var thidExpressionExpected = "Sexta - feira, Noite, 19h:50m, 21h:00m."

        Assert.assertEquals(
                thirExpression,
                thidExpressionExpected)

        var fourthExpression = string.sheduleExpression("5T123")
        var fouthExpressionExpected = "Quinta - feira, Tarde, 13h:30m, 14h:25m, 15h:45m,"

        Assert.assertEquals(
                fourthExpression,
                fouthExpressionExpected)

        var fifthExpression = string.sheduleExpression("3T12")
        var fifthExpressionExpected = "Terça - feira, Tarde, 13h:30m, 14h:25m,"
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
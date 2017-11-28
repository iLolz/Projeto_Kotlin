package test

import main.NumericAlgorithm

import org.testng.Assert
import org.testng.annotations.Test

class cleanInputTextTest (){
    var numeric = NumericAlgorithm ( "Test", "Teste Clean Input Text", "Alencar", 1)

    @Test
    fun testCleanInput(){
        var firstExpression  = "A funçao Clean Input Text, deve remover todas as pontuacoes, caracteres escpeciais e espacos do texto !"
        var firstExpressionExpected  = "AfunaoCleanInputTextdeveremovertodasaspontuacoescaracteresescpeciaiseespacosdotexto"

        var secondExpression  = " V@r!0$ C@R@cT&R&$ @!3@t0r!0$"
        var secondExpressionExpected  = "Vr0CRcTR3t0r0"

        var thirdExpression  = "a@][;']b!$];'c[.0!$].'./'.'.@#$%ˆ*(&ˆ$#@!˜_def"
        var thidExpressionExpected = "abcdef"

        var fourthExpression = " @L3NC@R @NT0N!0 M0R3!R@"
        var fouthExpressionExpected = "L3NCRNT0N0M0R3R"

        Assert.assertEquals(firstExpression, firstExpressionExpected )

        Assert.assertEquals(secondExpression,secondExpressionExpected)

        Assert.assertEquals(thirdExpression, thidExpressionExpected)

        Assert.assertEquals(fourthExpression, fouthExpressionExpected)
    }

}
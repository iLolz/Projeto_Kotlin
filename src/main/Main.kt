package main


import jdk.nashorn.internal.scripts.JO
import javax.swing.JOptionPane

fun main(args: Array<String>) {

    var op : String = "01"
    var text : String = "-1"

while (op != "8"){
    op = JOptionPane.showInputDialog(
            null,
            "Digite a opcao desejada : " +
                    "\n 1) Shortener Encoder\n 2) Shortener Decoder \n 3) Generate Number Sequence \n 4) Cesar Cypher \n 5) Count Ocurrences \n " +
    "6) Shedule expression \n 7) Clean Input Text\n 8) Sair")


    if (op == "1") {

        text = JOptionPane.showInputDialog("Shortener Encoder")
        text = (NumericAlgorithm("TOP","top", "Sávio", 1).shortenerEncode(text.toInt()))
        JOptionPane.showMessageDialog(null, text)

    } else if (op == "2") {

        text = JOptionPane.showInputDialog("Shortener Decoder, digite o valor a ser decodificado :")
        text = NumericAlgorithm("Shortener decoder", " Teste", "Sávio", 1).shortenerDecode(text).toString()
        JOptionPane.showMessageDialog(null, text)

    } else if ( op == "3"){

        text = JOptionPane.showInputDialog("Generate Number Sequence")
        text = NumericAlgorithm("generateNumberSequence", "Generate Number Sequence", "Sávio", 1 ).generateNumberSequence(text).toString()
        JOptionPane.showMessageDialog(null,text)

    }else if (op == "4"){

        text = JOptionPane.showInputDialog( "Cesar Cypher")
        text = StringAlgorithm( "Cesar Cypher", " Cesar Cypher", "Victoria",1).cesarCypher(text)
        JOptionPane.showMessageDialog(null, text)

    } else if ( op == "5"){

        text = JOptionPane.showInputDialog( "Count Occurrences, digite a frase a ser analisada : ")
        text = StringAlgorithm( "Contar as ocorrencias de determinado caracter", "CountOcurrences", " Alencar", 1).countOcurrences(text)
        JOptionPane.showMessageDialog(null,text)

    } else if (op == "6"){

        text = JOptionPane.showInputDialog("Shedule expression, digite o horario no formato necessario, como exemplo (246M23) :")
        text = StringAlgorithm( "Interpretar horarios de aula modelo SIGAA", "SHEDULE EXPRESSION", "Alencar",1).sheduleExpression(text)
        JOptionPane.showMessageDialog(null, text)

    } else if (op == "7"){

        text = JOptionPane.showInputDialog("Clean Input Text, remove espaços e caracteres especiais. \n String a ser analisada :")
        text = StringAlgorithm( " CleanInputText remove caracteres especiais e espacos da string a ser analisada", "CleanInputText", "Alencar", 1).cleanIpuntText(text)
        JOptionPane.showMessageDialog(null, text)

    } else if (op == "8"){
        System.exit(0)
    } else {
        JOptionPane.showMessageDialog(null, " Opção Inválida! ")
    }
}}


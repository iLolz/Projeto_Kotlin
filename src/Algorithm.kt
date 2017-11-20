import java.awt.SystemColor.text
import javax.swing.JOptionPane

open class Algorithm(val description: String, val title: String, val author: String, val version: Int = 1)


fun main(args: Array<String>) {
    val salg = StringAlgorithm("Just a test", "TOP", "SAVIOLLAGE", 1)
    var op : Int = 0
    var text : String = "0"
    // var aa: String = salg.createPattern()

    op = JOptionPane.showInputDialog("Digite a opção desejada : \n 1) Count Ocurrences\n 2) Shedule Expression").toInt()

    if (op == 1) {
        text = JOptionPane.showInputDialog("Digite a String a ser analisada :")

        /// countOcurrences chamada ->  A funçao countOcurrences verifica quantas vezes derterminado caracter aparece na sequencia inserida

        text = countOcurrences(text)

        JOptionPane.showMessageDialog(null, text)

    } else {
        if (op == 2) {
            text  = JOptionPane.showInputDialog("Digite a String a ser analisada :").toString()

            text = sheduleExpression(text)
            JOptionPane.showMessageDialog(null, text)

            System.exit(0)

        } else {
            JOptionPane.showMessageDialog(null, " Opção Inválida! ")
            System.exit(0)
        }
    }
2}
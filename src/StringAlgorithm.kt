
import java.util.Random

class StringAlgorithm (description: String, title: String, author: String,  version : Int): Algorithm (description,title,author,version)
{


    fun createPattern(): String {

        val alphabet = "abcdefghijklmnopqrstuvwxyz"
        val newString = StringBuilder()
        val rnd = Random()

        while (newString.length < 26) {                                 // length of the random string.

            alphabet[rnd]






            /*
            val index = (rnd.nextFloat() * alphabet.length).toInt()
            newString.append(alphabet[index])
            */
        }

        val cypher = newString.toString()
        return cypher

    }


    fun cesarCypher(inputText: String, patternCypher: String) :String
    {

        var Text: String = ((inputText.toInt() + patternCypher.toInt()) %26).toString()

        return Text

    }


}
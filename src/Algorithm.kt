import com.sun.tools.doclint.DocLint

open class Algorithm (val description: String, val title: String, val author: String, val version : Int = 1)



fun main (args: Array<String>)
{
     val salg = StringAlgorithm("Just a test", "TOP", "SAVIOLLAGE", 1)

    // var aa: String = salg.createPattern()
     val text: String = "aaaaaaaaaaaaaaaaaaaaaaaaaabjjjbksdbbjksbdkabkjsd"
    countOcurrences(text)
 //   println(aa)

}
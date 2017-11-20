class NumericAlgorithm (description: String, title: String, author: String,  version : Int): Algorithm (description,title,author,version)
{

    private val map: String = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"

    fun shortenerEncode(inputNumber: Int): String {

        var inputNumber: Int = inputNumber
        var newBase =  StringBuilder()

        while(inputNumber > 0)
        {
            newBase.append(map[inputNumber%62])
            inputNumber/=62
        }

        return newBase.reverse().toString()
    }


    fun shortenerDecode (inputNumber: String): Int
    {
        var inputNumber: String = inputNumber
        





    }





}
fun countOcurrences(frase: String) {
    var conta: Int = 0
    var resp: String = "/0"

    for (x in 'a'..'z') {
        for (i in frase) if (x == i) conta++

        if (conta != 0) print(message = x + "" + conta)

        resp += (x + conta).toString()
        conta = 0
    }
}
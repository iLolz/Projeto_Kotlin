fun cleanIpuntText(text: String): String {

    var cleanText: String = ""

    var verif : Boolean = false
    var verif1 : Boolean = false
    var verif2 : Boolean = false

    for (x in text) {

        verif = false
        verif1 = false
        verif2 = false

        for (y in 'a'..'z') {

            for (z in 'A'..'Z') {
                for (w in '0'..'9') {

                    if ((x == y) && !verif) {
                        cleanText += x
                        verif = true
                    }
                    if ((x == z) && !verif1) {
                        cleanText += x
                        verif1 = true
                    }
                    if ((x == w) && !verif2) {
                        cleanText += x
                        verif2 = true
                    }
                }
            }
        }
    }
    return cleanText
}
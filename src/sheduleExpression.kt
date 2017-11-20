fun sheduleExpression(texto: String): String {
    var resp: String = ""
    var verif: Boolean = false


    for (x in texto.toUpperCase()) {
        // Verifica se ja foram inseridos os dias

        if (verif == false) {
            if (x == '2') resp += " Segunda - feira, "
            else if (x == '3') resp += " Terça - feira, "
            else if (x == '4') resp += " Quarta - feira, "
            else if (x == '5') resp += " Quinta - feira, "
            else if (x == '6') resp += " Sexta - feira, "
            else if (x == '7') resp += " Sábado, "
        }
        // Define o Turno
        if (x == 'M') {
            verif = true
            resp += " Manhã, "
        } else if (x == 'T') {
            verif = true
            resp += "Tarde, "
        } else if (x == 'N') {
            verif = true
            resp += "Noite, "
        }

        // verifica se String contem o turno
        if (resp.contains("Manhã")) {
            //Define os horários noturnos
            if (x == '1') resp += "7h:00m, "
            if (x == '2') resp += "7h:55m, "
            if (x == '3') resp += "8h:50m, "
            if (x == '4') resp += "10h:05m, "
            if (x == '5') resp += "11h:10m."

        }
        // verifica se String contem turno
        if (resp.contains("Tarde")) {
            //Define horários noturnos
            if (x == '1') resp += "13h:30m, "
            if (x == '2') resp += "14h:25m, "
            if (x == '3') resp += "15h:45m, "
            if (x == '4') resp += "16h:40m, "
            if (x == '5') resp += "17h:40m."

        }

        //verifica se String contem turno
        if (resp.contains("Noite")) {
            //Define horários noturnos
            if (x == '1') resp += "19h:00m, "
            if (x == '2') resp += "19h:50m, "
            if (x == '3') resp += "21h:00m."
        }

    }
    return resp
}
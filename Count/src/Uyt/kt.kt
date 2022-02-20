package Uyt

// Дана сторока пример: AAABBCCCDDXYUUUUR
// нужно из данной стороки сделать такую строку пример: A3B2C3D2XYU4R

fun main() {

    println(countLetter("AAABBCCCDDXYUUUUR"))
}

fun countLetter(str: String): String {

    var result = ""
    var count = 1
    var currentLetter = str[0]

    for (letter in str.substring(1)) {
        if (currentLetter == letter) {
            count++
        } else {
            if (count == 1)
                result += currentLetter
            else
                result += "$currentLetter$count"

            count = 1
            currentLetter = letter
        }
    }

    if (count == 1)
        result += currentLetter
    else
        result += "$currentLetter$count"


    return result
}
fun main() {
    print(solution("010010000110010101101100011011000110111100100001"))
}

fun solution(code: String): String {
    var tempString = ""
    for (i in 0 until code.length / 8) {
        val tempSubstring = code.substring(i * 8, (i * 8) + 8)
        println(tempSubstring)
        tempString += convertBinaryToDecimal(tempSubstring.toLong()).toChar()
    }
    return tempString
}

@Suppress("NAME_SHADOWING")
fun convertBinaryToDecimal(num: Long): Int {
    var num = num
    var decimalNumber = 0
    var i = 0
    var remainder: Long

    while (num.toInt() != 0) {
        remainder = num % 10
        num /= 10
        decimalNumber += (remainder * Math.pow(2.0, i.toDouble())).toInt()
        ++i
    }
    return decimalNumber
}
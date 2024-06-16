package doomed.dumbs

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    scanner.nextLine() // consume the newline character

    val results = mutableListOf<String>()
    for (i in 1..n) {
        val input = scanner.nextLine()
        val result = if (isA1Format(input)) {
            a1ToR1C1(input)
        } else {
            r1c1ToA1(input)
        }
        results.add(result)
    }


    results.forEach { println(it) }
}
fun columnToNumber(column:String):Int{
    var number = 0
    for (char in column){
        //finding the index of char by char-'A'
        //find the position of the 10 100 and so on number by number*26
        //hence returning the exact number of the row of column
        number = number*26+(char-'A'+1)
    }
    return number
}
fun isA1Format(input: String): Boolean {
    return input.matches(Regex("[A-Z]+[0-9]+"))
}
fun numberToColumn(number:Int):String{
    var num = number
    var column = StringBuilder()
    while (num>0){
        val rem = (num-1)%26
        column.append('A'+rem)
        num=(num-1)/26
    }
    return column.reverse().toString()
}
fun a1ToR1C1(a1:String):String{
    val column = a1.takeWhile { it.isLetter() }
    val row = a1.dropWhile { it.isLetter() }
    val columnNumber = columnToNumber(column)
    return "R${row}C$columnNumber"
}
fun r1c1ToA1(r1c1:String):String{
    val row = r1c1.substring(1,r1c1.indexOf('C'))
    val columnNumber = r1c1.substring(r1c1.indexOf('C')+1).toInt()
    val column = numberToColumn(columnNumber)
    return "${column}${row}"

}
/**
 *Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/plus-minus/problem
 */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here

    val n = arr.size
    var a: Double = 0.0
    var b: Double = 0.0
    var c: Double = 0.0
    for (i in arr) {
        when {
            i > 0 -> a++
            i == 0 -> b++
            i < 0 -> c++

        }
    }
    println(a / n)
    println(c / n)
    println(b / n)
}
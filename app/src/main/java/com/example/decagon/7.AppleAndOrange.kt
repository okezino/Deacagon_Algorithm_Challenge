/**
 * Apple and Orange
 * Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/apple-and-orange/problem
 */

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {

    var applecount: Int = 0
    var orrangecount: Int = 0
    for (i in apples) if ((a + i) in s..t) applecount++
    for (i in oranges)if ((b + i) in s..t) orrangecount++


    println(applecount)
    println(orrangecount)

}
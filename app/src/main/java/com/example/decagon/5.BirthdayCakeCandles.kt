/**
 *Birthday Cake Candles
 *Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Write your code here

    var max : Int = 0
    var count : Int = 0
    for(i in candles) {
        when{
            i > max -> {max = i
                count = 1}
            i == max -> count++
        }
    }
    return count
}

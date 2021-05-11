/**
 * CamelCase
 * Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/camelcase/problem
 */

fun camelcase(s: String): Int {
    var count = 1
    for(i in s) if(i.isUpperCase()) count++
    return count
}

/**
 * Number Line Jumps
 * Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/kangaroo/problem
 */

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    return if( v1 > v2 && ((x1 - x2) % (v2 -v1) == 0 )) "YES" else "NO"

}

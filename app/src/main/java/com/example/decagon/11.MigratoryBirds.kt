/**
 * Migratory Birds
 * Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/migratory-birds/
 */

fun migratoryBirds(arr: Array<Int>): Int {

    return arr.sorted().groupingBy { it }.eachCount().maxBy { it.value }!!.key
}


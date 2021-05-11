/**
 * Counting Sort 1
 * Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/countingsort1/problem
 */


fun countingSort(arr: Array<Int>): Array<Int> {
    var  counterList = MutableList<Int>(100){0}
    for(i in arr) counterList[i]++
    return counterList.toTypedArray()
}
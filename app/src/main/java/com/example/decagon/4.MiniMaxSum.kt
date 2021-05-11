/**
 *Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 */


fun miniMaxSum(arr: Array<Int>): Unit {

    var sum : Long = 0
    for(i in arr) sum += i
    var min = arr.min()
    var max = arr.max()
    print(sum - max!!)
    print(" ")
    print(sum - min!!)

}

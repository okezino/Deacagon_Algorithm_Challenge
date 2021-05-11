/**
 * Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/simple-array-sum/problem
 */
fun simpleArraySum(ar: Array<Int>): Int {
    // Write your code here
    var sum : Int = 0
    for(i in ar ) sum += i
    return sum
}
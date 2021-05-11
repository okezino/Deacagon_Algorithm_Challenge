/**
 * Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */


fun aVeryBigSum(ar: Array<Long>): Long {
    var Bigsum : Long = 0;
    for(i in ar) Bigsum += i
    return Bigsum
}

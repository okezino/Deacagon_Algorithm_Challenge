/**
 * Subarray Division
 * Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem
 */


fun birthday(s: Array<Int>, d: Int, m: Int): Int {

    return s.asIterable().windowed(m,1).count{it.sum() == d }

}

/**
 * Save the Prisoner!
 * Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/save-the-prisoner/problem
 */


fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    return if((m + s -1) % n != 0) (m + s -1) % n else n
}

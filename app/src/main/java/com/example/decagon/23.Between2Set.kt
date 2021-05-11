/**
 * Between Two Sets
 * Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/between-two-sets/problem
 */



fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here
    return  (a.last()..b.first() step a.last()).count { num -> a.all{num % it == 0} && b.all{it % num == 0 } }
}
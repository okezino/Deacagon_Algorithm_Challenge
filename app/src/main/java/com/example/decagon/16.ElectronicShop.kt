/**
 * Electronics Shop
 * Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/electronics-shop/problem
 */

fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {

    var moneySpent = 0
    for(i in keyboards){
        for(j in drives){
            var per = i + j
            if( per <= b && per > moneySpent) moneySpent = per
        }
        if(moneySpent == 0) moneySpent = -1
    }
    return moneySpent
}

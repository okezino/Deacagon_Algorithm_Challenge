/**
 * Halloween Sale
 * Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/halloween-sale/problem
 */


// Complete the howManyGames function below.
fun howManyGames(p: Int, d: Int, m: Int, s: Int): Int {
    // Return the number of games you can buy

    var subp = p
    var sump = 0
    var count = 0
    while(subp >= m && s > sump){
        sump += subp
        subp -= d
        count++
    }
    return if(s < p) 0 else count + (s - sump)/m
}
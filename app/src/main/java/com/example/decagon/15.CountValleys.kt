/**
 * Counting Valleys
 *Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */

fun countingValleys(steps: Int, path: String): Int {
    // Write your code here
    var count : Int = 0
    var returnCount = 0

    for(i in path){
        if(i == 'D'){
            count--
        }else {
            count++
        }
        if(count == 0 && i == 'U') returnCount++
    }

    return returnCount

}

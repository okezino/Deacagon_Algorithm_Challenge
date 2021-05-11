/**
 * Sales by Match
 * Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/sock-merchant/problem
 */


fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var sockstack : MutableList<Int> = mutableListOf()
    var count : Int = 0
    for(i in ar){
        if(sockstack.contains(i)) {
            sockstack.remove(i)
            count++
        }else sockstack.add(i)
    }
    return count

}

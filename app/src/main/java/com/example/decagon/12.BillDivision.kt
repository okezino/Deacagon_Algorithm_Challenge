/**
 * Bill Division
 * Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */


fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {

    var correctBill : Int =  (bill.filterIndexed { index,it -> (index != k)}.sum())/2
    if(b > correctBill) println(b - correctBill)
    else println("Bon Appetit")
}

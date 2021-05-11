/**
 * Counting Sort 2
 * Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/countingsort2/problem
 */


fun countingSort2(arr: Array<Int>): Array<Int> {
    var  counterList = MutableList<Int>(arr.max()!! + 1){0}

    var final = mutableListOf<Int>()
    for(i in arr) counterList[i]++
    for(j in 0..counterList.lastIndex){
        if(counterList[j] != 0) {
            for (i in 1..counterList[j]){
                final.add(j)
            }
        }
    }

    return final.toTypedArray()

}
/**
 * BreakingBreaking the Records
 *Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 */


fun breakingRecords(scores: Array<Int>): Array<Int> {
    var high : Int = scores[0]
    var highcount : Int = 0
    var low : Int = scores[0]
    var lowcount : Int = 0
    var output : MutableList<Int> = mutableListOf()

    for ( i in scores){
        when{
            i > high -> {
                high = i
                highcount++
            }
            i < low -> {
                low = i
                lowcount++
            }
        }
    }
    output.add(highcount)
    output.add(lowcount)

    return output.toTypedArray()

}


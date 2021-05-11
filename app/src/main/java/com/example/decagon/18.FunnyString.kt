/**
 * Funny String
 * Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/funny-string/problem
 */


fun funnyString(s: String): String {
    var mut = mutableListOf<Int>()
    var mutai = mutableListOf<Int>()
    var mutrev = mutableListOf<Int>()
    for(i in s) mut.add(i.toInt())
    var remut = mut.asReversed()
    for(j in 0..mut.size -2) mutai.add(Math.abs(mut[j] - mut[j + 1]))
    for(k in 0..mut.size -2) mutrev.add(Math.abs(remut[k] - remut[k + 1]))

    if(mutrev == mutai) return ("Funny") else
        return ("Not Funny")

}
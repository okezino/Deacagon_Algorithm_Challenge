

fun nonDivisibleSubset(k: Int, s: Array<Int>): Int {
    // Write your code here
    var modulusCount = Array(k) { 0 }
    var count = 0

    s.forEach {
        modulusCount[it % k]++
    }


    for (i in 0..(k / 2)) {
        when {
            i == 0 -> if (modulusCount[0] > 0) count += 1
            k - i == i -> if (modulusCount[i] > 0) count += 1
            else -> {
                count += if (modulusCount[i] > modulusCount[k - i]) modulusCount[i] else {
                    modulusCount[k - i]
                }
            }
        }


    }
    return count
}
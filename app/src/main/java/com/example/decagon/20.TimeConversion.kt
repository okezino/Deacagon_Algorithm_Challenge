/**
 * Time Conversion
 * Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/time-conversion/problem
 */

fun timeConversion(s: String): String {
    /*
     * Write your code here.
     */

    var timeFormat: String = s.takeLast(2)
    var time: String = s.take(8)
    var (hr, min, sec) = time.split(":")
    var calhr = hr.toInt()
    return when (timeFormat) {
        "PM" -> {
            if (hr == "12") {
                "$hr:$min:$sec"
            } else {
                calhr += 12
                "$calhr:$min:$sec"
            }
        }
        else -> {
            if (hr == "12") {
                "00:$min:$sec"
            } else {
                "$hr:$min:$sec"
            }
        }
    }


}

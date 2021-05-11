/**
 * Grading Students
 * Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/grading/problem
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    var result : ArrayList<Int> = arrayListOf()
    for (i in grades) {
        if (i < 38) {
            result.add(i)
        } else {
            when {
                (i + 2) in 0..100 step 5 -> result.add(i+2)
                (i + 1) in 0..100 step 5 -> result.add(i+1)
                else -> result.add(i)
            }
        }
    }


    return result.toTypedArray()

}



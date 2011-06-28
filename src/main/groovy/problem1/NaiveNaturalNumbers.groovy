package problem1

/**
 *
 * User: odinholestandal
 * Date: 6/28/11
 * Time: 10:55 PM
 */
class NaiveNaturalNumbers {

    static def isMultipleOf(int i, int j) {
        return (i % j) == 0
    }

    static int sumOfNaturalNumbersMultipleOf3or5Below(int i) {

        int sum = 0
        (0..(i-1)).each {
            if (isMultipleOf(it, 3) || isMultipleOf(it, 5)) sum +=it
        }
        sum
    }
}

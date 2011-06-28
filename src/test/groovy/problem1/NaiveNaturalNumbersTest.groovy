package problem1

import org.junit.Test

/**
 * Problem description from projecteuler.net:
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 og 5 below 1000.
 *
 * User: odinholestandal
 * Date: 6/28/11
 * Time: 10:50 PM
 */
class NaiveNaturalNumbersTest {

    @Test
    void isMultipleOfVerification() {

         assert NaiveNaturalNumbers.isMultipleOf(3, 3)
         assert NaiveNaturalNumbers.isMultipleOf(6, 3)
         assert NaiveNaturalNumbers.isMultipleOf(3, 3)

         assert !NaiveNaturalNumbers.isMultipleOf(4, 3)
         assert !NaiveNaturalNumbers.isMultipleOf(5, 3)
         assert !NaiveNaturalNumbers.isMultipleOf(7, 3)
    }


    @Test
    void canFindSumOfAllNaturalNumbersBelow10() {
        assert 23  == NaiveNaturalNumbers.sumOfNaturalNumbersMultipleOf3or5Below(10)
        assert 233168 == NaiveNaturalNumbers.sumOfNaturalNumbersMultipleOf3or5Below(1000)
    }



}

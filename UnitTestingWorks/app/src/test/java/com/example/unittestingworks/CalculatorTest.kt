package com.example.unittestingworks

import org.junit.Assert
import org.junit.Test

/** Usually we ad Test at the end of the class name
 *  while writing test class. There are 3 stages writing
 *  test. preparation, running method and check result
 *  If result is the same with excepted your test will pass
 *  Also you have add @Test annotation to your method
 */

class CalculatorTest {

    @Test
    fun getSum() {
        /** preparation*/
        val calculator = Calculator()
        val numberOne = 7
        val numberTwo = 3

        /** run your method */
        val sum = calculator.getSum(numberOne, numberTwo)
        // 7 is the respected result for this operation

        /** check result */
        Assert.assertEquals(10, sum)
    }

}
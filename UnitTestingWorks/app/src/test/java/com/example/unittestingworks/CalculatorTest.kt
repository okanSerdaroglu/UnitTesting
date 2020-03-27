package com.example.unittestingworks

import org.junit.Assert
import org.junit.Test

/** Usually we ad Test at the end of the class name
 *  while writing test class. There are 3 stages writing
 *  test. preparation, running method and check result
 *  If result is the same with excepted your test will pass
 *  Also you have add @Test annotation to your method
 */

/** you have to test only one scenario in a method
 *  Because if one scenario fails, other scenarios don't
 *  work. For this reason you have to test your all scenarios in
 *  different methods. Method names should
 */

/** method names can be named different ways
 *  should_result_when_condition
 *  when_condition_expect_result
 */

class CalculatorTest {

    @Test
    fun testGetSum() {
        /** GIVEN */
        val calculator = Calculator()
        val numberOne = 7
        val numberTwo = 3

        /** WHEN */
        val sum = calculator.getSum(numberOne, numberTwo)
        // 7 is the respected result for this operation

        /** THEN */
        Assert.assertEquals(10, sum)
    }

    @Test
    fun testGetDifferenceNumberOneGreaterThanNumberTwo() {
        Assert.assertEquals(5,Calculator().getDifference(10,5))
    }

    @Test
    fun testGetDifferenceNumberTwoGreaterThanNumberOne(){
        Assert.assertEquals(-5,Calculator().getDifference(5,10))
    }

    @Test
    fun testGetDifferenceNumberOneEqualsZero(){
        Assert.assertEquals(-10,Calculator().getDifference(0,10))
    }

    @Test
    fun testGetDifferenceNumberTwoEqualsZero(){
        Assert.assertEquals(10,Calculator().getDifference(10,0))
    }

    @Test
    fun testGetDifferenceBothEqualsZero(){
        Assert.assertEquals(0,Calculator().getDifference(0,0))
    }

}
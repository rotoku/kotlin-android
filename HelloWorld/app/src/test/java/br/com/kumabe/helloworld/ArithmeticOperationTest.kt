package br.com.kumabe.helloworld

import org.junit.Assert
import org.junit.Test

class ArithmeticOperationTest {
    @Test
    fun sum() {
        val expected: Double = 4.0
        val actual: Double = ArithmeticOperation().sum(2.0, 2.0)
        Assert.assertEquals(expected, actual, 0.001)
    }

    @Test
    fun sub() {
        val expected: Double = 0.0
        val actual: Double = ArithmeticOperation().sub(2.0, 2.0)
        Assert.assertEquals(expected, actual, 0.001)
    }

    @Test
    fun mult() {
        val expected: Double = 4.0
        val actual: Double = ArithmeticOperation().mult(2.0, 2.0)
        Assert.assertEquals(expected, actual, 0.001)
    }

    @Test
    fun div() {
        val expected: Double = 1.0
        val actual: Double = ArithmeticOperation().div(2.0, 2.0)
        Assert.assertEquals(expected, actual, 0.001)
    }

}
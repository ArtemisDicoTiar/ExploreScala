package org.john.chapter4

import org.scalatest.funsuite.AnyFunSuite

class RecursiveFunctionTest extends AnyFunSuite {

  test("testPower") {
    val recursiveFunction = new RecursiveFunction()
    assert(recursiveFunction.power(2, 8) == 256)
    assert(recursiveFunction.power(2, 1) == 2)
    assert(recursiveFunction.power(2, 0) == 1)
  }

  test("testTailPower") {
    val recursiveFunction = new RecursiveFunction()
    assert(recursiveFunction.tailPower(2, 8) == 256)
    assert(recursiveFunction.tailPower(2, 1) == 2)
    assert(recursiveFunction.tailPower(2, 0) == 1)
  }

}

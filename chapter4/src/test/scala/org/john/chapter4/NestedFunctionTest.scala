package org.john.chapter4

import org.scalatest.funsuite.AnyFunSuite

class NestedFunctionTest extends AnyFunSuite {

  test("testMax") {
    val nestedFunction = new NestedFunction()
    assert(nestedFunction.max(42, 181, 19) == 181)
  }

}

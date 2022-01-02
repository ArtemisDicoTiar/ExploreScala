package org.john.chapter9

import org.scalatest.funsuite.AnyFunSuite

class MultiplierTest extends AnyFunSuite {

  test("testMultiplier") {
    val tripler = Multiplier(3)
    val result = tripler.product(13)
    assert(result == 39)
  }

}

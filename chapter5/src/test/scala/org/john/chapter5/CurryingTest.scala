package org.john.chapter5

import org.scalatest.funsuite.AnyFunSuite

class CurryingTest extends AnyFunSuite {

  test("testFactorOf") {
    val currying = new Currying()
    assert(currying.factorOf(7, 20) == currying.f(7, 20))
    assert(currying.multipleOf3(78) == currying.factorOf(3, 78))
    assert(currying.isEven(32) == currying.factorOfChain(2)(32))
  }

  test("testDoubles") {
    val currying = new Currying()
    assert(currying.doubles(5) == 10)
    assert(currying.doubles(currying.f(8)) == 16)
  }

  test("testStatusHandler") {
    val currying = new Currying()
    assert(currying.statusHandler(200) == "OK")
    assert(currying.statusHandler(400) == "Your Error")
    assert(currying.statusHandler(500) == "Our Error")
    assert(currying.statusHandler(401) == "Your Error")
  }

}

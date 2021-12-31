package org.john.chapter4

import org.scalatest.funsuite.AnyFunSuite

class AboutParameterTest extends AnyFunSuite {

  test("testGreet") {
    val aboutParameter = new AboutParameter()
    assert(aboutParameter.greet("Ms", "Brown") == "Ms Brown")
    assert(
      aboutParameter.greet("Ms", "Brown") == aboutParameter.greet(prefix = "Ms", name = "Brown")
    )
  }

  test("testGreet with inital value") {
    val aboutParameter = new AboutParameter()
    assert(aboutParameter.greetInit("Ms", "Brown") == "Ms Brown")
    assert(
      aboutParameter.greetInit("Ms", "Brown") == aboutParameter.greetInit(prefix = "Ms", name = "Brown")
    )
  }

  test("test vararg") {
    val aboutParameter = new AboutParameter()
    assert(aboutParameter.sum(10, 20, 30) == 60)
    assert(aboutParameter.sum(1, 2, 3, 4, 5, 6, 7, 8, 9) == 45)
  }

  test("test param group") {
    val aboutParameter = new AboutParameter()
    assert(aboutParameter.max(20)(39) == 39)
  }

  test("test type param") {
    val aboutParameter = new AboutParameter()
    val s: String = aboutParameter.identity("hello")
    assert(s == "hello")

    val n: Double = aboutParameter.identity(1.4235)
    assert(n == 1.4235)
  }

}

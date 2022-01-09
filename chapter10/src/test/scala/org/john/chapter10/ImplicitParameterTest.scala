package org.john.chapter10

import org.john.chapter10.ImplicitParameter.{Doubly, USD}
import org.scalatest.funsuite.AnyFunSuite

class ImplicitParameterTest extends AnyFunSuite {
  test("testDoubly") {
    Doubly.print(3.724)("%.1f")
  }

  test("testUSD") {
    USD(81.924).print()
  }
}

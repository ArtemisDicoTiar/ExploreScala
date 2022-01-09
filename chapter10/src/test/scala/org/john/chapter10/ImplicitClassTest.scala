package org.john.chapter10

import org.scalatest.funsuite.AnyFunSuite

import org.john.chapter10.ImplicitClass.IntUtils._

class ImplicitClassTest extends AnyFunSuite {
  test("testIntUtils") {
    println(3.fishes)
  }

  test("testArrow") {
    print(3 -> "a")
  }
}

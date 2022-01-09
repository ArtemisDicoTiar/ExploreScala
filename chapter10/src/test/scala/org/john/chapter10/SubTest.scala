package org.john.chapter10

import org.scalatest.funsuite.AnyFunSuite

class SubTest extends AnyFunSuite {

  test("testIncrement") {
    val l: List[Base] = List[Sub]()
    println(l)
    println(l.getClass)
  }

}

package org.john.chapter9

import org.scalatest.funsuite.AnyFunSuite

class ReverserTest extends AnyFunSuite {
  test("testTraitInjection") {
    val h = new User("Harry P") with Wizard
    val g = new User("Ginny W") with Attorney
    val l = new User("Luna L") with Wizard with Reverser

    println(h)
    println(g)
    println(l)
  }

}

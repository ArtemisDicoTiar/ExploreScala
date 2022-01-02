package org.john.chapter9

import org.scalatest.funsuite.AnyFunSuite

class HelloTest extends AnyFunSuite {
  test("testObjectInit") {
    println(Hello.hi)
    // in Hello -> called as the object initiated
    // hi
    println(Hello.hi)
    // hi
  }
}

package org.john.chapter9

import org.scalatest.funsuite.AnyFunSuite

class Page2Test extends AnyFunSuite {
  test("testPage2") {
    val html = "<html><body><h1>Introduction</h1></body></html>"
    println(new Page2(html).asPlainText)
    println(new Page2(" ").asPlainText)
    println(new Page2(null).asPlainText)
  }
}

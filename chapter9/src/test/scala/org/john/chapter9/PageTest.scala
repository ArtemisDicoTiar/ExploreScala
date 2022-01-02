package org.john.chapter9

import org.scalatest.funsuite.AnyFunSuite

class PageTest extends AnyFunSuite {
  test("testPageClassExtendsTrait") {
    val html = "<html><body><h1>Introduction</h1></body></html>"
    val page = new Page(html).asPlainText
    println(page)
    println(new Page(html).asPlainText)
  }
}

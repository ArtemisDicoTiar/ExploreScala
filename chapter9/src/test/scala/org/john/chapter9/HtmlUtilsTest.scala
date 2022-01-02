package org.john.chapter9

import org.scalatest.funsuite.AnyFunSuite

class HtmlUtilsTest extends AnyFunSuite {

  test("testRemoveMarkup") {
    val html = "<html><body><h1>Introduction</h1></body></html>"
    val text = HtmlUtils.removeMarkup(html)
    assert(text == "Introduction")
  }

}

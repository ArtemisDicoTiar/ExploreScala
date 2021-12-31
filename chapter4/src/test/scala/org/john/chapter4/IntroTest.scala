package org.john.chapter4

import org.junit.runner.RunWith
import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class IntroTest extends AnyFunSuite with BeforeAndAfter {
  test("def hi1 should return 'hi'") {
    val intro = new Intro()
    assert(intro.hi1 == "hi")
  }

  test("def hi2 should return 'hi'") {
    val intro = new Intro()
    assert(intro.hi2 == "hi")
  }

  test("test multiplier") {
    val intro = new Intro()
    assert(intro.multiplier(6, 7) == 42)
  }

  test("test safeTrim") {
    val intro = new Intro()
    assert(intro.safeTrim("      trim sentence  ") == "trim sentence")
    assert(intro.safeTrim(null) == null)
  }


}

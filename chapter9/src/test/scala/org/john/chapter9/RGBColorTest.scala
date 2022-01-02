package org.john.chapter9

import org.scalatest.funsuite.AnyFunSuite

class RGBColorTest extends AnyFunSuite {
  test("testFurtherTrait") {
    val green: String = new RGBColor(255 << 8).hex
    val red: String = new Paint(128 << 16).hex
    val blue: String = new Overlay(192).hex

    println(green)
    println(red)
    println(blue)
  }
}

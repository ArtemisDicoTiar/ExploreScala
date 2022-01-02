package org.john.chapter9

import org.scalatest.funsuite.AnyFunSuite

class CharacterTest extends AnyFunSuite {
  test("testCharacterBasic") {
    val h = Character("Hadrain", true)
    println(h)
    val r = h.copy(name = "Royce")
    println(r)
    println(h)
    println(r == h)

    println(
      h match {
        case Character(x, true) => s"$x is a thief"
        case Character(x, false) => s"$x is not a thief"
      }
    )
  }

}

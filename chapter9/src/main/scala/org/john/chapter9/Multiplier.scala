package org.john.chapter9

class Multiplier(val x: Int) {
  def product(y: Int): Int = x * y
}

object Multiplier {
  def apply(x: Int) = new Multiplier(x)
}

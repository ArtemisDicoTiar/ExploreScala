package org.john.chapter4

class NestedFunction {
  def max(a: Int, b: Int, c: Int): Int = {
    def max(x: Int, y: Int): Int = if (x > y) x else y
    max(a, max(b, c))
  }
}

package org.john.chapter10

object ImplicitClass {
  object IntUtils {
    implicit class Fishes(val x: Int) {
      def fishes: String = "Fish " * x
    }
  }
  implicit class ArrowAssoc[A](x: A) {
    def ->[B](y: B): (A, B) = Tuple2(x, y)
  }
}

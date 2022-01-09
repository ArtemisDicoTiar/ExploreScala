package org.john.chapter10

class Intro {
  val t1: (Int, Char) = (1, 'a')
  val t2: (Int, Char) = Tuple2[Int, Char](1, 'a')
  val f1: Int => Int = _ + 2
  val f2: Int => Int = new Function[Int, Int] {
    override def apply(v1: Int): Int = v1 * 2
  }
}

package org.john.chapter9

class A1 {
  def hi = "hi"
}

trait B1 {
  self: A1 =>
  override def toString: String = "B: " + hi
}

/**
 * 이건 불가한 표현이다.
 * 해당 트레이트가 A1 클래스를 함께 활용하기 때문에
 * A1을 먼저 확장하고 B1을 함께 확장해야한다.
 */
// class C1 extends B1

class C1 extends A1 with B1


package org.john.chapter8

class DefineClass {

}

class Car(val make: String, var reserved: Boolean) {
  def reserve(r: Boolean): Unit = {reserved = r}
}

class Lotus(val color: String, reserved: Boolean)
  extends Car("Lotus", reserved) {

}

class Car2(val make: String, val reserved: Boolean = true, val year: Int = 2015) {
  override def toString: String = s"$year $make, reserved = $reserved"
}

class Singular[A](element: A) extends Traversable[A] {
  /**
   * @param f type A를 받아 B로 변환하는 함수
   * @tparam B output할 타입
   */
  def foreach[B](f: A => B): Unit = f(element)
}
package org.john.chapter4

class AboutParameter {
  def greet (prefix: String, name: String): String = s"$prefix $name"

  def greetInit (prefix: String = "", name: String): String = s"$prefix $name"

  // vararg
  def sum(items: Int*): Int = {
    var total = 0
    for (item <- items) total += item
    total
  }

  // param group
  def max(x: Int)(y: Int): Int = if (x > y) x else y

  // type param
  /**
   * 이렇게만 적으면 리턴 타입이 Any라서 String 변수 공간에 값을 할당하지 못한다.
   * 이렇게 되면 인풋 파라미터로 넘어오는 타입을 고려해야한다.
   */
  // def identity(a: Any): Any = a
  def identity[T](a: T): T = a
}

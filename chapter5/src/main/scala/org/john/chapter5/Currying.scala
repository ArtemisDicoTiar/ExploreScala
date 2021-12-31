package org.john.chapter5

class Currying {
  def factorOf(x: Int, y: Int): Boolean = y % x == 0
  val f = factorOf _

  val multipleOf3: Int => Boolean = factorOf(3, _: Int)

  def factorOfChain(x: Int)(y: Int) = y % x == 0
  val isEven: Int => Boolean = factorOfChain(2)(_)

  // call by name
  def doubles(x: => Int): Int = {
    println("Now doubling " + x)
    x * 2
  }

  def f(i: Int): Int = {
    println(f"Hello from f($i)")
    i
  }

  // partial function
  // 일부 데이터만 커링이 되는 경우 case를 이용해서 핸들링해야한다.
  /** 부분 함수 vs 부분적용 함수
   * 부분 함수 <= => 완전 함수
   *  모든 가능한 입력값 중 일부만 받아들인다.
   * 부분 적용 함수
   *  부분적으로 호출
   *  나머지 부분도 미래에는 완전히 호출되는 일반함수
    */

  val statusHandler: Int => String = {
    case 200 => "OK"
    case 400 => "Your Error"
    case 500 => "Our Error"
  }

}

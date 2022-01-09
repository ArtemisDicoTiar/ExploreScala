package org.john.chapter10

class Base {
  var i = 10
}

class Sub extends Base {
  /**
   * type param 에 모든 타입을 허용하는 대신 경계를 설정해서 사용한다.
   * 상한 경계 <:
   * 하한 경계 >:
   * @param b
   * @tparam B 대문자 B 라는 타입을 받는 데 Base 클래스로부터 상한 경계 설정해서 사용?
   * @return
   */
  def increment[B <: Base](b: Base): Base = {
    b.i += 1
    b
  }
}


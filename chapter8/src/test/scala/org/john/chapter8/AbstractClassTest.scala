package org.john.chapter8

import org.scalatest.funsuite.AnyFunSuite

class AbstractClassTest extends AnyFunSuite {
  // 아래 line은 불가한 표현이다. abstract 클래스로 인스턴스를 생성할 수 없다.
  // val c = new Car()

  test("testRedMini") {
    val m: ABSCar = new RedMini(2002)
    println(m)

    val redMini: ABSCar = new Mini(2005, "Red")
    println(redMini)
  }


}

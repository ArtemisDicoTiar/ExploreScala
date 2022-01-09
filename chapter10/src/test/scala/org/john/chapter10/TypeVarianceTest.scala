package org.john.chapter10

import org.john.chapter10.TypeVariance._
import org.scalatest.funsuite.AnyFunSuite

class TypeVarianceTest extends AnyFunSuite {
  test("testCar") {
    val c: Car = new Volvo()
    println(c)
    println(c.getClass)
    println(c -> ())
  }

  test("testItem") {
    // 이렇게 표현하면 안된다.
    // 동일한 다형성을 기반으로 하는 조정이 타입 매개변수에는 성립되지 않는다.
    // val c: Item[Car] = new Item[Volvo](new Volvo)
    val c1: Item[Volvo] = new Item[Volvo](new Volvo)
    // 혹은 위 식의 다른 해결책은 다음과 같다
    // Item 타임 매개변수를 Covariant 하게 만들면 된다.
    // 공변하는 타입은 필요에 따라 자동으로 기본 타입 중 하나로 변할 수 있다.
    // 공변하는 타입 매개변수는 + 표시를 붙여서 사용하면 된다.

    val c2: Item[Car] = new Item[Volvo](new Volvo)
    val auto = c2.get
    println(auto)
  }
}

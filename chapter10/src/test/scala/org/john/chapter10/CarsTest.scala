package org.john.chapter10

import org.john.chapter10.Cars._
import org.scalatest.funsuite.AnyFunSuite

class CarsTest extends AnyFunSuite {
  test("testCars") {
    def item(v: Item[Volvo]): Unit = {
      val c: Car = v.get
    }

    def check(v: Check[Volvo]): Unit = {
      v.check(new VolvoWagon())
    }

    // 아래에서 Volvo 혹은 그 이하 (Volvo를 extend한) 를 원하는 데 Car가 들어와서 에러가 발생한다.
    // item(new Item[Car](new Car()))

    item(new Item[Volvo](new Volvo))
    item(new Item[VolvoWagon](new VolvoWagon))
    check(new Check[Car]())
    check(new Check[Volvo]())
    // 아래 식도 문제다.
    // Volvo 그 이상의 (Volvo가 extend한) 클래스들이 들어와야하는데
    // Volvo 이하인 VolvoWagon이 들어와서 에러가 발생한다.
    // check(new Check[VolvoWagon]())
  }
}

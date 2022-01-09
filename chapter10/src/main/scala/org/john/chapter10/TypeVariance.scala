package org.john.chapter10

object TypeVariance {
  class Car {
    override def toString: String = "Car()"
  }
  class Volvo extends Car {
    override def toString: String = "Volvo()"
  }

  case class Item[+A](a: A) {
    def get: A = a
  }

  // 아래 처럼 Covariance 를 이용하려 하면 안된다.
  // 메소드의 입력 매개변수는 기본타입이 서브타입으로 변환될 수 없는 것과 같다.
  // Contra-Variance (반공변성) 를 이루게 하면 된다.
  // 반공변성은 타입 매개변수가 서브타입으로 변할 수 있는 것
  //  서브타입이 기본타입으로 변하는 다형성 변환의 정반대 방향으로
//  class Check[+A] {
//    def check(a: A): Unit = {
//      println(a)
//    }
//  }

  // 주의 할 점은 메소드의 변환타입으로는 반공변적인 타입 매개 변수로 사용될 수 없다.

//  class Check[-A] {
//    def check(a: A): Unit = {
//      println(a)
//    }
//  }
}

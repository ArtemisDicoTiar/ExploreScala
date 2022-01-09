package org.john.chapter10

object TypeAlias {
  object TypeFun {
    type Whole = Int
    val x: Whole = 5

    type UserInfo = Tuple2[Int, String]
    val u: UserInfo = new UserInfo(123, "Google")

    type T4[A, B, C, D] = Tuple4[A, B, C, D]
    val things = new T4(1, 'a', true, u)
  }
}

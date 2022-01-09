package org.john.chapter10

object TupleNFunctionValueClass {
  val x: (Int, Int) = Tuple2(10, 20)

  val hello1: String => String = (n: String) => s"Hello, $n"
  val h1: String = hello1("Function Literals")

  // 이 방식의 표현은 굉장히 별로다 IDE에서 추천하는 방식으로 정리하면 1번처럼 정리된다.
  val hello2 = new Function1[String, String] {
    def apply(v1: String) = s"Hello, $v1"
  }
  val h2: String = hello2("Function1 Instances")

  val doubler: Int => Int = (i: Int) => i * 2
  val plus3: Int => Int = (i: Int) => i + 3
  // 1 + 3 -> 4 * 2
  val prepend: Int = doubler.compose(plus3)(1)
  // 1 * 2 -> 2 + 3
  val append: Int = doubler.andThen(plus3)(1)
}

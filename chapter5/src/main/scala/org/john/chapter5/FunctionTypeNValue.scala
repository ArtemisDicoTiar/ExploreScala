package org.john.chapter5

class FunctionTypeNValue {
  def double(x: Int): Int = x * 2
  val myDouble: (Int) => Int = double
  val myDoubleCopy: Int => Int = myDouble

  // wildcard
  def wildDouble(x: Int): Int = x * 2
  val wildMyDouble: Int => Int = wildDouble _

  /** higher order
   *
   * @param s 안전한 변환할 문자열
   * @param f 변환 작업할 함수 (str -> str)
   */
  def safeStringOp(s: String, f: String => String): String = {
    // null check
    if (s != null) f(s) else null
  }

  def reverser(s: String): String = {
    s.reverse
  }

  /** Function literal
   * also known as
   *  Anonymous function
   *  Lambda expression
   *  Lambda
   *  function0, function1, function2, ...
   *  func0, func1, func2, ...
   *  Arrow function
    */

  val greeter: String => String = (name: String) => s"Hello, $name"

  def max(a: Int, b: Int): Int = if (a > b) a else b
  val maximise1: (Int, Int) => Int = max
  val maximise2: (Int, Int) => Int = (a: Int, b: Int) => if (a > b) a else b


  def logStart (): String = "=" * 1 + "\nStart Now\n" + "=" * 1
  val start: () => String = () => "=" * 1 + "\nStart Now\n" + "=" * 1

  val doubler: Int => Int = _ * 2

  def combination(x: Int, y: Int, f: (Int, Int) => Int): Int = f(x, y)

  def tripleOp(a: Int, b: Int, c: Int, f: (Int, Int, Int) => Int): Int = f(a, b, c)

  def tripleOpType[IN, OUT](a: IN, b: IN, c: IN, f: (IN, IN, IN) => OUT): OUT = f(a, b, c)



}

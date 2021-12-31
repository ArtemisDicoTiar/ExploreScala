package org.john.chapter5

import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite

class FunctionTypeNValueTest extends AnyFunSuite with BeforeAndAfter {

  test("testDouble") {
    val functionTypeNValue = new FunctionTypeNValue()
    assert(functionTypeNValue.double(5) == 10)
  }

  test("testMyDoubleCopy") {
    val functionTypeNValue = new FunctionTypeNValue()
    assert(functionTypeNValue.myDoubleCopy(5) == 10)
  }

  test("testMyDouble") {
    val functionTypeNValue = new FunctionTypeNValue()
    assert(functionTypeNValue.myDouble(5) == 10)
  }

  test("testSafeReverse") {
    val functionTypeNValue = new FunctionTypeNValue()
    assert(
      functionTypeNValue.safeStringOp(null, functionTypeNValue.reverser)
      == null
    )

    assert(
      functionTypeNValue.safeStringOp("ABC", functionTypeNValue.reverser)
        == "CBA"
    )
  }

  test("testGreeter") {
    val functionTypeNValue = new FunctionTypeNValue()
    assert(functionTypeNValue.greeter("World") == "Hello, World")
  }

  test("testMax") {
    val functionTypeNValue = new FunctionTypeNValue()
    assert(functionTypeNValue.max(84, 96) == 96)
    assert(functionTypeNValue.maximise1(84, 96) == functionTypeNValue.max(84, 96))
    assert(functionTypeNValue.maximise2(84, 96) == functionTypeNValue.max(84, 96))
  }

  test("testLog") {
    val functionTypeNValue = new FunctionTypeNValue()
    print(functionTypeNValue.logStart())
    print(functionTypeNValue.start())
  }

  test("testPassFunctionToHigherOrder") {
    val functionTypeNValue = new FunctionTypeNValue()
    assert(
      functionTypeNValue.safeStringOp(null, (s: String) => s.reverse)
        == null
    )

    assert(
      functionTypeNValue.safeStringOp("ABC", (s: String) => s.reverse)
        == "CBA"
    )

    assert(
      functionTypeNValue.safeStringOp("ABC", s => s.reverse)
        == "CBA"
    )

    assert(
      functionTypeNValue.safeStringOp("ABC", s => s.reverse)
        == "CBA"
    )
  }

  test("testDoubler") {
    val functionTypeNValue = new FunctionTypeNValue()
    assert(functionTypeNValue.doubler(10) == 20)
  }

  test("testPassFunctionPlaceholder") {
    val functionTypeNValue = new FunctionTypeNValue()
    assert(
      functionTypeNValue.safeStringOp(null, _.reverse)
        == null
    )

    assert(
      functionTypeNValue.safeStringOp("ABC", _.reverse)
        == "CBA"
    )
  }

  test("testCombination") {
    val functionTypeNValue = new FunctionTypeNValue()
    assert(functionTypeNValue.combination(23, 12, _ * _) == 23 * 12)
  }

  test("testTripleOp") {
    val functionTypeNValue = new FunctionTypeNValue()
    assert(functionTypeNValue.tripleOp(23, 92, 14, _*_ * _) == 23 * 92 * 14)
  }

  test("testTripleOp with type") {
    val functionTypeNValue = new FunctionTypeNValue()
    assert(functionTypeNValue.tripleOpType[Int, Int](23, 92, 14, _ * _ + _) == 23 * 92 + 14)
    assert(functionTypeNValue.tripleOpType[Int, Double](23, 92, 14, 1.0 / _ / _ / _) == 1.0 / 23 / 92 / 14)
    assert(functionTypeNValue.tripleOpType[Int, Boolean](23, 92, 14, _ > _ + _) == 23 > 92 + 14)
  }

}

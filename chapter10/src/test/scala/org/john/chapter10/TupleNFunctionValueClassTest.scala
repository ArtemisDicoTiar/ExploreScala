package org.john.chapter10

import org.scalatest.funsuite.AnyFunSuite

class TupleNFunctionValueClassTest extends AnyFunSuite {

  test("testX") {
    println("Does the arity = 2? " + (TupleNFunctionValueClass.x.productArity == 2))
  }

  test("testHello1") {
    println(TupleNFunctionValueClass.h1)
    println(TupleNFunctionValueClass.h2)
  }

  test("testDoubler") {
    println(TupleNFunctionValueClass.prepend)
    println(TupleNFunctionValueClass.append)
  }
}

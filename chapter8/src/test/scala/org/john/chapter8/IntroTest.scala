package org.john.chapter8

import org.scalatest.funsuite.AnyFunSuite

class IntroTest extends AnyFunSuite {
  // User1
  test("testUser1ClassInstanceOf") {
    val u = new User1()
    val isAnyRef = u.isInstanceOf[AnyRef]
    assert(isAnyRef)
  }

  test("testUser1Class") {
    val u = new User1()
    println(u.greet)

  }

  // User2
  test("testUser2Class") {
    val u = new User2(n = "Zeniba")
    println(u.greet)
  }

  // User3
  test("testUser3Calss") {
    val users = List(
      new User3("Shoto"),
      new User3("Art3mis"),
      new User3("Aesch")
    )
    val sizes = users.map(_.name.length)
    val sorted = users.sortBy(_.name)
    val third = users.find(_.name.contains("3"))
    val greet = third.map(_.greet).getOrElse("hi")

    assert(sizes == List(5, 7, 5))
    println(sorted)
    println(third)
    assert(greet == "Hello from Art3mis")

  }


  // extends
  test ("test Extending Class") {
    val hiA = new A().hi
    val hiB = new B().hi
    val hiC = new C().hi

    assert(hiA == "Hello from A")
    assert(hiB == "Hello from A")
    assert(hiC == "hi C -> Hello from A")

    val misc = List(new C, new A, new B)
    val messages = misc.map(_.hi).distinct.sorted
    println(misc)
    println(messages)
  }

}

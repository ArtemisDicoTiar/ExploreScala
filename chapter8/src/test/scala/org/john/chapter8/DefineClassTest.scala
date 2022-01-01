package org.john.chapter8

import org.scalatest.funsuite.AnyFunSuite

class DefineClassTest extends AnyFunSuite {
  test("testCar1") {
    val t = new Car("Toyota", false)
    t.reserve(true)
    println(s"My ${t.make} is now reserved? ${t.reserved}")
  }

  test("testCar2") {
    val t2 = new Car(reserved = false, make = "Tesla")
    println(t2.make)
  }

  test("testCar3") {
    val l = new Lotus("Silver", false)
    println(s"Requested a ${l.color} ${l.make}")
  }

  // Car2
  test("testCar2Class") {
    val a = new Car2("Acura")
    val l = new Car2("Lexus", year = 2010)
    val p = new Car2(reserved = false, make = "Porsche")
    println(a)
    println(l)
    println(p)
  }

  // Singular
  test("testSingular") {
    val p = new Singular("Planes")
    p.foreach(println)
    val name: String = p.head
    println(name)
  }

}

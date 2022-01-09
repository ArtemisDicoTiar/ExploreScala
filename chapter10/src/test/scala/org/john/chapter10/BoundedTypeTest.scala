package org.john.chapter10

import org.john.chapter10.BoundedType._
import org.scalatest.funsuite.AnyFunSuite

class BoundedTypeTest extends AnyFunSuite {

  test("testCheck") {
    BoundedType.check(new Customer("Fred"))
    BoundedType.check(new Admin("", "strict"))
  }

  test("testRecruit") {
    val customer = recruit(new Customer("Fred"))
    val preferred = recruit(new PreferredCustomer("George"))
    println(customer.getClass)
    println(preferred.getClass)
  }

  test("testCard") {
    val v1 = new SecurityCard().verify(new Admin("George", "high"))
    val v2 = new GiftCard().verify(new Customer("Fred"))
    println(v1)
    println(v2)
  }

}

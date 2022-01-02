package org.john.chapter9

import org.scalatest.funsuite.AnyFunSuite

class DBConnectionTest extends AnyFunSuite {
  test("testDBConnectionObject") {
    val conn = DBConnection()
    print(conn)
  }
}

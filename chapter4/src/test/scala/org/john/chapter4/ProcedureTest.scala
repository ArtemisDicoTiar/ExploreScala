package org.john.chapter4

import org.scalatest.funsuite.AnyFunSuite

class ProcedureTest extends AnyFunSuite {

  test("testFormatEuro") {
    val procedure = new Procedure()
    assert(procedure.formatEuro(3.4645) == "EUR3.46")

    assert(procedure.formatEuro({
      val rate = 1.32
      0.235 + 0.7123 + rate * 5.32
    }) == "EUR7.97")
  }

}

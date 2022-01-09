package org.john.chapter10

object ImplicitParameter {
  object Doubly {
    def print(num: Double)(implicit fmt: String): Unit = {
      println(fmt.format(num))
    }
  }

  case class USD(amount: Double) {
    implicit val printFmt: String = "%.2f"
    def print(): Unit = Doubly.print(amount)
  }
}

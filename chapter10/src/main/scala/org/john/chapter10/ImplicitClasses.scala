package org.john.chapter10

object ImplicitClasses {
  implicit class Hello(s: Int) {
    def hello = s"Hello, ${s}"
  }

  implicit class Hi(s: String) {
    def hello = s"Hello, ${s}"
  }

  def test(): Unit = {
    println(3.hello)
    println("World".hello)
  }
}

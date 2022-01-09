package org.john.chapter10

object ImplicitParams {
  def greet(name: String)(implicit greeting: String) = s"$greeting, $name"
  implicit val hi: String = "Hello"

  def test(): String = {
    greet("devs")
  }

}

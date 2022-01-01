package org.john.chapter8

abstract class ABSCar {
  val year: Int
  val automatic: Boolean = true
  def color: String
}

class RedMini(val year: Int) extends ABSCar {
  def color = "Red"
}

class Mini (val year: Int, val color: String) extends ABSCar {
  override def toString: String = s"Got a ${this.color} Mini"
}

class Abstract {

}

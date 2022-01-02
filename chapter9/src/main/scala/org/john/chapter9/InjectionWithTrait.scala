package org.john.chapter9


class User(val name: String) {
  def suffix = ""

  override def toString: String = s"$name$suffix"
}

trait Attorney {
  self: User =>
  override def suffix: String = ", esq."
}

trait Wizard {
  self: User =>
  override def suffix: String = ", Wizard"
}

trait Reverser {
  override def toString: String = super.toString.reverse
}

class InjectionWithTrait {

}

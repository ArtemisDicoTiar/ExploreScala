package org.john.chapter9

trait Base {
  override def toString: String = "BASE"
}

class A extends Base {
  override def toString: String = "A-> " + super.toString
}

trait B extends Base {
  override def toString: String = "B-> " + super.toString
}

trait C extends Base {
  override def toString: String = "C-> " + super.toString
}

class D extends A with C with B {
  override def toString: String = "D-> " + super.toString
}


package org.john.chapter8

class Intro {

}

class User1 {
  val name: String = "Yubaba"
  def greet: String = s"Hello from $name"

  override def toString: String = s"User($name)"

}

class User2(n: String) {
  val name: String = n
  def greet: String = s"Hello from $name"

  override def toString: String = s"User($name)"
}

class User3(val name: String) {
  def greet: String = s"Hello from $name"

  override def toString: String = s"User($name)"
}

class A {
  def hi = "Hello from A"

  override def toString: String = getClass.getName
}

class B extends A
class C extends B {
  override def hi: String = "hi C -> " + super.hi
}




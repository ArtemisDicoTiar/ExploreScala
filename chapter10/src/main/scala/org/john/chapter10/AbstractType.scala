package org.john.chapter10

object AbstractType {
  class User(val name: String)

//  trait Factory {
//    type A
//    def create: A
//  }
  trait Factory[A] {
    def create: A
  }

//  trait UserFactory extends Factory {
//    type A = User
//    def create: User = new User("")
//  }

  trait UserFactory extends Factory[User] {
    def create = new User("")
  }

}

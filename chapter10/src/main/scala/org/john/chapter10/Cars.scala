package org.john.chapter10

object Cars {
  class Car
  class Volvo extends Car
  class VolvoWagon extends Volvo

  class Item[+A](a: A){
    def get: A = a
  }

  class Check[-A] {
    def check(a: A): Unit = {
      println(a)
    }
  }
}

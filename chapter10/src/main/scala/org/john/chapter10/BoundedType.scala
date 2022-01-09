package org.john.chapter10

object BoundedType {
  /**
   * <:
   * 상한 경계 (Upper Bound)는 타입을 해당 타입
   *                          또는 그 서브 타입 중 하나로 제한.
   *    즉, 타입이 무엇이어야 하는 지를 정의하고, 폴리모피즘 (다형성)을 통해 서브타입을 허용한다.
   * >:
   * 하한 경계 (Lower Bound)는 타입을 해당 타입
   *                          또는 그 서브 타입이 확장한 기본 타입 중 하나로 제한한다.
   */
  class BaseUser(val name: String)
  class Admin(name: String, val level: String) extends BaseUser(name)
  class Customer(name: String) extends BaseUser(name)
  class PreferredCustomer(name: String) extends Customer(name)

  def check[A <: BaseUser](u: A): Unit = {
    if (u.name.isEmpty) println("Fail!")
  }

  def recruit[A >: Customer](u: Customer): A =
    u match {
      case p: PreferredCustomer => new PreferredCustomer(u.name)
      case c: Customer => new Customer(u.name)
  }

  abstract class Card {
    type UserType <: BaseUser
    def verify(u: UserType): Boolean
  }

  class SecurityCard extends Card {
    type UserType = Admin
    def verify(u: UserType) = true
  }

  class GiftCard extends Card {
    type UserType = Customer
    def verify(u: Customer) = true
  }
}

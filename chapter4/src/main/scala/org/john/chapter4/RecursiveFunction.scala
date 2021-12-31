package org.john.chapter4

import scala.annotation.tailrec

class RecursiveFunction {
  /**
   * 재귀함수 표시가 인텔리제이에서는 해당 함수 왼쪽에 빙글빙글 아이콘으로 표시된다.
   * 재귀함수에서 주의해야할 것 중에 하나는 Stack OverFlow가 발생할 수 있는 점이다.
   * Tail-recursion: 이를 예방하기 위해
   *  스칼라 컴파일러에게 추가적인 스택 공간을 사용하지 않도록하는 "tail-recursion"을 이용할 수 있다.
   *  새로운 스택 공간을 생성하지 않고 현재 실행중인 함수의 스택공간을 사용한다.
   *  즉, 마지막 문장이 재귀적 호출인 함수만이 컴파일러에 의해 최적화된다.
   *  # 주의: 자기 자신을 호출한 결과가 직접적인 반환값 외에 다른 것을 사용하면 최적화 될 수 없다.
   *
   * Tail-recursion 사용법
   *  function annotation을 이용
   *  @annotation.tailrec을 함수 앞에 작성.
   *  해당 함수가 tail-recursion을 이용함을 컴파일러에게 명시할 수 있다.
   *
   * 아래 power에 에노테이션을 바로 단다고 꼬리재귀로 변경되지 않는다.
   * 해당 함수의 마지막 문장이 재귀 호출이 아니기 때문.
   * 순서를 변경하자.
   */
  def power(x: Int, n: Int): Long = {
    if (n >= 1) x * power(x, n-1)
    else 1
  }

  @tailrec
  final def tailPower(x: Int, n: Int, res: Int = 1): Int = {
    if (n < 1) res
    else tailPower(x, n-1, x * res)
  }
}

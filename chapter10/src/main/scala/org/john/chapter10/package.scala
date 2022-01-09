package org.john

import scala.collection.mutable._

package object chapter10 {
  // 이렇게 패키지 파일에서 정의한 내용은 이 패키지 내에서 자유롭게 사용가능
  // python의 __init__.py와 유사한 기능을 가진 파일이다.
  type Mappy[A, B] = HashMap[A,B]
}

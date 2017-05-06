package hama.ch10

import scala.collection.immutable.HashSet


class Point(val x: Int, val y: Int) {
  def equals(other: Point): Boolean = this.x == other.x && this.y == other.y

  //HashSet도 항상 셋트로 해주어야 한다.
  override def equals(obj: scala.Any): Boolean = obj match {
    case that: Point => this.x == that.x && this.y == that.y
    case _ => false
  }

  override def hashCode(): Int = super.hashCode()
}


object Main {
  def main(args: Array[String]): Unit = {

    /**
      * 스칼라에서는 == 동일성인데
      * 값 타입의 경우는 자바와 마찬가지로 값을 비교한다
      * 참조 타입을 경우에 관해서는 스칼라는 == 는 자바의 equals와 같다
      * 즉 새로운 타입에 관해 euqals메소드를 오버라이드 하면 자바와는 다르게 == 의미도 재정의가 된다.
      * Any클래스에 있는 euqals는 오버라이드 하지 않는 경우 자바의 == 과 같은 객체 동일성을 사용한다
      * 자바의 euqals도 오버라이드 하기전에는 == 객체 동일성으로 판별하지만 오버라이드 하는순간 동등성을 비교하는데
      * 스칼라에서는 == <ㅡ 동일성을 비교하는 연산자도 바뀐다는게 다르다
      * 그래서 오로지 eq만 바라보도록 하는 연산자가 있다
      */

    val p1, p2 = new Point(1, 2)

    //오버로딩한 메소드 호출
    println(p1.equals(p2))

    //하지만 컬렉션에 넣기 시작하면 문제 발생

    val s = HashSet(p1)

    //false 발생
    println(s.contains(p2))

    val p2a: Any = p2

    println(p1.equals(p2a))
  }
}
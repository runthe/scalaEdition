package hama.ch06

import scala.collection.JavaConversions._
import scala.collection.mutable._

object Main {
  def main(args: Array[String]): Unit = {
    /** *
      *
      * 스칼라 <-->자바 양방향 변환가능 타입
      * *
      * Iterator <=> java.util.Iterator
      * Iterator <=> java.util.Enumeration
      * Iterable <=> java.lang.Iterable
      * Iterable <=> java.util.Collection
      *mutable.Buffer <=> java.util.List
      *mutable.Set <=> java.util.Set
      *mutable.Map <=> java.util.Map
      * 스칼라 --> 자바 단방향 변환 타입
      * Seq => java.util.List
      *mutable.Seq => java.util.List
      * Set => java.util.Set
      * Map => java.util.Map
      *
      * 변환을 위해서는 아래를 import 해야한다.
      *
      * import collection.JavaConversions._  // 변환을 위해서는 이것을 임포트 해야한다.
      * import collection.mutable._
      *
      */

    val jul: java.util.List[Int] = ArrayBuffer(1, 2, 3)
    val m: java.util.Map[String, Int] = HashMap("abc" -> 1, "hello" -> 2)
  }
}
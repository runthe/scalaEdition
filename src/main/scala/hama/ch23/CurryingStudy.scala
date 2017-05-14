package hama.ch23

import hama.ch23.CurryTest.nums

object Main {

  def modN(n: Int)(x: Int) = ((x % n) == 0)

  def main(args: Array[String]): Unit = {
    //http://hamait.tistory.com/692

    println(CurryTest.filter(nums, modN(2)))
    println(CurryTest.filter(nums, modN(3)))

    //커링은 인자를()() 이런식으로 나누어서 표현할수도 있다~~~
    //부분함수와 커링의 차이 아래 읽기
    //인자가 하나인 함수는 ()또는 {}로 표현할수도 있는 이렇게 한이유는 스칼라에서 내부에 함수 리터럴을 사용하도록 하기 위해서다.
    //www.vasinov.com/blog/on-currying-and-partial-function-application/
  }

  /*
    def sum(f: Int => Int): (Int, Int) => Int = {
      def sumF(a: Int, b: Int): Int = if (a > b) 0 else f(a) + sumF(a + 1, b) sumF
    }
  */
  //위 함수를 아래와 같이 표현할수도 있음
  //def sum(f: Int => Int)(a: Int, b: Int): Int = if (a > b) 0 else f(a) + sum(f)(a + 1, b)
}

object CurryTest extends App {
  def filter(xs: List[Int], p: Int => Boolean): List[Int] =
    if (xs.isEmpty) xs
    else if (p(xs.head)) xs.head :: filter(xs.tail, p)
    else filter(xs.tail, p)


  val nums = List(1, 2, 3, 4, 5, 6, 7, 8)
}


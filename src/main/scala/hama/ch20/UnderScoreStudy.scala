package hama.ch20

//import 에서 _ 모든것을 뜻한다 자바 *

object Main {
  var i: Int = _ //i =0
  var s: String = _
  //s = null

  //변수만 됩니다!!!
  //디폴트 초기화 시켜줍니다.

  def main(args: Array[String]): Unit = {
    //고계 함수에서 익명 파라미터
    (1 to 10).map(_ + 1)

    //부분 함수에서 익명 파라미터
    //좀 더 정확히 얘기하면 partially applied function.   partial function 과 구분된다. 바로가기
    //출처: http://hamait.tistory.com/654 [HAMA 블로그]

    def f(i: Int): String = i.toString

    def g = (x: Int) => f(x)

    def g2 = f _

    def u(i: Int)(d: Double): String = i.toString + d.toString

    def w = u(4) _ // (y: Double) => u(4)(y) 와 동일
    println(w(5)) // 45.0 출력

    //패턴 매칭
    val expr = List(1, 2, 3)

    val result = expr match {
      case List(1, _, _) => "첫번째 요소는 1 이며 3개의 요소를 가진 리스트"
      case List(_*) => "0 개나 혹은 더 많은 요소를 가진 리스트"
      case _ => "나머지 아무거나"
    }

    println(result)

    //제너릭에서 Wild를 걸수 있다. 와일드카드
    def size(objs: List[_]): Int = {
      objs.size
    }

    val t = new Test
    t.age = 5
    println(t.age)
  }
}

class Test {
  private var a = 0

  def age = a

  def age_=(n: Int) = {
    require(n > 0)
    a = n
  }
}
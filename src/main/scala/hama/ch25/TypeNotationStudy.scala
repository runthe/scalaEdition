package hama.ch25

object Main {
  def main(args: Array[String]): Unit = {
    val a1 = new A
    val a2 = new A

    //TypeMisMatch
    //a2.f(new a1.B)
    a2.g(new a1.B)

    val x = null.asInstanceOf[R#A]
    println(x)
  }
}

class A {

  class B

  def f(b: B) = println("Got my B")

  //이것의 의미는 아무 A인스턴스내의 B 클래스를 말한다.
  def g(b: A#B) = println("Got .B")

}

//타입 내부의 타입 지칭
trait R {
  type A = Int
}

//복합예제
//http://hamait.tistory.com/721
//apocalisp.wordpress.com/2010/06/08/type-level-programming-in-scala/
//stackoverflow.com/questions/9443004/what-does-the-operator-mean-in-scala



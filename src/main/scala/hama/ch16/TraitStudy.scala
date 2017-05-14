package hama.ch16


trait Car {

  val brand: String

}

trait Shiny {
  val shineRefraction: Int
}

class BMW extends Car with Shiny {

  val brand: String = "bmw"
  override val shineRefraction: Int = 13

}

trait Philosophical {
  def philosophize(): Unit = {
    println("I consume memory, therefore I am")
  }
}

class Animal

class Frog extends Animal with Philosophical {
  override def toString: String = "green"

  override def philosophize(): Unit = {
    println("It ain't easy being" + toString + "i")
  }
}


object main {

  /**
    * *
    * Scala 는 interface 가 없으며 대신  trait 을 사용한다.
    * Scala 의 trait 는 자바의 interface 와 달리 구현 가능하다. (자바8 부터는 자바인터페이스도 디폴트메소드등 구현)
    * 하나의 부모클래스를 갖는 클래스의 상속과 달리 트레이트는 몇개라도 조합해 사용 가능하다.
    * Scala 의 trait 는 자바의  인터페이스와 추상클래스의 장점을 섞었다.
    * 트레이트를 믹스인 할때는 extends 키워드를 이용한다.
    * extends 를 사용하면 trait 의 슈퍼클래스를 암시적으로 상속하고 , 본래 trait 를 믹스인한다.
    * trait 는 어떤 슈퍼클래스를 명시적으로 상속한 클래스에 혼합할 수 있다.
    * 그때 슈퍼클래스는 extends 를 사용하고, trait 는 with 로 믹스인한다.
    */


  /**
    * trait 는 클래스를 정의하면서 할 수 있는 모든것을 할 수 있다.
    * 문법 경우 2가지를 제외하고 정확히 같다. 첫째. 트레이트는 '클래스'
    * 파라미터를 가질 수 없다. 둘째 클래스는 super 호출을 정적으로 바인딩하지만,
    * 트레이는 동적으로 바인딩한다.
    *
    */
  def main(args: Array[String]): Unit = {

    val frog = new Frog
    frog.philosophize()

    val phil: Philosophical = frog
    phil.philosophize()

  }
}


class Rational(n: Int, d: Int) {
  val numer = n
  val denom = d

  def <(that: Rational) =
    this.numer * that.denom > that.numer * this.denom

  def >(that: Rational) = that < this

  def <=(that: Rational) = (this < that) || (this == that)

  def >=(that: Rational) = (this > that) || (this == that)
}


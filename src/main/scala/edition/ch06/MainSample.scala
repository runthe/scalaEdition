package edition.ch06

object MainSample extends App {
  println(new Rational(1, 2))
  println(new Rational(3))

  val rational1 = new Rational(1, 2)
  val rational2 = new Rational(1, 2)

  println(rational1 + rational2)

}

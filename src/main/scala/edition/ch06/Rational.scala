package edition.ch06


class Rational(n: Int, d: Int) {
  require(d != 0)

  val number: Int = n;
  val denom: Int = d;

  def this(n: Int) = this(n, 1) //보조 생성자

  def +(that: Rational): Rational =
    new Rational(number * that.denom + denom * that.denom, denom * that.denom)

  def +(i: Int): Rational =
    new Rational(number + i * denom, denom)

  def -(that: Rational): Rational = new Rational(number * that.denom - that.number * denom, denom * that.denom)




  override def toString: String = s"$n / $d"

  def add(that: Rational): Rational = new Rational(number * that.number, denom * that.denom)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}

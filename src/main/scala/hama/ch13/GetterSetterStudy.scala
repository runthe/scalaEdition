package hama.ch13


//private[this]
class Time {

  private[this] var h = 12

  private[this] var m = 0

  def hour: Int = h // getter

  def hour_=(x: Int) { //setter

    require(0 <= x && x < 24)

    h = x

  }


  def minute = m // getter

  def minute_=(x: Int) { // setter

    require(0 <= x && x < 60)

    m = x

  }
}

class Termometer {
  var celsius: Float = _

  // celsius 의 getter/setter 는 디폴트구현을 사용
  def fahrenheit = celsius * 9 / 5 + 32

  //fahrenheit 는 메소드만 존재해도 됨
  def fahrenheit_=(f: Float) {
    celsius = (f - 32) * 5 / 9
  }
}

object Main {

  def main(args: Array[String]): Unit = {

  }
}
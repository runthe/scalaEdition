package hama.ch04


object Main {

  def main(args: Array[String]): Unit = {
    /**
      * Set을 위한 기반 트레이트가 존재하며 이것을 상속받은 변경가능 불가능 트레이트가 존재
      *
      */

    var s = Set("Hi", "Hello")
    s += "bye"

    println(s"s: $s")

    import scala.collection.mutable.Set

    //새로운 할당이 일어나지 않게된다.
    val m = Set("what", "hi")
    m += "hh"

    println(s"m: $m")

  }
}

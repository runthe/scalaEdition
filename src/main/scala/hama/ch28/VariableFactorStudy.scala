package hama.ch28

object VariableFactorStudy {

  //타입 뒤에 * 를 붙여주면 됩니다.
  def func[T](xs: T*) = xs.foreach(x => println(x))

  //: _* 를 붙여줌으로써 컴파일러에게 가변인자라는것을 알려줍니다.
  def sum(xs: Int*): Int = if (xs.isEmpty) 0 else xs.head + sum(xs.tail: _*)

  def main(args: Array[String]): Unit = {
    func(0, 1, 2)
    println(sum(0, 1, 2, 3))

    val ns = List(1, 3, 5)
    //println(ns: _*)
    //println(sum(List(1, 3, 5))
  }
}

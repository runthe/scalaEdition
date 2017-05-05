package hama.impli

class MyTest(val text: String)

object TestPredef {

  implicit val test = new MyTest("what")

}

object Greet {
  def greet(some: String)(implicit test: MyTest) = {
    println(some)
    println(test.text)
  }
}

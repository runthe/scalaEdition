package hama.ch29

object LamdaStudy extends App {
  //스칼라에서 람다는 (x:Int) => Int 식은 다음과 같다.
  type HandlerProps = String => String
  def apply(f: String => HandlerProps): Unit = {
    println("apply")
  }

  def test = (x: Int) => x + 1

  println(test(3).toString())
}
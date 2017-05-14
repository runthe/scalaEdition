package hama.ch21

object Main {
  def main(args: Array[String]): Unit = {
    //Partially applied function Partial function 나중에 읽어보기
    //blog.outsider.ne.kr/953
    //http://hamait.tistory.com/655


    //case에 매칭되지 않아서 에러가 나는데 collect의 경우는 괜찮다.
    //List(41, "cat") map { case i: Int ⇒ i + 1 }
    //Collect 의 경우는 isDefinedAtdㅡ로 부분함수에 대한 검증을 합니다.
    println(List(41, "hihi").collect { case i: Int => i + 1 })

    //마지막으로 PartialFunction은 아래와 같이 만들며 자동으로 isDefinedAt이 만들어지는게 특징입니다.
    //[Int, Int]는 인자로 Int 리턴값으로 Int표현

    val fraction: PartialFunction[Int, Int] = {
      case d: Int if d != 0 => 42 / d
    }

    //인자가 Any고 Return Int형이다
    val liar: PartialFunction[Any, Int] = {
      case i: Int => i
      case s: String => s.toInt
    }

    println(liar.isDefinedAt(52))
    println(liar.isDefinedAt("53"))
    println(liar(5112))
    println(liar("what"))
  }
}
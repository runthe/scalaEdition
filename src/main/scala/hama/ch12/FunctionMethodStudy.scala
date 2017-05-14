package hama.ch12

import scala.io.Source

//헬퍼용 함수들은 프로그램의 네임스페이스를 오염시킬수 있기때문에 자바에서는 주로 비공개 메소드를 다루지만
//스칼라에서는 메소드의 안에 메소드를 사용해 처리한다
//또한 내부에서는 바깥함수의 인자를 사용한다.
object LongLines {

  def processFile(filename: String, width: Int) {

    def processLine(line: String) {
      if (line.length > width)
        println(filename + ": " + line.trim)
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(line)
  }
}

/**
  * trait Function1[ T1, R] extends AnyRef {
  * ...
  * def apply( v1 :T1) : R
  * ...
  * }
  * *
  * class Last( init : Int ) extends Function1[Int,Int]{
  * var last = init
  * *
  * def apply( x :Int ) : Int = {
  * val retval = last
  * last = x
  * retval
  * }
  * }
  *
  **/

// 함수 리터럴은 클래스로 컴파일하는데, 해당 클래스를 실행 시점에 인스턴스화하면 함수 값이 된다.
// 모든 함수 값은 FunctionN 트레이트 중 하나를 확장한 클래스로부터 만든 인스턴스이다.
// Function() 은 인자가 없는 함수고, Function1 은 인자가 1개인 식이다.
// 여기에는 함수 호출시 사용하는 apply 메소드가 들어 있다.
// 매우중요!!

object Main {

  def echo(args: String*) = for (arg <- args) println(arg)

  def printTime(out: java.io.PrintStream = Console.out) = println(s"What!!" + System.currentTimeMillis())

  def speed(distance: Float, time: Float): Float = distance / time

  /**
    * def와 val의 차이
    * val test: () => Int = {}
    */

  val test: () => Int = { // 이미 평가됨  (리턴값이 항상 같을 경우 사용 할 수 있다)
    val r = util.Random.nextInt
    () => r
  }

  def testFunc(): () => Int = {
    val r = util.Random.nextInt
    () => r
  }

  def main(args: Array[String]): Unit = {

    LongLines.processFile("build.sbt", 3)

    //함수리터럴
    val increase = (x: Int) => x + 1
    println(increase(1))

    //함수 리터럴 둘이상의 문장 예제
    val increate = (x: Int) => {
      println("")
      println("")

      x + 1
    }

    println(increate(1))

    echo("123", "456", "789")

    //배열을 반복 인자로 전달하기 위해서는 다음과 같이 콜론에 _* 기호를 추가해야 한다.
    echo(Array("ZZ", "DD"): _*)

    speed(100, 10) // 일반적 사용
    speed(distance = 0.5f, time = 2.3f)

    printTime()

    //함수 def val 차이

    println(test())
    println(test())
    println(testFunc.apply())
    println(testFunc.apply())
  }
}
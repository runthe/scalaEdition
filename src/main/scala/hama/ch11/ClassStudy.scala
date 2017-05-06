package hama.ch11

//기본 생성자 클래스
class Person(var name: String, var age: Int)

class AnotherPerson(val firstName: String, val lastName: String) {
  println(("the constructor begins"))
  val fullName = firstName + " " + lastName
  val HOME = System.getProperty("user.home")

  printFullName
  println("stiil in the constructor")

  def foo {
    println("foo")
  }

  def printFullName {
    println(fullName)
  }
}

class Pizza { // 기본 생성자에는 매개변수를 받는게 없다.
  var crustSize = 12
  var crustType = "Thin"

  def this(crustSize: Int) {
    this()
    this.crustSize = crustSize;
  }

  def this(crustSize: Int, crustType: String) {
    this(crustSize)
    this.crustType = crustType
  }

  override def toString() = {
    "What? %s %s".format(crustType, crustSize)
  }
}

//디폴트 매개변
class Socket(var timeout: Int = 10000)

case class CasePerson(var name: String, var age: Int) // class 앞에 case 를 붙여주는것으로

object Main {
  def main(args: Array[String]): Unit = {
    add2()
    add3()


    println(s"$add2 $add3")

    new Person("", 55)
    new AnotherPerson("haha", "yoyo")

    println(new Pizza)
    println(new Pizza(14))
    println(new Pizza(14, "thin"))

    println(new Socket().timeout)
    println(new Socket(5000).timeout)
  }

  /**
    * 프로시저 처럼 작성하는법
    * Unit을 생략하고 = 을 없애서 {} 메소드를 나타낼 수 있는데, 이건 프로시저 처럼 보이게 하는데 프로시저란 오직 부수 효과를 얻기 위해서만 사용하는
    * 메소드를 의미한다.
    */

  /**
    * * 컴파일 안됨 trait Animal(name: String)
    * 추상 클래스는 가능 ! abstract class Animal(name: String)
    */

  //Unit리턴
  def add2() {
    "hihi"
  }

  def add3() = "what"
}
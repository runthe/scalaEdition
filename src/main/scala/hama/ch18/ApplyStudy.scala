package hama.ch18

object Main {
  /**
    * Apply
    * 해당 객체 뒤에 하나 이상의 값을 괄호 { } 로 둘러싸서 호출하면 그 객체의 apply()메소드를 자동으로 호출해줍니다
    * 스칼라에서는 apply라는 메소드가 기본적으로 이 객체 저 객체에 각자 정의되어 있습니다 함수타입에서 apply 하면 이렇게 작동하고, 리스트에서 apply하면 이렇게
    * 작동하고 중구난방입니다.
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    val at = new applyTest();
    at(10)
    at {
      10
    }


    val at2 = new applyTest2();
    at2 {
      println
    }

    val at3 = new applyTest3();
    println(at3 {
      ob1.getSomeValue()
    })

    val arr = new Array[String](2) //타입이 2개 담길수있는 배열의 객체
    //arr.apply(0) 이렇게 자동으로 변경됨
    arr(0)

    //Array생성하기
    val arr2 = Array("hello", "world")
    //암묵적으로 object 팩토리메소드가 작동함 Array.apply("hello","world")

    //함수타입에서 사용

    val f1 = (x: Int, y: Int) => x + y
    //f1.apply(5,3) 이 함수의 리터럴 타입은 Function2 이며 스칼라에선 모든게 다 객체이다.
    println(f1(5, 3))
  }

  class applyTest {
    def apply(n: Int): Unit = {
      print("hello world")
      println("")
    }
  }

  //함수를 넘기는게 가능하다.
  class applyTest2 {
    def apply(f: String => Unit): Unit = {
      f("applyTest2")
    }
  }

  class applyTest3 {
    def apply(block: => String): Unit = {
      println(block)
    }
  }

  object ob1 {
    def getSomeValue(): String = {
      "wow!!!"
    }
  }

}
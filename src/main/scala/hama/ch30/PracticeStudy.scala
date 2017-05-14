package hama.ch30


object PracticeStudy extends App {


  def timesTwo(i: Int): Int = {
    println("hello world")
    i * 2
  }

  //이름 없는 함수 {} 를 통해 묵는다.
  { i: Int =>
    println("hello world")
    i * 2
  }

  //스칼라에서 () {} 같이 사용한다. 단 인자가 하나일 경우
  //스칼라가 이렇게 한 이유는 클라이언트 프로그래머가 중괄호 내부에 함수 리터럴을 사용하도록 하기 위해서이다.

}

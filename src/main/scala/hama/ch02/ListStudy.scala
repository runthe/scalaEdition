package hama.ch02

object Main {
  def main(args: Array[String]): Unit = {
    val x = List.range(1, 10)
    val y = List.fill(3)("foo")

    println(s"x: $x")
    println(s"y: $y")
    List.tabulate(5)(n => n * n)

    val a = List(1, 2)
    val b = List(3, 4)

    println(a ::: b)
    //: 로 끝나는 메소드는 오른쪽 피연산자의 메소드를 사용한다 그래서 a.::(0) 이 된다.
    println(0 :: a)

    //리스트에서 뒤에 추가하는 연산은 리스트의 길이만큼 오래 걸린다.
    //-이걸 효율적으로 할려면 일단 리스트를 뒤집고, 앞에다가 원소를 추가한후 다시 뒤집는다
    //-ListBuffer를 이용한다.

    //빈리스트
    List()

    //두번쨰 원소까지 제거
    val aa = List(1, 2, 3)
    val bb = aa.drop(2)

    println(s"bb: $bb")

    val z = 1 :: 2 :: 3 :: Nil

    //:: List의 메소드이기 떄문에 List를 넣어주어야 하는데 Nil은 리스트의 멤버이기 때문에 타입 추론을해서 List로 만들어준다

  }
}
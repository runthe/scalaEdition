package edition.ch02

object ListSample {

  def main(args: Array[String]): Unit = {
    val oneTwoThree = List(1, 2, 3)
    val fourFive = List(4, 5)

    val onTwoThreeFourFive = oneTwoThree ::: fourFive

    println(s"$oneTwoThree, $fourFive, $onTwoThreeFourFive")

    val test01 = 1 :: 2 :: 3 :: Nil
    println(test01)

    /**/


    val thrill = "Will" :: "fill" :: "until" :: Nil

    println(thrill(2))
    //앞에 원소 2개 없앤 리스트 반환
    println(thrill.drop(2))
    //오른쪽 원소 2개 없앤 리스트 반환
    println(thrill.dropRight(2))
    //exists 존재하는지 boolean 반환
    println(thrill.exists(s => s == "until"))
    //exists 문자열 갯수가 4인것만 List 반환
    println(thrill.filter(s => s.length == 4))
    //forall 모든 원소가 끝이 "l"인 문자열인지 여부를 반환
    println(thrill.forall(s => s.endsWith("l")))
    println(thrill.foreach(s => print(s)))
    println(thrill.foreach(print))
    //리스트의 첫번쨰 요소를 반환한다
    println(thrill.head)
    //리스트에서 마지막 원소를 제외한 나머지 리스트를 반환한다
    println(thrill.init)
    //리스트에서 마지막 원소를 반환한다
    println(thrill.last)
    //리스트 사이즈를 구한다
    println(thrill.length)
    //각 리스트의 원소 문자열뒤에 y를 추가한 문자열로 이뤄진 새 리스트를 반환한다
    println(thrill.map(s => s + "y"))
    //리스트의 원소를 가지고 문자를 만든다.
    println(thrill.mkString(", "))
    //리스트의 모든 원소중 길이가 4인것을 제외한 나머지 원소를 thril 리스트에 있는 순서대로 반환한다
    println(thrill.reverse)
    //리스트의 첫 원소를 제외한 나머지 리스트를 반환한다
    println(thrill.tail)


  }
}

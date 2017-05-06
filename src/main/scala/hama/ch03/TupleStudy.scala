package hama.ch03

object Main {
  def main(args: Array[String]): Unit = {
    /**
      * 리스트와 마찬가지로 불변이다.
      * 리스트와 다른점은 타입의 원소를 넣는다
      * 메소드에서 여러 다양한 객체를 리턴해야하는 경우 유용하다.
      */

    val p = ("hi", 1)


    //이것의 타입은 Tuple2[String,Int] 이다.
    //튜플을 원소의 접근을 0이 아니라 1부터 시작한다.
    //튜플은 원소접근을 p(0) p.apply(0) 처럼 할수 없을까
    //리스트 apply메소드는 항상 동일한 타입의 객체를 반환하는 반면, 튜플의 각원소들을 타입이 다를수 있기 때문
   println(p._1)

  }
}
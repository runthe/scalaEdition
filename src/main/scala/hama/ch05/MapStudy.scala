package hama.ch05

object Main {

  def main(args: Array[String]): Unit = {
    /**
      * Map 은 변경가능한 것 불가능한것 모두 사용가능
      * put, remove는 immutable.Map에서 사용불가
      * Map을 위한 기반트레이트가 있다. 셋과 비
      */

    val m = Map[Int, String]()
    val m2 = (1 -> "hi", 2 -> "bye")
    val m3 = ((1, "one"), (2, "two"))

    //튜플로 이루어진 List를 이용
    val myList = List("England" -> "LonDon", "Germany" -> "Berlin")
    val myMap = myList.groupBy(e => e._1).map(e => (e._1, e._2(0)._2))
    val betterConversion = Map(myList: _*)
    val scala28Map = myList.toMap

    println(myMap)
    println(betterConversion)
    println(scala28Map)

    //map 메소드를 이용
    val myMapList = List("England", "London", "Germany", "Berlin")
    val map: Map[String, Int] = myMapList.map(s => s -> s.length).toMap

    println(map)

    //두개의 리스트를 조합해서
    val ndx = List(1, 2)
    val vals = List("one", "two")
    val mymap = for ((i, v) <- ndx.zip(vals)) yield {
      i -> v
    }

    println(mymap)

    import scala.collection.mutable.Map
    val mutableM = Map[Int, String]()

    mutableM(0) = "zero"
    mutableM += (1 -> "one")
    mutableM += (2 -> "two")

    //축약형
    1 -> "one"
    1.->("one")

    println(mutableM.put(3, "three"))
    println(mutableM.getOrElseUpdate(4, "four"))

    //제거
    mutableM -= 1
    mutableM.remove(2)
    mutableM.retain((k, v) => k < 2)

    //변환
    //스스로는 변화되지 않는데 변환된것을 리턴해준다.
    val filterM = mutableM.filterKeys(_ > 1)
    val filterM2 = mutableM.mapValues(_ * 5)

    //변경
    val transM = mutableM.transform((k, v) => v * 5)


    //Map -> mutable.Map으로 변경
    val myImmutableMap = collection.immutable.Map(1 -> "one", 2 -> "two")
    val myMutuableMap = collection.mutable.Map() ++ myImmutableMap

    println(myImmutableMap)
    println(myMutuableMap)
    // var로 선언하면 값을 변경하는것을 immutable.Map에서도 가능하다.
    // 자신을 변경하는게 아니라 변경된 Map을 새로운 var변수에 할당하는것이기 때문

  }
}

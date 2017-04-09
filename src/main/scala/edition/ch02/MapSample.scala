package edition.ch02

/**
  * Created by soo on 2017. 4. 1..
  */
object MapSample extends App {
  val romanNumeral = Map(1 -> "one", 2 -> "two", 3 -> "three")
  println(romanNumeral)

  import scala.collection.mutable.Map

  val treasureMap = Map[Int, String]()
  treasureMap += (1 -> "Go to")
  treasureMap += (2 -> "Find Big X")
  treasureMap += (3 -> "Dig")

  println(treasureMap)
}

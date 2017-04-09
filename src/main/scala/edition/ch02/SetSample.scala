package edition.ch02

/**
  * Created by soo on 2017. 4. 1..
  */
object SetSample extends App {

  var jetSet = Set("Boeing", "Airbur")
  jetSet += "Lear"
  println(jetSet.contains("Lear"))

  import scala.collection.mutable.Set

  var movieSet = Set("Hitch", "Poltergeist")
  movieSet += "Sherk"
  println(movieSet)

  import scala.collection.immutable.HashSet

  var hashSet = HashSet("Tomatoes", "Chilies")
  println(hashSet + "Coriander")

}

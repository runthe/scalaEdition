package edition.ch04

/**
  * Created by soo on 2017. 4. 1..
  */
object MainSample extends App {

  val acc = new ChecksumAccmulator()
  val caa = new ChecksumAccmulator()

  ChecksumAccmulator.calculate("Every value is an object.")

  println(s"$acc $caa")
  println(acc.add(3))
}

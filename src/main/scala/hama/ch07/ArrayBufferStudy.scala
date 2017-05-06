package hama.ch07

object Main {
  def main(args: Array[String]): Unit = {

    var array = Array(1, 2, 3)
    array +:= 1
    array +:= 2

    println(array)

    val buf = collection.mutable.ArrayBuffer.empty[Int]
    buf += 1
    buf += 10

    val ar = buf.toArray
    ar.foreach(println)
  }
}
package hama.ch08

import scala.collection.mutable

object Main {

  def main(args: Array[String]): Unit = {
    val queue = new mutable.Queue[String]()
    queue += "a"
    queue ++= List("b", "c")
    println(queue.dequeue())
  }

}

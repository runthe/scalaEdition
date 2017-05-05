package hama.impli

import hama.impli.TestPredef._

object Main {

  def create[T](implicit factory: Factory[T]): T = factory.create

  def main(args: Array[String]): Unit = {
    println(create[String])
    println(create[Int])

    println("implicit Parameter")
    Greet.greet("hey")
  }
}

/**
  * http://hamait.tistory.com/605
  */


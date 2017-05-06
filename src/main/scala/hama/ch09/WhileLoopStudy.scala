package hama.ch09

import java.io.File

import scala.io.Source

object Main {
  def main(args: Array[String]): Unit = {

    /***
      *
      * 순수 재귀형 함수      *
      * while 문 배제
      */




    Source.fromFile(new File("build.sbt")).getLines().foreach {
      println
    }

    import scala.util.control.Breaks._
    var largest = 0

    breakable {
      for (i <- 999 to 1 by -1; j <- i to 1 by -1) {
        val product = i * j
        if (largest > product) {
          break
        } else if (product.toString.equals(product.toString.reverse)) {
          largest = largest max product
        }
      }
    }
  }
}
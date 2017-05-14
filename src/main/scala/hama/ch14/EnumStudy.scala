package hama.ch14

object Margin extends Enumeration {
  type Margin = Value

  val TOP
  , BOTTOM
  , LEFT
  , RIGHT = Value
}

package com.acme.app {

  trait Margin

  case object TOP extends Margin

  case object RIGHT extends Margin

  case object BOTTOM extends Margin

  case object LEFT extends Margin

}

//문제점이 있으니 다시 한번 봐보기

object Main {

  def main(args: Array[String]): Unit = {
    // use an enumeration value in a test
    import Margin._
    var currentMargin = TOP
    // later in the code ...
    if (currentMargin == TOP) println("working on Top")
    // print all the enumeration values
    // Margin.values foreach println
  }
}
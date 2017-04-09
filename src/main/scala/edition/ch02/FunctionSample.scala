package edition.ch02

/**
  * Created by soo on 2017. 4. 1..
  */
object FunctionSample extends App {

  //var가 존재하므로 명령형 스타일이란다
  def printArgs1(args: Array[String]): Unit = {
    var i = 0

    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }

  def printArgs2(args: Array[String]): Unit = {
    for (arg <- args) {
      println(arg)
    }
  }

  def printArgs3(args: Array[String]): Unit = {
    args.foreach(println)
  }

  def formatArgs(args: Array[String]) = args.mkString("\n")

  val arrays = Array("11", "22", "33")
  printArgs1(arrays)
  printArgs2(arrays)
  printArgs3(arrays)

  //print 부수효과를 밖으로 뺸것이다
  println(formatArgs(arrays))
}
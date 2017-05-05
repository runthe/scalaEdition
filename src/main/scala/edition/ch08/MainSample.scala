package edition.ch08

object MainSample {

  def main(args: Array[String]): Unit = {


    11 :: 22 :: Nil

    var increase = (x: Int) => x + 1
    var increase2 = (x: Int) => {
      println("Hi")
      println("Hello")
      println("Nice")

      x + 1
    }

    println(increase);
    println(increase2);

    val someNumbers = List(-11, -10, -5, 0, 5, 10)
    someNumbers.foreach((x: Int) => print(x))
    someNumbers.filter((x: Int) => x > 0)
    someNumbers.filter((x) => x > 0)
    someNumbers.filter(x => x > 0)
    someNumbers.filter(_ > 0)

    val f = (_: Int) + (_: Int)

    someNumbers.foreach(println _)
    someNumbers.foreach(x => println(x))

  }
}

package hama.ch17

object Main {

  def main(args: Array[String]): Unit = {
    val numbers = Map("one" -> 1, "two" -> 2)
    val h2: Option[Int] = numbers.get("two")

    //Some(2)
    println(h2)

    if (h2.isDefined) {
      println(h2.get)
    }

    println(h2.getOrElse("What!!"));

    val result = h2 match {
      case Some(n) => n
      case None => "nothing"
    }

    println(s"result:$result")

    val either = eitherTest(h2)
    println("eitersr" + either)

    if (either.isRight) {
      println(s"Number is $either.isRight")
    } else if (either.isLeft) {
      println(s"Number is $either.isLeft")
    }
  }

  //제대로 된 값이 들어오면 Right, 제대로 된값이 안들어오면 왼쪽
  def eitherTest(numbers: Option[Int]): Either[String, Int] = numbers match {
    case Some(n) => Right(n)
    case None => Left("What the!!")
  }
}


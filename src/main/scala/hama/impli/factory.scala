package hama.impli

trait Factory[T] {

  def create: T

}

object Factory {

  implicit def createStringFactory: Factory[String] = new Factory[String] {
    def create = "!"
  }

  implicit def createIntFactory: Factory[Int] = new Factory[Int] {
    def create = 1
  }

}


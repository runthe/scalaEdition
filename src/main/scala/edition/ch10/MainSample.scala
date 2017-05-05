package edition.ch10

object MainSample {

  abstract class Element {
    def demo() {
      println("Element's implementation invoked")
    }
  }

  class ArrayElement extends Element {
    override def demo() {
      println("ArrayElement's implementation invoked")
    }
  }

  class LineElement extends ArrayElement {
    override def demo() {
      println("LineElement's implementation invoked")
    }
  }

  // UniformElement는 Element의  demo를 상속한다.
  class UniformElement extends Element

  def invokeDemo(e: Element) {
    e.demo()
  }

  def main(args: Array[String]): Unit = {
    invokeDemo(new ArrayElement)
    invokeDemo(new LineElement)
    invokeDemo(new UniformElement)
  }
}

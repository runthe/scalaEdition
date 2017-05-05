package edition.ch12


object MainSample {


  abstract class IntQueue {
    def get(): Int

    def put(x: Int): Unit
  }

  import scala.collection.mutable.ArrayBuffer

  class BasicIntQueue extends IntQueue {
    private val buf = new ArrayBuffer[Int]

    override def get(): Int = buf.remove(0)

    override def put(x: Int): Unit = {
      buf += x
    }
  }

  trait Doubling extends IntQueue {
    abstract override def put(x: Int) {
      super.put(2 * x)
    }
  }

  trait Incrementing extends IntQueue {
    abstract override def put(x: Int): Unit = {
      super.put(x + 1)
    }
  }

  trait Filtering extends IntQueue {
    abstract override def put(x: Int): Unit = {
      if (x >= 0) super.put(x)
    }
  }

  class MyQueue extends BasicIntQueue with Doubling

  def main(args: Array[String]): Unit = {
    val queue = new MyQueue
    queue.put(10)
    println(queue.get())
  }
}

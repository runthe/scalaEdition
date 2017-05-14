package hama.ch15


abstract class Expr

case class Var(Name: String) extends Expr

case class Number(num: Double) extends Expr

case class BinOp(operator: String, left: Expr, right: Expr) extends Expr


object Main {

  def main(args: Array[String]): Unit = {

    /**
      * 특징
      * 컴파일러는 클래스 이름과 같은 이름의 팩토리 메소드를 추가한다
      * new Number(3.0)  Number(3.0) 가능하다
      *
      * 케이스 클래의 파라미터의 목록을 val접두사를 붙인다
      * val n = Number(3.0)
      * n.num
      *
      * toString, hashCode, equals 메소드들이 자동으로 추가된다
      *
      * 컴파일러는 케이스 클래스에서 일부를 변경한 복사본을 생성하는 copy메소드를 추가한다
      * *
      * operator 만 바꾸고 op 같은 연산자를 만드는 법
      *
      * 패턴매치
      * 1.fall through하지 않는다
      * 2.디폴트 케이스를 반드시 넣야하며 매칭되지않으면 Match Error 발생
      *
      *
      */

    val binop = BinOp("+", Var("hi"), Number(5))

    //와일드 카드 패
    binop match {
      case BinOp(op, left, right) =>
        println(binop + "is a binary operation")
      case _ =>
    }

    //변수 패턴
    binop match {
      case somethingElse => "not zero: " + somethingElse
    }

    //생성자 패턴
    binop match {
      case BinOp("+", e, Number(0)) => println("a deep match")
      case _ =>
    }

    //시퀀스 패
    /*
    binop match {
      case List(0, _, _) => println("found it")
      case _ =>
    }
    binop match {
      case List(0, _*) => println("found it")
      case _ =>
    }
    */

    def tupleDemo(expr: Any) =
      expr match {
        case (a, b, c) => println("matched " + a + b + c)
        case _ =>
      }

  }

  //상수 패턴
  def describe(x: Any) = x match {
    case 5 => "five"
    case true => "truth"
    case "hello" => "hi!"
    case Nil => "the empty list"
    case _ => "something else"
  }

  //튜플패턴
  def tupleDemo(expr: Any) =
    expr match {
      case (a, b, c) => println("matched " + a + b + c)
      case _ =>
    }

  //타입 지정패턴
  def generalSize(x: Any) = x match {
    case s: String => s.length
    case m: Map[_, _] => m.size
    case _ => -1
  }
}
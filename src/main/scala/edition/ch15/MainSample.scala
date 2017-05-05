package edition.ch15


object MainSample {

  sealed abstract class Expr

  case class Var(name: String) extends Expr

  case class Number(num: Double) extends Expr

  case class UnOp(operator: String, arg: Expr) extends Expr

  case class BinOp(operator: String,
                   left: Expr, right: Expr) extends Expr

  def main(args: Array[String]): Unit = {
    val what = new Var("zz").isInstanceOf
    val map = Map("zz" -> 11, "aa" -> 22)

    val myTuple = (123, "abc")
    val (number, string) = myTuple

    println(map.get("zz"))
    println(number)

  }

  def simplifyTop(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", expr)) => expr
    case BinOp("+", expr, Number(0)) => expr
    case _ => expr
  }

  //패턴가드 if
  def simplifyAdd(e: Expr) = e match {
    //case BiniOp("+", x, y) if x == y => BinOp("*", x, Number(2))
    case _ => e
  }
}

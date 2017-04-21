package edition.ch07

object MainSample {

  def main(args: Array[String]): Unit = {
    val filename = if (!args.isEmpty) args(0) else "default.txt"
    val filesHere = (new java.io.File(".")).listFiles()
    for (file <- filesHere) println(file)
    for (i <- 1 to 4) println(i)
    for (i <- 1 until 4) println(i)
    for (i <- 0 to filesHere.length - 1) println(filesHere(i))
    for (file <- filesHere if file.getName.endsWith(".scala")) println(file)
    for (file <- filesHere if file.isFile if file.getName.endsWith(".scala")) println(file)


    def fileLines(file: java.io.File) = scala.io.Source.fromFile(file).getLines().toList

    def grep(pattern: String) = for (
      file <- filesHere if file.getName.endsWith(".scala");
      line <- fileLines(file) if (line.trim.matches(pattern))
    ) println(file + ": " + line.trim)

    def scalaFiles = for {
      file <- filesHere
      if file.getName.endsWith(".scala")
    } yield file


    val firstArg = if (args.length > 0) args(0) else ""
    val friend =
      firstArg match {
        case "salt" => println("pepper")
        case "chips" => println("salsa")
        case "eggs" => println("bacon")
        case _ => println("huh?")
      }

    println(friend)
    println(filename)

    grep(".*gcd.*")
  }

  def gcd(x: Long, y: Long): Long = if (y == 0) x else gcd(y, x % y)
}

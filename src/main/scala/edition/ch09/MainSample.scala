package edition.ch09

object MainSample {

  private def filesHere = (new java.io.File(".").listFiles)

  private def filesMatching(matcher: String => Boolean) = {
    for (file <- filesHere; if matcher(file.getName))
      yield file
  }

  def filesEnding(query: String) = filesMatching(_.endsWith(query))
  def filesContaining(query: String) = filesMatching(_.endsWith(query))

  def main(args: Array[String]): Unit = {
    println(containsNeg(List(1, 2, 3, 4, 5, 6)))
    println(containsNeg(List(1, 2, -3, -4)))


  }


  def containsNeg(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num < 0)
        exists = true

    exists
  }

  def containsNegToHigh(nums: List[Int]) = nums.exists(_ < 0)
}

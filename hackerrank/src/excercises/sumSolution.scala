package excercises

object sumSolution extends App {
  
  import scala.io.StdIn._
  
  val e = readInt
  val nums = (for (n <- 1 to e) yield readInt).toArray
  
  def sum(numbers: Array[Int]): Int =
    (nums foldLeft 0)(_ + _)

  
  print(sum(nums))
  
}
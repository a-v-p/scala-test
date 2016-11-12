package excercises

/**
 * HOURGLASS PROBLEM
 *
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 *
 */

object array2D {

  import scala.io.StdIn._

  def sumHg(a: Int, b: Int, m: Array[Array[Int]]) = {
    
    def hourGlass(a: Int, b: Int, m: Array[Array[Int]]) = {
      val r1 = (for (i <- b until b + 3) yield m.apply(a).apply(i)).toList
      val r2 = List(0, m.apply(a + 1).apply(b + 1), 0)
      val r3 = (for (i <- b until b + 3) yield m.apply(a + 2).apply(i)).toList

      r1 :: r2 :: r3 :: Nil
    }

    hourGlass(a, b, m).map(_.sum).sum  
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var arr = Array.ofDim[Int](6, 6);
    for (arr_i <- 0 to 6 - 1) {
      for (arr_j <- 0 to 6 - 1) {
        arr(arr_i)(arr_j) = sc.nextInt();
      }
    }

    val sumTotal = (for {
      r <- 0 to 3
      c <- 0 to 3
    } yield sumHg(r, c, arr)).toList

    println(sumTotal.max)

  }
}
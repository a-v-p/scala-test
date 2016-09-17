package excercises

object stairCase {
  
  import scala.io.StdIn._
 
  
  def StairCase(n: Int) = {
  val v =  (for {
                  j <- 0 until n
                  i = n - j
                 } yield (" "*j ++ "#".padTo(i, "#"))).reverse
  
  for (x <- v) yield println(x.mkString)
    }                                             
  
  
   def main(args: Array[String]) {
     
    var _n: Int = readInt
    
    StairCase(_n)
  }
  
}
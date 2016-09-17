package excercises

object sumPolygon extends App {
  
  import scala.io.StdIn._
  import scala.math._
  
  val e = readInt
  
  val ai = (for (j <- 1 to e) yield readLine.split(" ")).toList
  
  val lpoint = (for (i <- ai) yield (i.apply(0).toDouble, i.apply(1).toDouble))
  
  val lvert = lpoint ::: lpoint.head :: Nil
  
  def sideLength(a: (Double, Double), b: (Double, Double)): Double =
    if (a._1 == b._1) b._2 - a._2
    else if (a._2 == b._2) b._1 - a._1
    else hypot(b._2 - a._2, b._1 - a._1)
  
  def sumSides(ls: List[(Double, Double)]): Double =
    (for { i <- 0 until ls.length
          if (i + 1 < ls.length)
            } yield abs(sideLength(ls(i), ls(i+1)))).sum
  
  println(sumSides(lvert))
  
}
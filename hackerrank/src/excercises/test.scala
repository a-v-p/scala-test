package excercises

/**
 * 
 * Input:
 * 
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 * 
 * HourGlass(plantilla)
 * a b c
 *   d
 * e f g
 * 
 * Ejemplo:
 * 
 * 1 1 1
 *   1
 * 1 1 1 
 * 
 * Es el primero del cuadro de 6x6,
 * los se obtienen moviendo la plantilla
 * 
 * su suma es = 7
 * 
 * hay 16 hourGlass en un cuadro de 6x6, hallar la suma del mayor
 * 
 */

object hourGlass extends App {

  import scala.io.StdIn._

  val ai = (for (n <- 0 until 6) yield readLine.split(" ")).toArray

  def hourGlass(a: Int, b: Int) = {
    val r1 = (for (i <- b until b + 3) yield ai.apply(a).apply(i).toInt).toList
    val r2 = List(0, ai.apply(a + 1).apply(b + 1).toInt, 0)
    val r3 = (for (i <- b until b + 3) yield ai.apply(a + 2).apply(i).toInt).toList

    r1 :: r2 :: r3 :: Nil
  }

  def sumHg(a: Int, b: Int) = (for {
    i <- hourGlass(a, b)
  } yield i.sum).sum

  val sumTotal = (for {
    r <- 0 to 3
    c <- 0 to 3
  } yield sumHg(r, c)).toList

  println(sumTotal.max)

}
package excercises

import scala.math._

object sides {
        
        
 val lpoint = List((1043.00, 770.00), (551.00, 990.00), (681.00, 463.00))
 val lvert = lpoint ::: lpoint.head :: Nil

  def sideLength(a: (Double, Double), b: (Double, Double)): Double =
    if (a._1 == b._1) b._2 - a._2
    else if (a._2 == b._2) b._1 - a._1
    else hypot(b._2 - a._2, b._1 - a._1)
  
 
lpoint.length

for {i <- 0 until lvert.length
     if (i + 1 < lvert.length)
     } yield abs(sideLength(lvert(i), lvert(i+1)))

sideLength((0.00, 2.00), (2.00, 3.00))

4 % 1 == 0

val x1 = 800
val v1 = 20
val x2 = 900
val v2 = 15

val x = 0 to 20 by 4

x1 to 100 by v1
x2 to 100 by v2

def check(x1: Int, x2: Int, v1: Int, v2: Int, jump: Int): String =
      if (v1 <= v2) "NO"
      else if (x1*jump > 10000 || x2*jump > 10000) "No" + x2
      else if (x1 == x2) "YES" + x1
      else check(x1 + v1, x2 + v2, v1, v2)

check(x1, x2, v1, v2)




}
package excercises

import scala.math._

object sides {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(147); 
        
        
 val lpoint = List((1043.00, 770.00), (551.00, 990.00), (681.00, 463.00));System.out.println("""lpoint  : List[(Double, Double)] = """ + $show(lpoint ));$skip(43); 
 val lvert = lpoint ::: lpoint.head :: Nil;System.out.println("""lvert  : List[(Double, Double)] = """ + $show(lvert ));$skip(184); 

  def sideLength(a: (Double, Double), b: (Double, Double)): Double =
    if (a._1 == b._1) b._2 - a._2
    else if (a._2 == b._2) b._1 - a._1
    else hypot(b._2 - a._2, b._1 - a._1);System.out.println("""sideLength: (a: (Double, Double), b: (Double, Double))Double""");$skip(19); val res$0 = 
  
 
lpoint.length;System.out.println("""res0: Int = """ + $show(res$0));$skip(114); val res$1 = 

for {i <- 0 until lvert.length
     if (i + 1 < lvert.length)
     } yield abs(sideLength(lvert(i), lvert(i+1)));System.out.println("""res1: scala.collection.immutable.IndexedSeq[Double] = """ + $show(res$1));$skip(40); val res$2 = 

sideLength((0.00, 2.00), (2.00, 3.00));System.out.println("""res2: Double = """ + $show(res$2));$skip(12); val res$3 = 

4 % 1 == 0;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(14); 

val x1 = 800;System.out.println("""x1  : Int = """ + $show(x1 ));$skip(12); 
val v1 = 20;System.out.println("""v1  : Int = """ + $show(v1 ));$skip(13); 
val x2 = 900;System.out.println("""x2  : Int = """ + $show(x2 ));$skip(12); 
val v2 = 15;System.out.println("""v2  : Int = """ + $show(v2 ));$skip(22); 

val x = 0 to 20 by 4;System.out.println("""x  : scala.collection.immutable.Range = """ + $show(x ));$skip(17); val res$4 = 

x1 to 100 by v1;System.out.println("""res4: scala.collection.immutable.Range = """ + $show(res$4));$skip(16); val res$5 = 
x2 to 100 by v2;System.out.println("""res5: scala.collection.immutable.Range = """ + $show(res$5));$skip(233); 

def check(x1: Int, x2: Int, v1: Int, v2: Int, jump: Int): String =
      if (v1 <= v2) "NO"
      else if (x1*jump > 10000 || x2*jump > 10000) "No" + x2
      else if (x1 == x2) "YES" + x1
      else check(x1 + v1, x2 + v2, v1, v2);System.out.println("""check: (x1: Int, x2: Int, v1: Int, v2: Int, jump: Int)String""");$skip(23); val res$6 = 

check(x1, x2, v1, v2);System.out.println("""res6: <error> = """ + $show(res$6))}




}

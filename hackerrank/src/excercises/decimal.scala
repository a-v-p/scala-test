package excercises

/**
 * Output Format
 * You must print the following  lines:
 * A decimal representing of the fraction of positive numbers in the array.
 * A decimal representing of the fraction of negative numbers in the array.
 * A decimal representing of the fraction of zeroes in the array.

Sample Input

6
-4 3 -9 0 4 1         

Sample Output

0.500000
0.333333
0.166667
 */

object decimal {
  
  def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var arr = new Array[Int](n);
        for(arr_i <- 0 to n-1) {
           arr(arr_i) = sc.nextInt();
        
    }
      val positives = for { i <- arr
                          if (i > 0) } yield i
      val negatives = for { i <- arr
                          if (i < 0) } yield i
      val zeroes = for { i <- arr
                          if (i == 0) } yield i                    
      val fracPos = (positives.length.toDouble / n.toDouble) 
      val fracNeg = (negatives.length.toDouble / n.toDouble)
      val fracZer = (zeroes.length.toDouble / n.toDouble)
        
    println(f"$fracPos%1.6f" + "\n" + f"$fracNeg%1.6f" + "\n" + f"$fracZer%1.6f")
  }
        
  
}
package excercises

/**
 * Dothraki are planning an attack to usurp King Robert's throne. King Robert 
 * learns of this conspiracy from Raven and plans to lock the single door through 
 * which the enemy can enter his kingdom.
 * But, to lock the door he needs a key that is an anagram of a certain palindrome string.
 * The king has a string composed of lowercase English letters. Help him figure out whether
 *  any anagram of the string can be a palindrome or not.
 *  
 *  Input Format 
 *  A single line which contains the input string.
 *  
 *  Constraints 
 *  Each character of the string is a lowercase English letter.
 *  
 *  Output Format 
 *  A single line which contains YES or NO in uppercase.
 *  
 *  Sample Input : 01
aaabbbb

Sample Output : 01
YES

Explanation 
A palindrome permutation of the given string is bbaaabb. 

Sample Input : 02
cdefghmnopqrstuvw

Sample Output : 02
NO

Explanation 
You can verify that the given string has no palindrome permutation. 

Sample Input : 03
cdcdcdcdeeeef

Sample Output : 03
YES

Explanation 
A palindrome permutation of the given string is ddcceefeeccdd.
 */

object palinSolution {
  
  import scala.io.StdIn._
  
  def main(args: Array[String]) {
    
    val s = readLine  
    val mapS = s.groupBy(x => x)
    
    val occurrences = (for (letter <- mapS)
      yield (letter._1, letter._2.length)).toList

    def oddCounter(occ: List[(Char, Int)], acc: Int): Int =
      if (occ.isEmpty) acc
      else if (occ.head._2 % 2 != 0) oddCounter(occ.tail, acc + 1)
      else oddCounter(occ.tail, acc)

    val oddCases = oddCounter(occurrences, 0)

    if ((s.length % 2 != 0) && (oddCases == 1)) println("YES")
    else if ((s.length % 2 == 0) && (oddCases == 0)) println("YES")
    else println("NO")
        
    }
  
}
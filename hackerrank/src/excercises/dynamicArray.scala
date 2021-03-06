package excercises

/**
 * Create a list, seqList, of N empty sequences, where each sequence is indexed from 0 to N - 1. The elements within each of 
 * the N sequences also use 0-indexing.
 * Create an integer, lastAns, and initialize it to 0.
 * The 2 types of queries that can be performed on your list of sequences (seqList) are described below:
 * 
 * Query: 1 x y 
 *  1.- Find the sequence, seq, at index ((x ⊕ lastAns) % N) in seqList.
 *  2.- Append integer y to sequence seq.
 *  
 * Query: 2 x y 
 *  1.- Find the sequence, seq, at index ((x ⊕ lastAns) % N) in seqList.
 *  2.- Find the value of element (y % size) in seq (where size is the size of seq) and assign it to lastAns.
 *  3.- Print the new value of lastAns on a new line
 *  
 *  Task 
 *  Given N, Q, and Q queries, execute each query.
 *  
 *  Note: ⊕ is the bitwise XOR operation, which corresponds to the ^ operator in most languages. 
 *  Learn more about it on Wikipedia.

Input Format

The first line contains two space-separated integers, N (the number of sequences) and Q (the number of queries), respectively. 
Each of the Q subsequent lines contains a query in the format defined above.

Constraints

1 ≤ N,Q ≤ 10^5
0 ≤ x ≤ 10^9
0 ≤ y ≤ 10^9
It is guaranteed that query type 2 will never query an empty sequence or index.

Output Format

For each type 2 query, print the updated value of lastAns on a new line.

Sample Input
2 5
1 0 5
1 1 7
1 0 3
2 1 0
2 1 1

Sample Output
7
3

Explanation

Initial Values: 
 
N = 2
LastAns = 0 
S0 = {}
S1 = {} 

Query 0: Append 5 to sequence ((0 ^ 0) % 2) = 0. 
lastAns = 0
S0 = {5}
S1 = {} 
 
Query 1: Append 7 to sequence ((1 ^ 0) % 2) = 1. 
S0 = {5}
S1 = {7} 

Query 2: Append 3 to sequence ((0 ^ 0) % 2) = 0. 
lastAns = 0
S0 = {5,3}
S1 = {7}  

Query 3: Assign the value at index 0 of sequence ((1 ^ 0) % 2) = 1 to lastAns, print lastAns.
S0 = {5,3}
S1 = {7}  
lastAns = 7

Output: 7

Query 4: Assign the value at index 1 of sequence ((1 ^ 7) % 2) = 0 to lastAns, print lastAns.  
S0 = {5,3}
S1 = {7}  
lastAns = 3

Output = 3

 */


import scala.io.StdIn._

object dynamicArray extends App {
  
  val x = readLine.split(" ")
  val n = x(0).toInt
  val q = x(1).toInt
  val listQ = (for (n <- 1 to q) yield readLine.split(" ").map(_.toInt)).toVector
  
  var seqList: Vector[Vector[Int]] = (for (i <- 0 until n) yield Vector()).toVector
  var lastans = 0
  
  def query1(ls: Vector[Vector[Int]], x: Int, y: Int) =
    seqList = seqList.updated(x, seqList(x) ++ Vector(y))               
    
  def query2(ls: Vector[Vector[Int]], x: Int, y: Int) = {
    if (seqList(x).isEmpty) lastans = 0
    else lastans = seqList(x)(y)
    println(lastans) 
  }  
  
  def dynArray(lq: Array[Int]): Unit = {
    if (lq(0) == 1) query1(seqList, ((lq(1) ^ lastans) % n), lq(2))
      else query2(seqList, ((lq(1) ^ lastans) % n), lq(2) % seqList((lq(1) ^ lastans) % n).length)   
    }
  
  for (i <- listQ) dynArray(i)
  
}
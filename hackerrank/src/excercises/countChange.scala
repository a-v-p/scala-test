package excercises

/**
 * Write a recursive function that counts how many different ways you can make
 * change for an amount, given a SORTED list of coin denominations. For example, there are
 * 3 ways to give change for 4 if you have coins with denomination 1 and 2: 1+1+1+1, 1+1+2, 2+2.
 */

object countChange {

  // Find the number of ways you can make change for an amount, given a list of coin denominations.
  def countChange(money: Int, coins: List[Int]): Int = {
    if (coins.isEmpty && money == 0) 1
    else if (money == 0) 1
    else if (coins.isEmpty || coins.head > money) 0
    else countChange(money - coins.head, coins) + countChange(money, coins.tail)
  }
  
  // Find the different combinations you can make change for an amount, given a list of coin denominations.
  def countChange2(money: Int, coins: List[Int], acc: List[Int]): List[List[Int]] = {
    if (coins.isEmpty && money == 0) List()
    else if (money == 0) acc :: Nil
    else if (coins.isEmpty || coins.head > money) List()
    else countChange2(money - coins.head, coins, acc ::: coins.head :: Nil) ::: countChange2(money, coins.tail, acc)

  }

  // countChange2(4, List(1,2), List()) = List[List[Int]] = List(List(1, 1, 1, 1), List(1, 1, 2), List(2, 2))
  
}
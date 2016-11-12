package excercises

class guessTheNumber {

  val random = scala.util.Random
  val maxNum = 100
  protected val theNumber = random.nextInt(maxNum)

  def play(): Unit = {
    var move = 0
    do {
      move = io.StdIn.readInt
      if (move > theNumber) println("Your number is too big")
      else if (move < theNumber) println("Your number is too small")
      else println("YOU GOT IT BRO!!")

    } while (move != theNumber)
  }
}

object game {

  def main(args: Array[String]) {
    val guessGame = new guessTheNumber
   
    println("Welcome to my game. Try and guess my impossible number." + "\n" + 
        "It's between 0 and " + guessGame.maxNum + " inclusive. Just type a number to get started.")
    
    guessGame.play()
  }

}
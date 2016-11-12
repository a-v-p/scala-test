package excercises

/**
 * Sample Input:
Heraldo Memelli 8135627
2
100 80

Sample Output:
 Name: Memelli, Heraldo
 ID: 8135627
 Grade: O
 
 */


class Person(fn: String, ln: String, id: Int) {
  protected val firstName = fn
  protected val lastName = ln
  protected val idNumber = id
  
  def printPerson() {
    println("Name: " + lastName + ", " + firstName + "\n" + "ID: " + idNumber)
  }
  
}

class Student(firstName: String, lastName: String, idNumber: Int, scores: Array[Int]) 
  extends Person(firstName, lastName, idNumber) {
  
  val testScores = scores
  
  def calculate(): Char = {
    val average = testScores.toList.sum / testScores.length
  
      if (average >= 90) 'O'
        else if (average >= 80 && average < 90) 'E'
            else if (average >= 70 && average < 80) 'A'
              else if (average >= 55 && average < 70) 'P'
                else if (average >= 40 && average < 55) 'D'
                  else 'T'
 
  }
   
}

object solution {
  
  import scala.io.StdIn._
  
  def main(args: Array[String]) {
    
    val s = readLine.split(" ")
    val slength = readInt
    val score = readLine.split(" ").map(_.toInt)
    
    val student = new Student(s(0), s(1), s(2).toInt, score)
    student.printPerson()
    println("Grade: " + student.calculate())
    
  }
}
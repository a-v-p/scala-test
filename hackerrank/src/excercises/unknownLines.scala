package excercises

object test3 extends App {
  
  import scala.io.StdIn._
 
   val entries = readInt
   val bookData = (for (n <- 1 to entries) yield readLine.split(" ").toList).toList
   val bookMap = (for (b <- bookData) yield (b(0) -> b(1))).toMap
   
   var line = readLine
   
   // Lee las siguientes líneas de entrada hasta encontrarse el null e imprime
   // FUNCIONA EN HACKER RANK PERO NO EN ESTA CONSOLA
   while (line != null) {
       if (bookMap.contains(line)) println(line + "=" + bookMap(line))
         else println("Not found")
           line = readLine
         }    
     
  
}
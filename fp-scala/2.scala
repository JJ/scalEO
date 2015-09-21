/* Implementa función en el segundo capítulo de FP-Scala */

object HOP {

  def abs(n: Int): Int =
    if (n < 0) -n
    else n
  
  def formatResult(name:String, x:Int, f: Int => Int) = {
    var msg= "El %s de %d es %d."
    msg.format(name, x, f(x))
  }

  def factorial(n: Int): Int = {
    def go( n: Int, acc: Int): Int = 
      if (n <= 0) acc
      else go( n-1, n*acc )

    go( n, 1 )
  }

  def main(args: Array[String]): Unit =
    println(formatResult("Valor absoluto",-42, abs)) // este no sale
    println(formatResult("Factorial", 8, factorial ))
}

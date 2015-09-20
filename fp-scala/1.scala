/* Implementa función en el segundo capítulo de FP-Scala */

object ValorAbsoluto {

  def abs(n: Int): Int =
    if (n < 0) -n
    else n
  
  private def formatAbs(x:Int) = {
    var msg= "El valor absoluto de %d es %d."
    msg.format(x, abs(x))
  }

  private def formatFact(x:Int) = {
    var msg= "El factorial de %d es %d."
    msg.format(x, factorial(x))
  }

  def factorial(n: Int): Int = {
    def go( n: Int, acc: Int): Int = 
      if (n <= 0) acc
      else go( n-1, n*acc )

    go( n, 1 )
  }

  def main(args: Array[String]): Unit =
    println(formatAbs(-42)) // este no sale
    println(formatFact( 8 ))
}

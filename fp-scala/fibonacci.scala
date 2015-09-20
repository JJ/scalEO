/* Implementa ejercicio en el segundo capítulo de FP-Scala */

object Fibonacci {

  private def formatFib(x:Int) = {
    var msg= "El número de Fibonacci de %d es %d."
    msg.format(x, fibonacci(x))
  }

  def fibonacci(n: Int): Int = {
    if ( n == 0 ) 0
    else if ( n == 1 ) 1
    else fibonacci( n-1 ) + fibonacci( n-2 )

  }

  def main(args: Array[String]): Unit =
    println(formatFib(22)) 
}

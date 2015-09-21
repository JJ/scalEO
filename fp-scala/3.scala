/* Implementa función en el segundo capítulo de FP-Scala */

object AbsPoly {

  def abs[A](n: A): Int =
    if (n < 0) -n
    else n
  
  def formatResult[A](name:String, x:A, f: Int => Int) = {
    var msg= "El %s de %d es %d."
    msg.format(name, x, f(x))
  }

  def main(args: Array[String]): Unit =
    println(formatResult("Valor absoluto",-42.5, abs)) // este no sale

}

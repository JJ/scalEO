/* Implementa función en el segundo capítulo de FP-Scala */

object ValorAbsoluto {

  def abs(n: Int): Int =
    if (n < 0) -n
    else n
  
  private def formatAbs(x:Int) = {
    var msg= "El valor absoluto de %d es %d."
    msg.format(x, abs(x))
  }
  
  def main(args: Array[String]): Unit =
    println(formatAbs(-42))
}

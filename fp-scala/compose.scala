object Compose {

 def compose[A,B,C](f: B => C, g: A => B): A => C =
   (a:A) => f(g(a))
  
  def main(args: Array[String]): Unit = {
    def sqrt( a: Float ) = a * a
    def half( a: Float ) = a/2
    var sqrthalf = compose(sqrt,half)

    println("Cuadrado + mitad de %d es %d.".format(10,sqrthalf(10)))
  } 

}

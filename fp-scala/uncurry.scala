object UnCurry {

  def curry[A,B,C](f: (A, B) => C): A => (B => C) = 
    (a: A ) => ( b: B ) => f(a,b)

  def uncurry[A,B,C](f: A => B => C): (A, B) => C =
     (a: A, b: B ) => f(a)(b)

  def main(args: Array[String]): Unit = {
    def multiplica( a: Float, b: Float) = a * b
    var multiplicaCurry = curry( multiplica )
    var multiplica10 = multiplicaCurry(10)
    "El resultado de multiplicar %d por 10 es %d.".format(10,multiplica10(10))
    var multiplicau = uncurry( multiplicaCurry)
  } 

}

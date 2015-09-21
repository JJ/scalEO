object Sorting {

  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    def loop( n: Int, sorted: Boolean ): Boolean =
      if ( n < as.length -1 ) {
	val nowSorted: Boolean = sorted && ordered( as(n), as(n+1))
	loop( n+1, nowSorted)
      } else sorted
  
    loop( 0, true )
  }

  def main(args: Array[String]): Unit = {
    var alfabetico = ( a: String, b: String ) => a < b
    isSorted( Array( "a","c","b" ), alfabetico)
  } 

}

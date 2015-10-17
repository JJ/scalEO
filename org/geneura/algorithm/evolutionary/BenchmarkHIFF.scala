import org.geneura.algorithm.evolutionary.HIFF._

object BenchmarkHIFF extends App{
  def t_or_f( i: Int ): Boolean = if ( scala.util.Random.nextDouble > 0.5 ) true else false
  val pop: Vector[Vector[Boolean]] = Vector.fill(100000)(Vector.fill(256)( t_or_f(0) ))

  val result: Vector[Double]  = pop.map( HIFF )
}


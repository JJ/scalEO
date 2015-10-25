import org.geneura.algorithm.evolutionary.HIFF._

object BenchmarkHIFF extends App{
  val vectors = if (args.length > 0 ) args(0).toInt else 100000
  val len = if (args.length > 1 ) args(1).toInt else 256
  def t_or_f( i: Int ): Boolean = if ( scala.util.Random.nextDouble > 0.5 ) true else false
  val pop: Vector[Vector[Boolean]] = Vector.fill(vectors)(Vector.fill(len)( t_or_f(0) ))

  val result: Vector[Double]  = pop.map( HIFF )
}


import org.geneura.algorithm.evolutionary.Mutate._
import org.geneura.algorithm.evolutionary.BinaryChromosome._
import org.geneura.algorithm.evolutionary.MaxOnes._

object onemax extends App{
  val iterations = 100000
  val top_length = 65536
  var len = 16
   do {
     val initialTime = System.nanoTime()
     var i = 0
     for ( i <- 1 until iterations ) {
       val indi = Vector.fill( len )( if (scala.util.Random.nextDouble > 0.5 ) true else false)
       val fitness = MaxOnes( indi )
     }
     val finalTime = System.nanoTime()
     println( "Scala-BitVector, "+len+", "+(finalTime - initialTime)/1e9 )
     len = len * 2
   } while ( len <= top_length )
     
}


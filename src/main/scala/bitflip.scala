import org.geneura.algorithm.evolutionary.Mutate._
import org.geneura.algorithm.evolutionary.BinaryChromosome._
import org.geneura.algorithm.evolutionary.MaxOnes._

object bitflip extends App{
  val iterations = 100000
  val top_length = 32768
  var len = 16
   do {
     val indi:String = scala.util.Random.alphanumeric.take(len).map((a: Char) => if (a > 'M' ) "1" else "0").mkString
     val initialTime = System.nanoTime()
     var i = 0
     for ( i <- 1 until iterations ) {
       val newIndi = Mutate( indi )
     }
     val finalTime = System.nanoTime()
     println( "Scala-BitString, "+len+", "+(finalTime - initialTime)/1e9 )
     len = len * 2
   } while ( len <= top_length )
  
  len = 16
  do {
    val indi =   Vector.fill( len )( if (scala.util.Random.nextDouble > 0.5 ) true else false)
    val initialTime = System.nanoTime()
    var i = 0
    for ( i <- 1 until iterations ) {
      val newIndi = Mutate( indi )
    }
    val finalTime = System.nanoTime()
    println( "Scala-BitVector, "+len+", "+(finalTime - initialTime)/1e9 )
    len = len * 2
  } while ( len <= top_length )
   
}


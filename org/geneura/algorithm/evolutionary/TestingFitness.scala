import org.geneura.algorithm.evolutionary.MaxOnes._
import org.geneura.algorithm.evolutionary.RoyalRoad._
import org.geneura.algorithm.evolutionary.HIFF._
import org.geneura.algorithm.evolutionary.BinaryChromosome._
import org.geneura.algorithm.evolutionary.Ops._

object TestingFitness extends App{
  val v1 =  Vector(true,false,true,true) 
  val v2 = Vector(true,false,true,true,false,true,true,false,true,true,false,true,true) 
  val v3 = Vector(true,true,true,true,false,true,true,false,true,true,false,true) 
  println( MaxOnes( v1 ) )
  println( MaxOnes( v2 ) )
  println( MaxOnes( v3 ) )
  println( RoyalRoad( v3 ) )
  println( HIFF(v3) )
  println( HIFF(v1) )
  val v4 = Vector(true,true,true,true,false,true,true,false,true,true,false,true,false,false,false,true)
  println( HIFF(v4))
  val v5 = Vector(true,true,false,false)
  println( HIFF(v5))
  val eo = new BinaryChromosome( v4, HIFF(v4))
  println( eo )
  val eo2 = new BinaryChromosome( v5, HIFF )
  println( eo2 )
  val eo3 = new BinaryChromosome( 32, MaxOnes )
  println( eo3 )
  val v6 = BinaryMutate( v4 )
  val eo5 = new BinaryChromosome( v6, HIFF )
  val v7 = Vector.fill( 16 )( if (scala.util.Random.nextDouble > 0.5 ) true else false)
  val v8 = Vector.fill( 16 )( if (scala.util.Random.nextDouble > 0.5 ) true else false)

  val (v9,v10) = CrossOver(v7,v8)
  println( "CrossOver" + v7 )
  println( v8 )
}


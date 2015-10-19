import org.geneura.algorithm.evolutionary.MaxOnes._
import org.geneura.algorithm.evolutionary.RoyalRoad._
import org.geneura.algorithm.evolutionary.HIFF._
import org.geneura.algorithm.evolutionary.BinaryChromosome._
import org.geneura.algorithm.evolutionary.BinaryChromosome._

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
}


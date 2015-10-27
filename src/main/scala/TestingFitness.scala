import org.geneura.algorithm.evolutionary.MaxOnes._
import org.geneura.algorithm.evolutionary.RoyalRoad._
import org.geneura.algorithm.evolutionary.HIFF._
import org.geneura.algorithm.evolutionary.BinaryChromosome._
import org.geneura.algorithm.evolutionary.Mutate._
import org.geneura.algorithm.evolutionary.CrossOver._

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
  val v6 = Mutate( v4 )
  val eo5 = new BinaryChromosome( v6.asInstanceOf[Vector[Boolean]], HIFF )
  val v7 = Vector.fill( 16 )( if (scala.util.Random.nextDouble > 0.5 ) true else false)
  val v8 = Vector.fill( 16 )( if (scala.util.Random.nextDouble > 0.5 ) true else false)

  val (v9,v10) = CrossOver(v7,v8)
  println( "Crossover" + v7 )
  println( v8 )
  val v11 = "101010101010101010"
  val v12 = Mutate(v11)
  println( v12)
  val v13 = Mutate(v12)
  val (v15, v14 ) = CrossOver( v11, v13)
  println( "Crossover ", v15, " - ", v14 )
}


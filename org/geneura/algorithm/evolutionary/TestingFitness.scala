import org.geneura.algorithm.evolutionary.MaxOnes._
import org.geneura.algorithm.evolutionary.RoyalRoad._

object TestingFitness extends App{
  val v1 =  Vector(true,false,true,true) 
  val v2 = Vector(true,false,true,true,false,true,true,false,true,true,false,true,true) 
  val v3 = Vector(true,true,true,true,false,true,true,false,true,true,false,true) 
  println( MaxOnes( v1 ) )
  println( MaxOnes( v2 ) )
  println( MaxOnes( v3 ) )
  println( RoyalRoad( v3 ) )
}


import org.geneura.algorithm.evolutionary.MaxOnes._

object MaxOnesF extends App{
  println( MaxOnes( Vector(true,false,true,true)  ) )
  println( MaxOnes( Vector(true,false,true,true,false,true,true,false,true,true,false,true,true)  ) )
}


package org.geneura.algorithm.evolutionary.Mutate

object Mutate {
  def apply( eo : IndexedSeq[Boolean] ): IndexedSeq[Boolean] = {
  val point = (eo.length * scala.util.Random.nextDouble).toInt
  eo.take( point ) ++ eo.slice( point,point+1 ).map(!_) ++ eo.drop( point +1 )
}

  def apply( eo : String ): String = {
    val point = (eo.length * scala.util.Random.nextDouble).toInt
    eo.take( point ) ++ eo.slice( point,point+1 ).map( (a:Char) => if ( a == '0' ) '1' else '0') ++ eo.drop( point +1 )
  }
}



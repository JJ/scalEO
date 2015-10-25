package org.geneura.algorithm.evolutionary.Ops1

def Mutate( eo : IndexedSeq[Boolean] ): IndexedSeq[Boolean] = {
  val point = (eo.length * scala.util.Random.nextDouble).toInt
  eo.take( point ) ++ eo.slice( point,point+1 ).map(!_) ++ eo.drop( point +1 )
}

def Mutate( eo : String ): String = {
  val point = (eo.length * scala.util.Random.nextDouble).toInt
  eo.take( point ) ++ eo.slice( point,point+1 ).map( (a:Char) => if ( a == '0' ) '1' else '0') ++ eo.drop( point +1 )
}



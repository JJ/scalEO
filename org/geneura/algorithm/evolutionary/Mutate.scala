package org.geneura.algorithm.evolutionary.Mutate

trait MutateLike[+T,-Y] {
  def apply[U >: T, Y](eo: U): Y

}

case object Mutate extends MutateLike[IndexedSeq[Boolean],IndexedSeq[Boolean]]{
  def apply[U >: IndexedSeq[Boolean],IndexedSeq[Boolean]]( eo : U ): IndexedSeq[Boolean] = {
    val point = (eo.length * scala.util.Random.nextDouble).toInt
    eo.take( point - 1 ) ++ eo.slice( point-1,point ).map(!_) ++ eo.drop( point )
  }  
}


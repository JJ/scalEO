package org.geneura.algorithm.evolutionary.Ops

trait Op1[A] {
  def apply( eo : IndexedSeq[A] ): IndexedSeq[A]
}

trait Op2[A] {
  def apply( oneEO : IndexedSeq[A], anotherEO : IndexedSeq[A] ): (IndexedSeq[A], IndexedSeq[A])
}


object Ops {

  def BinaryMutate( eo : IndexedSeq[Boolean]  ) : IndexedSeq[Boolean]  = {
    val point = (eo.length * scala.util.Random.nextDouble).toInt
    eo.take( point - 1 ) ++ eo.slice( point-1,point ).map(!_) ++ eo.drop( point )
  }  
  
  def CrossOver [A](  oneEO : IndexedSeq[A], anotherEO : IndexedSeq[A]  ): (IndexedSeq[A],IndexedSeq[A]) = {
    var point1 = (oneEO.length * scala.util.Random.nextDouble).toInt
    var point2 = (oneEO.length * scala.util.Random.nextDouble).toInt
    if (point1 > point2) {
      val temp = point1
      point1 = point2
      point2 = temp
    }
    ( oneEO.take( point1 ) ++ anotherEO.slice(point1,point2) ++ oneEO.drop( point2), anotherEO.take( point1 ) ++ oneEO.slice(point1,point2) ++ anotherEO.drop( point2 ) ) 
  }
}

package org.geneura.algorithm.evolutionary.Ops

trait Op1[A] {
  def apply( eo : IndexedSeq[A] ): IndexedSeq[A]
}

trait Op2[A] {
  def apply( oneEO : IndexedSeq[A], anotherEO : IndexedSeq[A] ): (IndexedSeq[A], IndexedSeq[A])
}


object BinaryMutate extends Op1[Boolean] {
  def apply( eo : IndexedSeq[Boolean] ) : IndexedSeq[Boolean] = {
    val point = (eo.length * scala.util.Random.nextDouble).toInt
    eo.take( point - 1 ) ++ IndexedSeq( !eo(point-1) ) ++ eo.drop( point )
  }
}


object CrossOver extends Op2[Boolean] {
  def apply(  oneEO : IndexedSeq[Boolean], anotherEO : IndexedSeq[Boolean]  ): (IndexedSeq[Boolean],IndexedSeq[Boolean]) = {
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

package org.geneura.algorithm.evolutionary.CrossOver

import scala.collection.IndexedSeqLike

object CrossOver {

  def apply[A](  oneEO : IndexedSeqLike[A,IndexedSeq[A]], anotherEO : IndexedSeqLike[A,IndexedSeq[A]]  ): (IndexedSeqLike[A,IndexedSeq[A]],IndexedSeqLike[A,IndexedSeq[A]]) = {
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

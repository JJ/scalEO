package org.geneura.algorithm.evolutionary.Ops

trait Op1[A] {
  def apply( eo: A ): A
}

object BinaryMutate extends Op1[Vector[Boolean]] {
  def apply( eo: Vector[Boolean] ) : Vector[Boolean] = {
    val point = (eo.length * scala.util.Random.nextDouble).toInt
    eo.take( point - 1 ) ++ Vector( !eo(point-1) ) ++ eo.drop( point )
  }
}

trait Op2[A] {
  def apply( oneEO: A, anotherEO:A  ): (A,A)
}

object CrossOver extends Op2[Vector[Boolean]] {
  def apply(  oneEO: Vector[Boolean], anotherEO:Vector[Boolean]  ): (Vector[Boolean],Vector[Boolean]) = {
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

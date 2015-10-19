package org.geneura.algorithm.evolutionary.Ops

trait Mutate[A] {
  def apply( eo: A ): A
}

object BinaryMutate extends Mutate[Vector[Boolean]] {
  def apply( eo: Vector[Boolean] ) : Vector[Boolean] = {
    val point = (eo.length * scala.util.Random.nextDouble).toInt
    eo.take( point - 1 ) ++ Vector( !eo(point-1) ) ++ eo.drop( point )
  }
}

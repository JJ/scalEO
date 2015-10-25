package org.geneura.algorithm.evolutionary.RoyalRoad

import org.geneura.algorithm.evolutionary.Fitness._

object RoyalRoad extends Function1[Vector[Boolean],Double] with Fitness[Vector[Boolean],Double] {

  def chunk( ev: Vector[Boolean] ): Vector[Vector[Boolean]] = {
    val head = ev.take(4)
    val tail = ev.drop(4)
    if ( tail.length > 0 ) {
      Vector(head) ++ chunk( tail )
    } else Vector( head )
  }

  def royal( ev:Vector[Boolean] ): Boolean = {
    val count = ev.count( _ == true )
    if ( count == 4 || count == 0 ) true else false
  }

  def Fitness( ev: Vector[Boolean]):Double = {
    val chunked = chunk(ev)
    chunked.count( royal(_) )
  }
    
  def apply(v1: Vector[Boolean]): Double = Fitness( v1 )

}


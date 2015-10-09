package org.geneura.algorithm.evolutionary.MaxOnes

import org.geneura.algorithm.evolutionary.Fitness._

object MaxOnes extends Function1[Vector[Boolean],Double] with Fitness[Vector[Boolean],Double] {

  def Fitness( ev: Vector[Boolean]):Double = 
    ev.foldRight(0.0)((a:Boolean,b:Double) => if (a == true) b+1 else b )

  def apply(v1: Vector[Boolean]): Double = Fitness( v1 )

}


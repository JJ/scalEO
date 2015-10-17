package org.geneura.algorithm.evolutionary.HIFF

import org.geneura.algorithm.evolutionary.Fitness._

object HIFF extends Function1[Vector[Boolean],Double] with Fitness[Vector[Boolean],Double] {

  def t( a: Char, b: Char ): Char = (a,b) match {
    case ('0','0') => '0'
    case ('1','1') => '1'
    case (_,_) => '-'
  }

  def T( ev: Vector[Char] ): Char =  {
    if (ev.length == 1 )
      ev.head
    else
      t(T(ev.take(ev.length/2)),T(ev.drop(ev.length/2)))
  }

  def f( a: Char ): Double = a match {
    case '0' => 1
    case '1' => 1
    case _ => 0
  }

  def charFitness( ev: Vector[Char]):Double = 
    if ( ev.length > 1 ) {
      ev.length * f(T(ev)) + charFitness(ev.take(ev.length/2)) + charFitness(ev.drop(ev.length/2))
    } else 0

  def Fitness( ev: Vector[Boolean]):Double = {
    val char_ev = ev.map(  (a: Boolean) => if (a == true) '1' else '0' ) 
    charFitness(char_ev)
  }
    
  def apply(v1: Vector[Boolean]): Double = Fitness( v1 )

}


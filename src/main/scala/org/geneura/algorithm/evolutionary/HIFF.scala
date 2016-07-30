package org.geneura.algorithm.evolutionary.HIFF

import org.geneura.algorithm.evolutionary.Fitness._

/** This function is Hierarchical If and only If.
 *
 * A "difficult" deceptive function for evolutionary algorithms
 *
 */

object HIFF extends Function1[Vector[Boolean],Double] with Fitness[Vector[Boolean],Double] {

  def t( a: Char, b: Char ): Char = (a,b) match {
    case ('0','0') => '0'
    case ('1','1') => '1'
    case (_,_) => '-'
  }

  def T( ev: String ): Char = ev match {
    case "-"|"0"|"1" => ev.head
    case "00" => '0'
    case "11" => '1'
    case "01"|"10"|"1-"|"--"|"-1"|"0-"|"-0" => '-'
    case _ => t(T(ev.take(ev.length/2)),T(ev.drop(ev.length/2)))
  }

  def f( a: Char ): Double = a match {
    case '0'|'1' => 1
    case _ => 0
  }

  /** this version works with character strings */
  def charFitness( ev: String):Double = ev match {
    case "0"|"1" => 1
    case "00"|"11" => 4
    case "01"|"10" => 2
    case _ =>
      ev.length * f(T(ev)) + charFitness(ev.take(ev.length/2)) + charFitness(ev.drop(ev.length/2))
  }

  /** this version works with boolean vectors */
  def Fitness( ev: Vector[Boolean]):Double = {
    val char_ev = ev.mkString.replace("true","1").replace("false","0")
    charFitness(char_ev)
  }
    
  def apply(v1: Vector[Boolean]): Double = Fitness( v1 )

  def apply(v1: String): Double = charFitness( v1 )

}


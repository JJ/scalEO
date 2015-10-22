package org.geneura.algorithm.evolutionary.BinaryChromosome

import org.geneura.algorithm.evolutionary.EO._

// A classic BinaryChromosome with fitness
// fitness can be ser after birth
case class BinaryChromosome(val data: Vector[Boolean],
			    var fValue: Double) extends EO[Vector[Boolean],Double] {
  def dataObject: Vector[Boolean] = data
  def fitness: Double = fValue
  
  // Alternate constructor with fitness function
  def this( data: Vector[Boolean],  f: Vector[Boolean] => Double ) {
    this( data, f( data ))
  }
  
  // Random ctor
  def this( len: Int,  f: Vector[Boolean] => Double ) {
    this( Vector.fill( len )( if (scala.util.Random.nextDouble > 0.5 ) true else false), f )
  }

  // Convert to String for printing
  override def toString: String = data.toString() + ": " + fitness
}

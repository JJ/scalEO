package org.geneura.algorithm.evolutionary.BinaryChromosome

import org.geneura.algorithm.evolutionary.EO._

// A classic BinaryChromosome with fitness
// fitness can be ser after birth
class BinaryChromosome( val data: Vector[Boolean],
  var fValue: Double) extends EO[Vector[Boolean],Double] {
  def dataObject: Vector[Boolean] = data
  def fitness: Double = fValue

  // Alternate constructor with fitness function
  def this( data: Vector[Boolean],  f: Vector[Boolean] => Double ) {
    this( data, f( data ))
  }

  // Convert to String for printing
  override def toString: String = data.toString() + ": " + fitness
}

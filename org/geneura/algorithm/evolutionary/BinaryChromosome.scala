package org.geneura.algorithm.evolutionary.BinaryChromosome

import org.geneura.algorithm.evolutionary.EO._

class BinaryChromosome( val data: Vector[Boolean],
  val f: Double) extends EO[Vector[Boolean],Double] {
  def dataObject: Vector[Boolean] = data
  def fitness: Double = f

}

package org.geneura.algorithm.evolutionary.EO

trait EO[+A,+B] {
  def fitness:B
  def dataObject:A
}

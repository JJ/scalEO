package org.geneura.algorithm.evolutionary.Fitness

trait Fitness[A,B] {
  def Fitness( ev: A):B
}


package org.geneura.algorithm.evolutionary.Fitness

//Fitness acting on A objects and returning B
trait Fitness[-A,+B] {
  def Fitness( ev: A):B
}


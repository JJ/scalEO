// by aroc725 in https://forums.manning.com/posts/list/31212.page

import fpinscala.datastructures.Leaf
import fpinscala.datastructures.Branch
import fpinscala.datastructures.Tree
import fpinscala.datastructures

object TreeApp extends App {
  val example = Branch( Branch( Branch( Leaf(1), Leaf(2)), Leaf(3)), Leaf(4))

  println( "Exercise 3.25 " + Tree.size( example ) )

}

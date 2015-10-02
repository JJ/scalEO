// by aroc725 in https://forums.manning.com/posts/list/31212.page

import fpinscala.errorhandling
import fpinscala.errorhandling.Option

object ErrorApp extends App {

  println( "Exercise 4.1 " + Option.failingFn2.map( 3 ) )

}

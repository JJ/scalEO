object HateYouApp extends App{
  def HateYou( who: String) = "I" :: ( "Hate" :: ( who:: Nil ))
  println( HateYou( args(0) )  )
}


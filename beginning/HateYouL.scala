object HateYouL {
  def HateYou( who: String) = "I" :: ( "Hate" :: ( who:: Nil ))

  def main(args: Array[String]) {
    println( HateYou( args(0) )  )
  }
}


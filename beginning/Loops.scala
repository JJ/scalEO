object Loops {
  def main(args: Array[String]) {
    for { i <- 1 to 3; j <- 1 to 3 }
      println( i * j )
  }
}


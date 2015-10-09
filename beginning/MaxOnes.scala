object MaxOnes extends App{
  def MaxOnes( ev: Vector[Boolean]) = ev.foldRight(0.0)((a:Boolean,b:Double) => if (a == true) b+1 else b )
  println( MaxOnes( Vector(true,false,true,true)  ) )
  println( MaxOnes( Vector(true,false,true,true,false,true,true,false,true,true,false,true,true)  ) )
}


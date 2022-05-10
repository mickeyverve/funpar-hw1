object Aloud extends App {
  // TODO: Implement me
  def readAloud(xs: List[Int]): List[Int] = xs match {
   case Nil => Nil
    case h :: t => xs.takeWhile(_ == h).size :: h :: readAloud(t.dropWhile(_ == h))
  }
  println(readAloud(List(3,3,8,-10,-10,-10)))
}

object TurnIt extends App {
  def transpose(A: List[List[Int]]): List[List[Int]] =
    A.flatMap(_.headOption) match {
      case Nil => Nil
      case head => head :: transpose(A.map(_.drop(1)))
    }

  println(transpose(List(List(1, 2, 3), List(4, 5,9), List(6, 7, 8),List(11, 12, 13))))
}

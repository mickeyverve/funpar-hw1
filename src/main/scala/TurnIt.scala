object TurnIt extends App {
//  def transpose(A: List[List[Int]]): List[List[Int]] = ???
//
//  val list1: List[String] = List("a", "1", "w")
//
//  val list2: List[String] = List("b", "2", "x")
//
//  val list3: List[String] = List("c", "3", "y")
//
//  val list4: List[String] = List("d", "4", "z")
//
//  def customZip[T](list: List[T]*): List[List[T]] = {
//    def stripOneLevel(list: Seq[List[T]]): (Seq[List[T]], List[T]) = {
//      list.foldRight(Seq(): Seq[List[T]], List(): List[T]) { (e, acc) =>
//        if (e.size == 1) (acc._1, e.head +: acc._2)
//        else (e.tail +: acc._1, e.head +: acc._2)
//      }
//    }
//
//    def strip(list: Seq[List[T]], acc: List[List[T]]): List[List[T]] = {
//      list match {
//        case Nil => acc
//        case x +: xs =>
//          val stripped = stripOneLevel(list)
//          strip(stripped._1, stripped._2 +: acc)
//      }
//    }
//
//    strip(list, List()).reverse
//  }
  def transpose(A: List[List[Int]]): List[List[Int]] =
    A.flatMap(_.headOption) match {
      case Nil => Nil
      case head => head :: transpose(A.map(_.drop(1)))
    }

  println(transpose(List(List(1, 2, 3), List(4, 5,9), List(6, 7, 8))))


}

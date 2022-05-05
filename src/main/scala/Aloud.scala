object Aloud extends App {
  // TODO: Implement me
  def readAloud(xs: List[Int]): List[Int] = xs match {
   case Nil => Nil
    case h :: t => xs.takeWhile(_ == h).size :: h :: readAloud(t.dropWhile(_ == h))
  }
  println(readAloud(List(3,3,8,-10,-10,-10)))
}

//
//object Loud {
//  def readAloud(xs: List[Int]): List[Int] = {
//    final case class State(
//                            currentElem: Int,
//                            currentCount: Int,
//                            acc: List[Int]
//                          ) {
//      def nextState(nextElem: Int): State =
//        if (nextElem == currentElem)
//          copy(
//            currentCount = currentCount + 1
//          )
//        else
//          State(
//            currentElem = nextElem,
//            currentCount = 1,
//              acc(currentCount, currentElem) :: acc
//          )
//
//      def result: List[Int] =
//        (currentCount, currentElem) :: acc).re
//    }
//
//    xs match {
//      case head :: tail =>
//        val initialState =
//          State(
//            currentElem = head,
//            currentCount = 1,
//              acc = List.empty
//          )
//
//        tail.foldLeft(initialState) {
//          case (acc, nextElem) =>
//            acc.nextState(nextElem)
//        }.result
//
//      case Nil =>
//        List.empty
//    }
//  }
//  println(readAloud(List(3,3,8,-10,-10,-10)))
//}
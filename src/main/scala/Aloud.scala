////import java.util
////import java.util.{ArrayList, List}
////import scala.::
////
////object Aloud extends App {
////  // TODO: Implement me
////  def readAloud(xs: List[Int]):List[Int] = {
////    if (xs.isEmpty) { // early kill
////      return Nil
////    }
////    println("Not empty")
////    val result: List[Int] = List(1); // adding the count for the first element in the source list
////
////     return readAloud1(xs, result, 1)
////  }
////
////  def readAloud1(source: List[Int], result: List[Int], pos: Int): List[Int] = {
////    if (pos == source.size) { // base case
////      result.add(source(pos - 1)) // adding the last value from the source list
////
////      return result
////    }
////    // recursive case
////    val currentInd = result.size - 1
////    if (source(pos - 1) == source(pos)) result.updated(currentInd, result(currentInd) + 1) // incrementing the count
////    else {
////      result.add(source(pos - 1)) // adding the previous value
////
////      result.add(1) // adding the count for a new value
////
////    }
////    readAloud1(source, result, pos + 1)
////  }
//
////  def readAloud(xs: List[Int]): List[Int] = {
////    var result  = List[Int]()
////    if(xs.isEmpty) {
////      return result
////    }
////      result::1
////    return readAloud1(xs, result, 1)
////  }
//
//
//
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

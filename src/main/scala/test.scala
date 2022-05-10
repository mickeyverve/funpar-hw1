//import java.util
//
//
//object Zombies {
//  private var count = 0
//
//  def countBad(hs: Array[Int]): Int = {
//    count = 0 // resetting the count to zero for every array
//
//    msort(hs)
//    count
//  }
//
//  def msort(a: Array[Int]): Unit = {
//    val n = a.length
//    if (n <= 1) return
//    val left = Arrays.copyOfRange(a, 0, n / 2)
//    val right = Arrays.copyOfRange(a, n / 2, n)
//    msort(left)
//    msort(right)
//    // SHOULD HAPPEN:
//    //    left is sorted & right is sorted
//    mergeInto(left, right, a)
//  }
//
//  def mergeInto(a: Array[Int], b: Array[Int], out: Array[Int]): Unit = {
//    var i = 0
//    var j = 0 // index of head of a, head of b (resp.)
//    for (o <- 0 until out.length) { // write to out[o]
//      if (i >= a.length) { // run out of a
//        out(o) = b({
//          j += 1; j - 1
//        })
//      }
//      else if (j >= b.length) { // run out of b
//        out(o) = a({
//          i += 1; i - 1
//        })
//      }
//      else if (a(i) < b(j)) {
//        out(o) = a({
//          i += 1; i - 1
//        })
//        var l = j
//        while ( {
//          l < b.length
//        }) {
//          if (a(i - 1) < b(l)) count += 1
//          l += 1
//        }
//      }
//      else out(o) = b({
//        j += 1; j - 1
//      })
//    }
//  }
//
//  def main(args: Array[String]): Unit = {
//    val a = Array[Int](1, 7, 22, 13, 25, 4, 10, 34, 16, 28, 19, 31)
//    System.out.println(countBad(a))
//  }
//}

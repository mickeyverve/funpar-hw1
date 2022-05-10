object Zombies extends App {
  def countBad(hs: List[Int]): Int = {
    def mergeSort(xs: List[Int]): (Int, List[Int]) = {
      def split_list(nums: List[Int], n: Int): (List[Int], List[Int]) = (nums.take(n), nums.drop(n))
      val n = xs.length / 2
      if (xs.length <= 1) (0, xs)
      else {
        def merge(xs: List[Int], ys: List[Int]): (Int, List[Int]) = (xs, ys) match {
          case (Nil, Nil) => (0, Nil)
          case (Nil, y :: yt) => {
            val merged = merge(xs, yt)
            (merged._1, y :: merged._2)
          }
          case (x :: xt, Nil) => {
            val merged = merge(xt, ys)
            (merged._1, x :: merged._2)
          }
          case (x :: xt, y :: yt) =>
            if (x > y) {
              val merged = merge(xt, ys)
              (merged._1, x :: merged._2)
            }
            else {
              val merged = merge(xs, yt)
              (merged._1 + xs.length, y :: merged._2)
            }
        }

        val (left, right) = split_list(xs, n)
        val lSort = mergeSort(left)
        val rSort = mergeSort(right)
        val merged = merge(lSort._2, rSort._2)
        (lSort._1 + rSort._1 + merged._1, merged._2)
      }
    }
    mergeSort(hs)._1
  }
}

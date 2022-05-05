object Happy extends App {
  // TODO: write these functions!
  def sumOfDigitsSquared(n: Int): Int = n.toString.foldLeft(0) { (product, num) => product + num.asDigit * num.asDigit}

    def isHappy(n: Int): Boolean = {
      new Iterator[Int] {
        val seen = scala.collection.mutable.Set[Int]()
        var curr = n
        def next = {
          val res = curr
          curr = res.toString.map(_.asDigit).map(n => n * n).sum
          seen += res
          res
        }
        def hasNext = !seen.contains(curr)
        }.toList.last == 1
      }

  def kThHappy(k: Int): Int = ???

  println(isHappy(236))
 }

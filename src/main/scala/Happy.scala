object Happy extends App {
  // TODO: write these functions!
  def sumOfDigitsSquared(n: Int): Int = n.toString.foldLeft(0) { (product, num) => product + num.asDigit * num.asDigit}

  def isHappy(n: Int): Boolean = {
    def sumOfDigitsSquared(n: Int): Int = n.toString.foldLeft(0) { (product, num) => product + num.asDigit * num.asDigit}
    def loop(seen: Set[Int],x: Int):Boolean = {
      x match {
        case 1 => true
        case _ if seen.contains(x) => false
        case _ => loop(seen+x,sumOfDigitsSquared(x))
      }
    }
    loop(Set(),n)
  }
  def kThHappy(k: Int): Int = ???

  println(isHappy(24))
 }

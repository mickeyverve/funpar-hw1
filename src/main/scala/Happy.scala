object Happy extends App {
  // TODO: write these functions!
  def sumOfDigitsSquared(n: Int): Int = n.toString.foldLeft(0) { (product, num) => product + num.asDigit * num.asDigit}

  def isHappy(n: Int): Boolean = {
    def loop(x: Int):Boolean = {
      x match {
        case 1 => true
        case 4 => false
        case _ => loop(sumOfDigitsSquared(x))
      }
    }
    loop(n)
  }
  def kThHappy(k: Int): Int = {
  def helper(countN: Int, countK: Int, hNum: Int): Int = countK match {
    case _ if (countK == hNum) => countN
    case _ if (isHappy(countN)) => helper(countN + 1, countK + 1, hNum)
    case _ => helper(countN + 1, countK, hNum)
  }
    val count =helper(0,0,k)
    count-1
  }

  print(isHappy(71))
 }

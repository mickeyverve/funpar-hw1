object AllPerm extends App {

def allPerm(n: Int): List[List[Int]] = {
  def listBuilder(iterate : Int): List[Int] = {
    if(iterate == 1) List() :+ 1
    else  listBuilder(iterate-1) :+ iterate
  }
  def createPermutations(list: List[Int]): List[List[Int]] = list match {
    case Nil => Nil
    case List(x) => List(List(x))
    case _ => list
      .flatMap(x =>
        createPermutations(list.filterNot(_==x))
          .map(p => x :: p))
  }
  val num = listBuilder(n)
  val dim: List[List[Int]] = createPermutations(num)
  return dim
  }
  println(allPerm(1))
}

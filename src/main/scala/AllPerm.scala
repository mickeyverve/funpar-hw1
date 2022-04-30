object AllPerm extends App {

//  def allPerm(in: List[List[Int]]): List[List[Int]] = {
//    def perms0(in: List[Int], tmp: List[Int]): List[List[Int]] =
//      if (in.isEmpty) List(tmp)
//      else in.foldLeft(Nil: List[List[Int]])((acc, el) => perms0(in.filter(en => en != el) , el :: tmp) ++ acc)
//    perms0(in, Nil)
//  }
def permutations(list: List[Int]): List[List[Int]] = list match {
  case Nil => Nil
  case List(x) => List(List(x))
  case _ => list
    .flatMap(x =>
      permutations(list.filterNot(_==x))
        .map(p => x :: p))
}
  print(permutations(List(1,2,3,4)))
}

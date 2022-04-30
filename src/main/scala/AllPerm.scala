object AllPerm extends App {

  def allPerm(in: List[List[Int]): List[List[Int]] = {
    def perms0(in: List[Int], tmp: List[Int]): List[List[Int]] =
      if (in.isEmpty) List(tmp)
      else in.foldLeft(Nil: List[List[Int]])((acc, el) => perms0(in.filter(en => en != el) , el :: tmp) ++ acc)
    perms0(in, Nil)
  }
  print(allPerm(List("A", "B", "C")))
}

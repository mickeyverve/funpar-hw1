object Zombies extends App {

//   def countBad(hs: List[Int]): Int = {
     def mergeSort(xs: List[Int]): List[Int] = {
       def split_list(nums: List[Int], n: Int) : (List[Int], List[Int])=  (nums.take(n), nums.drop(n))
       val n = xs.length / 2
       if (n == 0) xs
       else {
         def merge(xs: List[Int], ys: List[Int] ,count:Int): (List[Int]) =
           (xs, ys) match {
             case (Nil, ys) => ys
             case (xs, Nil) => xs
             case (x :: xs1, y :: ys1) =>
               if (x < y) {
                 x :: merge(xs1, ys, count+1)
               }
               else y :: merge(xs, ys1, count)
           }



         val (left, right) = split_list(xs, n)//xs splitAt (n)
         merge(mergeSort(left), mergeSort(right),0)
       }

     }



//   }

  println(mergeSort(List(8, 4, 6, 78, 1, 2)))
}
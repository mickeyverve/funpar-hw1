object Aggregate extends App {
  // TODO: implement these functions for real!
  def myMin(p: Double, q: Double, r: Double): Double = 
  {
    if(p <= q && p <= r){ p }
    else if(q <= p && q <= r) { q }
    else  { r }
  }

  def myMean(p: Double, q: Double, r: Double): Double = 
  {
    (p+q+r)/3
  }

  def myMed(p: Double, q: Double, r: Double): Double =
   {
        if ((p < q && q < r) || (r<q && q<p)){
          q
        }
        else if ((q < p && p < r) || (r<p && p<q) ){
          p
        }
        else{
          r
        }
  }
}

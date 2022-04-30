object Aggregate extends App {
  // TODO: implement these functions for real!
  def myMin(p: Double, q: Double, r: Double): Double = 
  {
    if(p <= q && p <= r){ return p }
    else if(q <= p && q <= r) { return q }
    else  { return r }      
  }

  def myMean(p: Double, q: Double, r: Double): Double = 
  {
    return (p+q+r)/3
  }

  def myMed(p: Double, q: Double, r: Double): Double =
   {
        if ((p < q && q < r) || (r<q && q<p)){
            return q;
        }
        else if ((q < p && p < r) || (r<p && p<q) ){
              return p;
        }
        else{
            return r;
        }
  }
  
  println(myMin(2.0,3.0,4.0))
  println(myMean(3,7,4.0))
  println(myMed(13,5.0,12))
}

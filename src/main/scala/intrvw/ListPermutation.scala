package intrvw

object ListPermutation {

  def computePermutation[T](es: List[T]) = {

    def permutation[T](
      prefix: List[T],
      suffix: List[T],
      acc: List[List[T]]): List[List[T]] = 
      if(suffix.isEmpty)
        prefix :: acc
      else {
        suffix.flatMap( p => permutation(p::prefix, suffix.filterNot(_ == p), acc) )
      }

    permutation(Nil, es, Nil)
  }
} 

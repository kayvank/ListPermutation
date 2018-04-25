package intrvw

import org.specs2._

class ListPermutationSpec extends Specification { def is = s2"""
Specifications: 
   It will generate unique Lists of permutations $e1
"""
  import ListPermutation._

    def e1 =  {
    val ls = (0 to 4).toList
    val computed =  computePermutation(ls)
   // println(s"${computed}")

      computed.size ===5*4*3*2 &&
         computed.toSet.size === computed.size
  }
}

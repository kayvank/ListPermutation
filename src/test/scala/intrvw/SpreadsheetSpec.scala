package intrvw

import org.specs2._
class SpreadsheetSpec extends Specification { def is = s2"""
Spreadsheet specs are:
  it must apply operation to the list $e1
  it must compute cell entries $e2

"""
  import Spreadsheet._ 
  def e1={
    val testData = ("-",List(9,4))
    val computed = compute(testData._1, testData._2)
    //println(s" compute = ${computed}")
    5 must_== computed
  }
  def e2={
    val computed = cell("1 2 * 4 5 + 8 7 -")
    //println(s"cell computations = ${computed}")
    12 must_== computed
  }

}

package intrvw

import  scala.util.matching
object Spreadsheet { 

    def helper(exs: List[String], acc: List[(String, List[String])]) : List[(String, List[String])] =
      if(exs.isEmpty)
        acc
      else{
        val ls = exs.takeWhile(_.matches("""\d"""))
        val rest = exs.dropWhile(_.matches("""\d"""))
        helper(rest.tail, (rest.head, ls):: acc)
      }
  def compute(op: String, operands: List[Int]) : Int = op match {
    case "+" => operands.foldLeft(0)(_+_)
    case "-" =>operands.foldRight(0)(_-_)
    case "*" => operands.foldLeft(1)((a,c) => a*c)
    case "/" =>operands.foldRight(0)((a,c)=> c/a)
  }
  def cell(ex: String) = {
    helper(ex.split("\\s+").toList, List[(String, List[String])]())
     .foldLeft(0)((a,c) => a + compute(c._1, c._2.map( x => x.toInt )))
  }
}

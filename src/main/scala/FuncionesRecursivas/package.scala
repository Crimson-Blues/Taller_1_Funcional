import scala.annotation.tailrec

package object FuncionesRecursivas {
  def maxLin(l: List[Int]):Int ={
    if (l.tail.isEmpty) l.head
    else math.max(l.head, maxLin(l.tail))
  }

  def maxIt(l: List[Int]):Int ={
    @tailrec
    def maxIter(iterList:List[Int], currentMax:Int):Int ={
      if (iterList.isEmpty) currentMax
      else maxIter(iterList.tail, math.max(iterList.head, currentMax))
    }
    maxIter(iterList = l.tail, currentMax = l.head)
  }
}



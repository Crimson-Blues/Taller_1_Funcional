import scala.annotation.tailrec

package object FuncionesRecursivas {
  def maxLin(l: List[Int]):Int ={
    def intMax(x: Int, y: Int) =
      if(x >= y) x else y

    if (l.tail.isEmpty) l.head
    else intMax(l.head, maxLin(l.tail))
  }

  def maxIt(l: List[Int]):Int ={
    def intMax(x: Int, y: Int) =
      if (x >= y) x else y
    @tailrec
    def maxIter(iterList:List[Int], currentMax:Int):Int ={
      if (iterList.isEmpty) currentMax
      else maxIter(iterList.tail, intMax(iterList.head, currentMax))
    }
    maxIter(iterList = l.tail, currentMax = l.head)
  }

  def movsTorresHanoi(n: Int): BigInt = {
    if (n == 0) BigInt(0)
    else 2 * movsTorresHanoi(n - 1) + 1
  }

  def torresHanoi(n: Int, t1: Int, t2: Int, t3: Int): List[(Int, Int)] = {
    if (n == 0) List()
    else
      torresHanoi(n - 1, t1, t3, t2) ++ List((t1, t3)) ++ torresHanoi(n - 1, t2, t1, t3)
  }
}



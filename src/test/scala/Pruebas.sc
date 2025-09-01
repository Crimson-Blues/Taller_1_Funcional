import FuncionesRecursivas._
val numbers: List[Int] = List(0, 9, 99, 55)
val maxHead: List[Int] = List(999, 10, 9, 8)
val maxTail: List[Int] = List(0, 20, 10, 999)
val onlyHead: List[Int] = List(999)
val equalValue: List[Int] = List(8, 8, 8, 8)

maxLin(numbers)
maxLin(maxHead)
maxLin(maxTail)
maxLin(onlyHead)
maxLin(equalValue)

maxIt(numbers)
maxIt(maxHead)
maxIt(maxTail)
maxIt(onlyHead)
maxIt(equalValue)

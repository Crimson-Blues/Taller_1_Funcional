import FuncionesRecursivas._
// Pruebas para maxLin y maxIt
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

// Pruebas para Torres de Hanoi
movsTorresHanoi(0) // Empty
movsTorresHanoi(1) // base
movsTorresHanoi(2) // even
movsTorresHanoi(3) // odd
movsTorresHanoi(64) //BigNumber (verify formula)

torresHanoi(0,1,2,3) // n = 0 empty list
torresHanoi(1,1,2,3)
torresHanoi(1,3,2,1)
torresHanoi(2,1,2,3)
torresHanoi(3,1,2,3)
val n = 7
torresHanoi(n, 1, 2, 3).length == movsTorresHanoi(n).toInt

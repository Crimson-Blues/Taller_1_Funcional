import FuncionesRecursivas._
//Test int Lists for maxLin
val numbersLin: List[Int] = List(0, 9, 99, 55) //Unordered list
val maxHeadLin: List[Int] = List(999, 10, 9, 8) //Max element in first position
val maxTailLin: List[Int] = List(0, 20, 10, 999) //Max element in last position
val maxBothLin: List[Int] = List (999, 40, 50, 999) //Two max elements at both ends
val onlyHeadLin: List[Int] = List(999) //Single entry list
val equalValueLin: List[Int] = List(9, 9, 9, 9) //Identical elements list

//Test int Lists for maxIt
val numbersIt: List[Int] = List(8, 88, 44, 22) //Unordered list
val maxHeadIt: List[Int] = List(888, 0, 10, 88) //Max element in first position
val maxTailIt: List[Int] = List(0, 10, 10, 888) //Max element in last position
val maxBothIt: List[Int] = List (888, 30, 20, 888) //Two max elements at both ends
val onlyHeadIt: List[Int] = List(888) //Single entry list
val equalValueIt: List[Int] = List(8, 8, 8, 8) //Identical elements list

maxLin(numbersLin)
maxLin(maxHeadLin)
maxLin(maxTailLin)
maxLin(onlyHeadLin)
maxLin(equalValueLin)

maxIt(numbersIt)
maxIt(maxHeadIt)
maxIt(maxTailIt)
maxIt(onlyHeadIt)
maxIt(equalValueIt)

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
torresHanoi(n, 1, 2, 3).length == movsTorresHanoi(n).toInt //Checking list length against optimal number of movements

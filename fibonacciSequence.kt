fun main(arr : Array<String>) {
	//Generating Sequence starting from 1
    val fibonacciSequence = generateSequence(1 to 1) {
	//Calculating Fn  = Fn-1 + Fn-2 and mapping to return Pair<Int,Int>
        it.second to it.first + it.second
    }.map{ it.second } 

    println("First X Fibonacci numbers are : 0,1, ${fibonacciSequence.take(20).joinToString()}")
}

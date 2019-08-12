package part1

fun factorial(n: Int): Int{
    when (n){
        0,1 -> return 1
        else -> return n * factorial(n-1)
    }
}


tailrec fun factorialTailRecursion(n: Int, acc: Int = 1): Int{
    when (n){
        0,1 -> return acc
        else -> return factorialTailRecursion(n-1, acc*n)
    }
}
fun main(){
    println(factorial(5))
    println(factorialTailRecursion(5))
}
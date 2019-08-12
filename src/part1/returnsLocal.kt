package part1

fun <T> Iterable<T>.myForEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}
fun containigFunction(){
    val numbers = 1..100
//    numbers.myForEach{
//        if (it % 5 == 0){
////            return
//            return@myForEach
//        }
//    }
    numbers.forEach(fun(element){
        if (element % 5 == 0) return}
    )
    println("Hello!")
}
fun main(){
    containigFunction()
}
//вывод:
//пустой
/**
 * comment line 8
 * output: empty
 *
 * There are non-local return because forEach functions is inline functions.
 * Non-local return it's a return that can interrupt the execution of the function that surrounds the embedded
 *
 * comment line 7
 * output: Hello!
 * Returns from forEachFunctions and not interrupt execution surrounded function
 * 14-15 lines
 * In this case - there we use anonymous function. Lambda and anonymous functions has different behaviors:
 * lambda does not local return, anonymous does
 */


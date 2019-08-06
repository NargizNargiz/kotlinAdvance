package part1

inline fun operation(op: ()-> Unit){
    println("Before calling op()")
    op()
    println("After calling op()")
}
fun main(){
    operation { println("This is op() functions") }
}
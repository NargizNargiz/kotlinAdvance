package inlineFunctions

fun <T> Iterable<T>.MyForEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}
fun main() {
    //listOf("three", "two", "one").forEach {
    listOf("three", "two", "one").MyForEach {
        if(it == "one") {
            println("12345")
        }
        println(it)
    }
    println("boom!")
}
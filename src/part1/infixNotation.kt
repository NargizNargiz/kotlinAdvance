package part1
private infix fun String.shouldBeEqualTo(value: String): Boolean {
    val b = this == value
    return b
}

fun main(){
    "hello".shouldBeEqualTo("hello")
    "hello" shouldBeEqualTo "hello"
}
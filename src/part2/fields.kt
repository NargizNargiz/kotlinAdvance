package part2

class Customer(){
    var lastPurchasedAmount :Double = 0.0
        get() = field
        set(value){
            if (value >100)
                field = value
        }
}
fun main(){
    val customer: Customer

}
package part2

interface Repository{
    fun getAll(): List<Customer>
}
// You want property repository initialized late and you  are don't want do abstract/or/nullable  property
class CustomerCntroller{
    lateinit var repository: Repository
    fun index(): String{
        return repository.getAll().toString()
    }
}
fun main(){
    val customerController  = CustomerCntroller()
    customerController.index()
}
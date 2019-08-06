package part1
fun foo(fooParam: String){
    val outerFunction = "Something"
    fun bar(barPar: String){
        println(barPar)
        println(fooParam)
        println(outerFunction)
    }
}
fun main(){
    foo("Nargiz")
}
package part2
// and HIDDING CONsTRUcTORS
// in kotlin we don't have static classes and static methods
// instead  of we have companion objects
class Log(){
    companion object  Factory {
        //    object Factory {
       @JvmStatic fun createFileLog(filename: String) = Log(filename)
    }
    constructor(f: String): this()
}
fun main(){
//    val log = Log.Factory.createFileLog("dot.txt")
    // so cumbersome construction  and i want 'Log.Factory.createFileLog("dot.txt")', how i do something like that?
    // answer: companion object - uncomment 6 line
    // val log = Log.createFileLog("dot.txt")
    // !! Each class can only have a single companion object

    // about hidding constructors
    val log = Log.createFileLog("sdf")
    val myLog = Log()
}
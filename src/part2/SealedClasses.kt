package part2


//open class Result{
sealed class Result{
//    class Error(var message: String, code: Int): Result()
//    class Success(val content: String) : Result()
}
class Error(var message: String, code: Int): Result()
class Success(val content: String) : Result()
class MediumSuccess(): Result()
fun getURLPage(url :String):Result{
    val isValidCall = false
    if (!isValidCall){
        return Success("The content")
    }else{
        return Error("Bad",404)
    }
}
fun main(){
    val pageRes = getURLPage("/")
    when (pageRes){
        is Result-> println('f')
        is Error -> println('e')
    }
}
// the classes of sealed can be in only one file
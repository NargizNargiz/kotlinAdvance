package part1

class Request(val method: String, val query: String, val contentType: String)
class Response(var contents: String, var status: Status)
class Status (var code: Int, var discription: String)
class RouteHandler(val request: Request, val response: Response){
    var executeNext = false
    fun next(){
        executeNext = true
    }
}
// the input arguments = EXTENSION funtion
fun routeHandler(path: String, f: RouteHandler.() -> Unit): RouteHandler.()->Unit = f

fun main(){
    routeHandler("https://index") {
        if (request.query != ""){
            //some do
        }
        response.status = Status(404,"Not found")
    }
}
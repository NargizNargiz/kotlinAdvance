package part2

class DirectoryExplorer(val user: String){
//     inner class PermissionCheck{
    class PermissionCheck{
        // in this nested class we haven't access to property 'user' DirectoryExplorer class
        // check it uncomment next 9 - 10 line and
        // for get access to 'user' property in PermissionCheck add in declaration class key word 'inner'(line 4)
        fun validatePermission() {
            //if (user == "dfdq")
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
    fun listFolder(folder: String, user: String){
        val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission()
    }
}
fun main(){
    val de = DirectoryExplorer("dfdg")
    val pc = DirectoryExplorer.PermissionCheck()
//    when PermissionCheck is inner class uncomment 24 line
//    val pc = DirectoryExplorer("df").PermissionCheck()

}

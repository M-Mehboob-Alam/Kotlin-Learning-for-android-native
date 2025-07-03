fun main(){
    var response: String
    do {
        println("Do you want to continue? (yes/no)")
        response = readLine()!!.lowercase() !!.toString()
    }
    while (response == "yes")
    println("Program ended.")

}
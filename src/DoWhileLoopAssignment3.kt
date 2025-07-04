fun main(){
//    Ask the user for a password and keep asking until they enter the correct one (“raf123").
    var isCorrerctPassword = false
    do {
        println("Enter The Correct Password")
        val userPassword = readln();
        if (userPassword == "raf123") {
            isCorrerctPassword = true;
        }
    }while(!isCorrerctPassword)
    println("Your Password is accepted!")
}
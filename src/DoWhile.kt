import java.io.DataInput

fun main(){
//    Write a Kotlin program using a do-while loop that asks the user to enter a number.
//    The loop should continue until the user enters a number greater than 5.
    var userInput : Int?
    do{
        println("Enter A Number")
        userInput = readln().toIntOrNull()
    }while(userInput !=null && userInput < 5)

}
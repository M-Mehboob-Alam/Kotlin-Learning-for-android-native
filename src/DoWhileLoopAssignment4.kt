fun main(){
//    Program asks the user to guess a secret number until the correct one is guessed.
//
//    secretNumber =7
//    Guess the number (1-10)
    val secretNumber = 7
    do {
        println("Enter a secrete number!")
        val userEnteredNumber = readln().toIntOrNull()
    }while (userEnteredNumber != secretNumber )
    println("You guessed it correct!")
}
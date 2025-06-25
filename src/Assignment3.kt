fun  main(){

    println("Please Enter Your Age")
    val age = readln().toIntOrNull()
    println("Please Enter your ticket no")
    val userTicket = readln().toIntOrNull()

    if (age !=null && userTicket != null){
        if (age >= 18 ){
            if (userTicket == 123456){
                println("you have a valid ticket no: $userTicket")
                println("your age is equal to greater than 18: $userTicket")
                println("you are allowed to enter")
            }else{
                println("you entered the wrong ticket no: $userTicket")
            }
        }else{
            println("you are below to 18 years old and not allowed to enter")
        }
    }else{
        println("you have entered invalid format age or ticket no, age and ticket should be in numbers format only!")
    }

}
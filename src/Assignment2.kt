fun  main(){
//    Assignment Question 1
//Write a program to compare two numbers x = 15 and y = 25. Print whether x is less than y.
    val x = 15
    val y = 25
    if(x<y){
        println("$x is less than $y")
    }else{
        println("$x is greater then $y")
    }

//    Assignment Question 2
//    A student must pass both math and science to get a certificate. Given math = true and science = false, check eligibility.
        val math = true
        val science = false
        if(math && science){
            println(" Congrats, your are passed and you can get certificate")
        }else{
            println("Sorry, you are failed and can't get a certificate")
        }
}
fun main(){
//    Assignment 3
//    Question 3:
//    Use a for loop to print all odd numbers between 1 and 20.
//    Using step function and without step function

//    with step
    println("With Step")
    for(x in 1..20 step 2){
        println(x)
    }
println("Without Step")
//    without step
    for (x in 1 .. 20 ){
        if (x%2!=0)
            println(x)
    }

}
fun main() {
//    Question 4:
//    Write a Kotlin program using until to print a number pyramid like this:
//    1
//    1 2
//    1 2 3
//    1 2 3 4
//    1 2 3 4 5

    for (x in 1 until 7){

        for (y in 1 ..x){
            if (x ==y){
                println()
            }else{
                print("$y ")
            }
        }
    }

}
import kotlin.math.abs

fun main(){
//    var number =4567
//    Count Digits in a Number
      var number = 456786987
      var digit = 0
//    while ()
      number = abs(number)
      if (number == 0){
            println(1)
      }
      while (number > 0){
            number /= 10
            digit++
      }
      println("Total Number Are $digit")

}
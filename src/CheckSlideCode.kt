fun main(){
//    val x: Int = 5
//    val y: Long = x.toLong()
//    println(y)

    val x: Byte = 5
    val number: Int = x + 10       // Byte is promote to Int implicity
    println(number)
    println(number::class.simpleName)
}
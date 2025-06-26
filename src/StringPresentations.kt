import java.util.Locale
import java.util.Locale.getDefault

fun main(){
    //    learning string
    /*    var s ="Hello"
        println(s)
        var txt = "Hello World"
        println(txt[0])             // first element (H)
        println(txt[2])           // third element (l)
        var Text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        println("The length of the txt string is: " + Text.length)
    */

//    There are many string functions available, for example toUpperCase() and toLowerCase():


//    var txt = "Hello World"
//    println(txt.contains("Hi"))   // Result in Boolean
//    println(txt.lowercase())   // Outputs "HELLO WORLD" println(txt.toLowerCase())   // Outputs "hello world“
//    println(txt.startsWith("H"))   // Result in Boolean
//    println(txt.endsWith("I"))   // Result in Boolean


//    Split function in Kotlin takes a delimiter and divides the string into a list of substrings. Here's a simple

//    val str = "Kotlin is awesome"
//    val result = str.split(" ")
//    println(result) // Output: [Kotlin, is, awesome]


//    val str = "one,two;three:four"
//    val result = str.split(",", ";", ":")
//    println(result)    // Output: [one, two, three, four]


    val text = "Kotlin is awesome"
    val newText = text.replace("power", "powerful")
    println(newText)  // Kotlin is powerful


//    The compareTo(string) function compares two strings and returns 0 if both are equal:

    var txt1 = "Hello World"
    var txt2 = "Hello World"
    println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)


}
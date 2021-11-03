
var funds : Double = 100.0
val pswd = "password"

fun main() {
    var input : String
    var cmd : List<String>

    while (true) {
        print("Command: ")
        input = readLine()!!
        cmd = input.split(" ")
        when (cmd[0]) {
            "balance" -> balance()
            "deposit" -> deposit(cmd[1].toDouble())
            else -> println("Invalid command")
        }
    }
}

fun balance(){
    println("Your balance is $funds")
}

fun deposit(deposit : Double){
    var balance : Double
    balance = deposit + funds
    println("You have deposited  $$deposit")
    println("Account balance = $$balance")
}

















//fun main() {
//    println("Hello World")
//   println(getFullName("George"))
//    println(getFullName("Kwesi"))
//    println(getFullName("kwame"))
//}
//
//fun getFullName(name : String): String{
//    return when(name) {
//        "George" -> "George Hanson"
//        "Kwesi" -> "Kwesi Addo"
//        else -> "Unrecognized name"
//    }
//}
//fun main() {
//    var name : String = "Hello World"
//    println("$name")
//
//    println(calculateY(8,5,4))
//    for(i in -5..5)println("y =" + calcY(i))
//    for(i in 0..20)println("x = " + i + " y =" + calculateY(3,i,5))
//
//    for(i in 0..20)
//        if (calculateY(3,i,5) == calculateY(4,i,2))
//                       println("x = " + i + ", y = " + calculateY(4,i,2))
//}
//
//fun calculateY(m : Int, x : Int, c : Int) : Int {
//     y = mx + c - formula for a straight line
//    return m * x + c
//}
//fun intersection(mOne : Int, cOne : Int, mTwo : Int, cTwo : Int) : Unit {
//     This function takes the equations of two lines:
//     yOne = mOne * x + cOne and yTwo = mTwo * x + cTwo
//     and prints the X value they intersect at
//     or prints "Don't intersect" if they do not.
//     You only need to check x values between 0 and 100
//}
//

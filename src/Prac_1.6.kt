fun sum(a: Int, b: Int): Int{
    return a + b
}
fun sub(a: Int, b: Int): Int{
    return a - b
}
fun mul(a: Int, b: Int): Int{
    return a * b
}
fun div(a: Int, b: Int): Double{
    return a.toDouble() / b
}


fun main(){
    println("Enter number 1: ")
    val num1 = readln().toInt()
    println("Enter number 2: ")
    val num2 = readln().toInt()

    println("Addition of $num1, $num2 is ${sum(num1,num2)}")
    println("Subtraction of $num1, $num2 is ${sub(num1, num2)}")
    println("Multiplication of $num1, $num2 is ${mul(num1, num2)}")

    if (num1 != 0)
        println("Division of $num1, $num2 is ${div(num1, num2)}")
    else
        println("Denominator is 0. Division not possible!")
}
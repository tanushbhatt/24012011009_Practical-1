fun factorial(n: Int): Long{
    if (n == 0 || n == 1){
        return 1
    }
    else{
        return n * factorial(n - 1)
    }
}


fun main(){
    print("Enter a Number: ")
    val num = readln().toInt()

    if (num < 0) {
        println("Factorial of a negative number is not possible.")
    }
    else {
        println("Factorial of $num = ${factorial(num)}")
    }
}
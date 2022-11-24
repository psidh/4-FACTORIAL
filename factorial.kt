fun main(args: Array<String>) {
    print("Enter the number to find the factorial: ")
    var num: Int =Integer.valueOf(readLine())
    var factorial: Long = 1
    for (i in 1..num) {
        // factorial = factorial * i;
        factorial *= i.toLong()
    }
    println("Factorial of $num = $factorial")
}
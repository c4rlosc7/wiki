object Factorial extends App {
    println("Factorial")

    def factorial(n: Long): Long = {
        if (n == 0) {
            println("termino")
            1
        } else {
            println(s"Valor calculado ${n}")
            n * factorial(n-1)
        }
    }

    println(factorial(3))
}
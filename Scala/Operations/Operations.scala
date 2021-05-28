object Operations extends App {
    println("Operations sum, res, mul, div")

    def sum(a: Int, b: Int): Int = {
        print(a)
        print("+")
        println(b)
        a + b
    }

    def res(a: Int, b: Int): Int = {
        print(a)
        print("-")
        println(b)
        a - b
    }

    def mul(a: Int, b: Int): Int = {
        print(a)
        print("*")
        println(b)
        a * b
    }

    def div(a: Int, b: Int): Int = {
        print(a)
        print("/")
        println(b)        
        a / b
    }

    println("sum: " + sum(4,3))
    println("res: " + res(4,3))
    println("mul: " + mul(4,3))
    println("div: " + div(4,3))

}
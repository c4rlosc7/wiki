// https://docs.scala-lang.org/tour/unified-types.html#nothing-and-null

object Functions extends App {
    println("functions")

    def isGreater(a: Int): Int =>  Boolean = {
        (b: Int) =>
            a < b
    }
    val f = isGreater(10)
    println(f(5))
}
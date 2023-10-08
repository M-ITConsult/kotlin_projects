package overloading

class Overloading {
    fun f() = 0
    fun f(n: Int) = n + 2
}

fun main() {
    val o = Overloading()
    println(o.f())
    println(o.f(11))
}
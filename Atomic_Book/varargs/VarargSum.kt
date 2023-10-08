package varargs

fun sum(vararg numbers: Int): Int {
    var total = 0
    for (n in numbers) {
        total += n
    }
    return total
}

fun main() {
    println(sum(13,27,44))
    println(sum(1,3,5,7,9,11))
    println(sum())
}
package varargs

fun main() {
    val array = intArrayOf(4,5)
    println(sum(1,2,3, *array,6))

    val list = listOf(9,10,11)
    println(sum(*list.toIntArray()))
}
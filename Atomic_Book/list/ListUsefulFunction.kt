package list

fun main() {
    val doubles = listOf(1.1,2.2,3.3,4.4)
    println(doubles.sum())

    val strings = listOf("Twas", "Brillig", "And", "Slithy", "Toves")
    println(strings)
    println(strings.sorted())
    println(strings.reversed())
    println(strings.first())
    println(strings.takeLast(2))

}
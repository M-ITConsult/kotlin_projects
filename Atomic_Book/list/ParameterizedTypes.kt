package list

fun main() {
    // Type is inferred:
    val numbers = listOf(1,2,3)
    val strings = listOf("one", "two","three")
    // Exactly the same, but explicitly typed:
    val numbers2: List<Int> = listOf(1,2,3)
    val strings2: List<String> = listOf("one", "two","three")

    println(numbers)
    println(strings)
    println(numbers2)
    println(strings2)

}
package lambdas

fun main() {
    val list = listOf('a','b','c')
    println(list.mapIndexed { index, element ->
        "[$index: $element]"
    })
}
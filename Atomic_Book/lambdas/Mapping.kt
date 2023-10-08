package lambdas

fun main() {
    val list = listOf('a','b','c','d')
    // .toUpperCase is depreciated, now it's .uppercaseChar
    val result = list.map { "[${it.uppercaseChar()}]" }
    println(result)
}
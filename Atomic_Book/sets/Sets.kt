package sets

fun main() {
    val intSet = setOf(1,1,2,3,9,9,4)
    println(intSet)
    println(setOf(1,2))
    println(9 in intSet)
    println(99 in intSet)
    println(intSet.contains(9))
    println(intSet.contains(99))
}
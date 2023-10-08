package varargs

fun evaluate(vararg ints: Int) =
    "Size ${ints.size}\n" +
    "Sum: ${ints.sum()}\n" +
            "Average: ${ints.average()}"

fun main() {
    println(evaluate(10, -3,8,1,9))
}
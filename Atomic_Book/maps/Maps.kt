package maps

fun main() {
    val constants = mapOf(
        "Pi" to 3.141,
        "e" to 2.718,
        "phi" to 1.618
    )

    println(constants)
    println(constants["e"])
    println(constants.keys)
    println(constants.values)

    var s = ""
    for (entry in constants) {
        s += "${entry.key}=${entry.value}, "
    }
    println(s)

    s = ""
    for ((key, value) in constants)
        s += "$key=$value, "
    println(s)
}
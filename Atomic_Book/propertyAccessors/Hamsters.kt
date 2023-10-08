package propertyAccessors


class Hamster(val name: String)

class Cage(private val maxCapacity: Int) {
    private val hamsters =
        mutableListOf<Hamster>()
    val capacity: Int
        get() = maxCapacity - hamsters.size
    val full: Boolean
        get() = hamsters.size == maxCapacity
    fun put(hamster: Hamster): Boolean =
        if (full)
            false
    else {
        hamsters += hamster
            true
    }
    fun take(): Hamster =
        hamsters.removeAt(0)
}

fun main() {
    val cage = Cage(2)
    println("Est-ce que la cage est pleine? ${cage.full}")
    println("La capacité de la cage est de: ${cage.capacity}")
    println(cage.put(Hamster("Alice")))
    println(cage.put(Hamster("Bob")))
    println(cage.full)
    println(cage.capacity)
    println(cage.put(Hamster("Charlie")))
    cage.take()
    println(cage.capacity)
}
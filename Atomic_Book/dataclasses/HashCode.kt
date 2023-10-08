package dataclasses

data class Key(val name: String, val id: Int)

fun main() {
    val korvo: Key = Key("Korvo", 19)
    println(korvo.hashCode())
    val map = HashMap<Key, String>()
    map[korvo] = "Alien"
    println(map[korvo])
    val set = HashSet<Key>()
    set.add(korvo)
    println(set.contains(korvo))
}
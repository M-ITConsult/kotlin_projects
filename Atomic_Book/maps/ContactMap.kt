package maps

class Contact (
    val name: String,
    val phone: String
) {
    override fun toString(): String {
        return "Contact('$name', '$phone')"
    }
}

fun main() {
    val miffy = Contact("Miffy","1-234-567890")
    val cleo = Contact("Cleo","098-765-4321")
    val contacts = mapOf(miffy.phone to miffy,
        cleo.phone to cleo)
    println(contacts["1-234-567890"])
    println(contacts["1-111-111111"])
}
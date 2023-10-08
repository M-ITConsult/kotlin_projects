package dataclasses

data class DetailedContact(
    val name: String,
    val surname: String,
    val number: String,
    val address: String
)

val contact = DetailedContact(
    "Miffy",
    "Miller",
    "1-234-567890",
    "1600 Amphitheatre Parkway"
)

fun main() {
    println("Voici votre adresse: $contact")
    print("Changer le numéro: ")
    val newNumber = readln()
    print("Changer l'adresse: ")
    val newAddress = readln()
    val newContact = contact.copy(
        number = newNumber,
        address = newAddress
    )

    println(newContact)
}

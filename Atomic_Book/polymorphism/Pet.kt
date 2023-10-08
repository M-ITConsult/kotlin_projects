package polymorphism

open class Pet {
    open fun speak() = "Pet"
}

class Dog : Pet() {
    override fun speak() = "Bark!"
}

class Cat : Pet() {
    override fun speak() = "Meow"
}

fun talk(pet: Pet) = pet.speak()

fun main() {
    println(talk(Dog()))
    println(talk(Cat()))
}
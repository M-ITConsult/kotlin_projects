fun main() {
    constructors()
}

fun constructors() {
    val kevin = AlienSpecies("Zigeron",2,2,2)
    val mortyJr = AlienSpecies("Gazorpian", 2, 6, 2)
    println(kevin.describe())
    println(mortyJr.describe())
}

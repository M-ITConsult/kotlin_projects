
import visibility.Cookie
import visibility.MultipleRef
import visibility.RecordAnimals

fun main() {
    constructors()
    // RecordAnimals.kt
    val recorder = RecordAnimals()
    recorder.recordAnimals()
    recorder.recordAnimalsCount()
    // Cookie.kt
    val x = Cookie(false)
    x.bite()
    x.eat()
    // MultipleRef.kt
    val c = MultipleRef.Counter(11)
    val ch = MultipleRef.CounterHolder(c)
    println(ch)
    c.increment()
    println(ch)
    val ch2 = MultipleRef.CounterHolder(MultipleRef.Counter(9))
    println(ch2)
}

fun constructors() {
    val kevin = AlienSpecies("Zigeron",2,2,2)
    val mortyJr = AlienSpecies("Gazorpian", 2, 6, 2)
    println(kevin.describe())
    println(mortyJr.describe())
}

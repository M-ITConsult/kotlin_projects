import java.util.*
import kotlin.system.exitProcess

data class Arm(var name: String, var attaque: Int, var durabilite: Int)

fun main() {
    println("Bienvenue à toi jeune combatant!")
    print("Quel est ton pseudo?")

    // Variables
    var vieJoueur = 100
    // + Intégration des points d'attaques suivant l'arme choisis
    val attaqueJoueur = 56 + (lame.attaque);(arc.attaque);(masse.attaque)
    var vieKraken = 400
    val attaqueKraken = 35

    // Pseudonyme du joueur
    val stringInput = readln()
    println("Hey $stringInput! Quelle arme veux-tu pour combattre?")
    print("Armes disponibles > \n - arc \n - lame \n - masse \n")
    println(ArmeInput(readlnOrNull()).processCommand())
    println("Très bien $stringInput à l'attaque!")

    // Simulation attaque
    vieKraken -= attaqueJoueur * 2
    println("Le kraken subit 2 attaques du joueur, il lui reste désormais $vieKraken pv")

    // Tant que le Kraken est vivant
    while (vieKraken > 0 && vieJoueur > 0) {
        // Lancer un premier dé
        val randomInteger = (1..6).shuffled().first()
            randomInteger >= 1
            randomInteger <= 6

        if (randomInteger % 2 == 0) {
            println("Attaque ratée!")

            if (randomInteger == 6) {
                println("Attaque du Kraken attention!")
                vieJoueur -= attaqueKraken
                println("$stringInput a désormais $vieJoueur pv")
            }
        } else {
            // Attaque du joueur
            vieKraken -= attaqueJoueur
            println("Attaque ok! $vieKraken pv")
        }
    }

    if (vieKraken <= 0) {
        // Kraken est mort
        println("L'ennemi a été vaincu!! Bravo!")
    } else {
        // Joueur qui est mort
        println("Les ténèbres l'emportent... Vous êtes mort!")
        exitProcess(0)
    }
}

var arc = Arm("Arc,", 15, 10) // Première arme
var lame = Arm("Lame tranchante,", 35, 5) // Deuxième arme
var masse = Arm("Masse,", 25, 5) // Troisième arme

private class ArmeInput(arg: String?) {
    private val input = arg ?: ""

    fun processCommand() = when (input.lowercase(Locale.getDefault())) {
        "arc" -> println("Arme sélectionnée: ${arc.name} attaque: ${arc.attaque}")
        "lame" -> println("Arme sélectionnée: ${lame.name} attaque: ${lame.attaque}")
        "masse" -> println("Arme sélectionnée: ${masse.name} attaque: ${masse.attaque}")
        else -> println("Tu n'a pas pris d'arme!")
    }
}
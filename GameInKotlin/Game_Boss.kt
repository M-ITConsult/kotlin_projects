
import java.io.File
import kotlin.system.exitProcess

// Vie du monstre
const val pvMonster = 12250
// Vie du joueur
const val pvCharacter = 1200
// Email
const val mail = "test@gmail.com"
// Mot de passe
const val pass = "test1234"
data class Character(val name: String)
internal val characters = mutableListOf<Character>()

const val FILE_PATH = "C:\\kotlin_projects\\GameInKotlin\\Players_Characters\\character_list"
// Chargement du fichier personnage
private fun loadCharacterFromFile() {
    val file = File(FILE_PATH)
    if (file.exists()) {
        file.forEachLine { line ->
            characters.add(Character(line.trim()))
        }
    }
}
// Sauvegarde du personnage au fichier
private fun saveCharactersToFile() {
    val file = File(FILE_PATH)
    file.writeText("")
    characters.forEach { character ->
        file.appendText("${character.name}\n")
    }
}
// Liste des personnages
private fun displayCharacter() {
    if (characters.isNotEmpty()) {
        println("Liste des personnages:")
        characters.forEachIndexed { index, character ->
            println("${index + 1}. ${character.name}\n")
        }
    } else {
        println("Personnage non trouvé")
    }
}
// Création du personnage
private fun createCharacter() {
    print("Nom de personnage: ")
    val charactName = readlnOrNull()

    if (characters.any { it.name == charactName}) {
        println("Personnage déjà créé")
    } else {
        val newCharacter = Character(charactName ?: "")
        characters.add(newCharacter)
        saveCharactersToFile()
        println("Personnage créé")
    }
}
// Supprimer un personnage
private fun deleteCharacter() {
        displayCharacter() // Liste des personnages
    if (characters.isNotEmpty()) {
        print("Entrez le nom du personnage à supprimer: ")
        val charactName = readln()

        val characterToRemove = characters.find { it.name == charactName}

        if (characterToRemove != null) {
        characters.remove(characterToRemove)
        saveCharactersToFile()
        println("Personnage $charactName supprimé")
        } else {
        println("Personnage $charactName non trouvé")
        }
    }
}
// Connexion
private fun connexion() {
    do {
        print("Email: ")
        val email = sc.next()
        print("Mot de passe: ")
        val password = sc.next()
        if (password.equals(pass) && email.equals(mail)) {
            println("Connexion en cours...")
            break
        } else {
            println("Données invalides!")
        }
    } while (true)
}
// Choix du personnage
private fun chooseCharacter(): Character? {
    displayCharacter()
    if (characters.isNotEmpty()) {
        print("Entrez le numéro du personnage à choisir: (ou 'annule' pour annulé): ")
        val choice = readlnOrNull()

        if (choice == "annule") {
            return null
        }

        val index = choice?.toIntOrNull()?.minus(1)

        if (index != null && index in 0..<characters.size) {
            return characters[index]
        } else {
            println("Choix invalid. Pas de personnage sélectionné.")
        }
    } else {
        println("Personnage non trouvé.")
    }

    return null
}
// Lancement du jeu
private fun playGame(character: Character?) {

    if (character != null) {
        println("Hello ${character.name} ,tu as actuellement $pvCharacter points de vie,")
        pages.page1()
            }
}
internal fun menu() {
    do {
        println("\nMenu du jeu: \n1. Choisir un personnage et jouer\n2. Créer un personnage\n3. Supprimer un personnage\n4. Quitter")
        val choice = sc.nextInt()

        when (choice) {
            1 -> playGame(chooseCharacter())
            2 -> createCharacter()
            3 -> deleteCharacter()
            4 -> {
                println("Merci et.....@Bientôt! :)")
                exitProcess(0)
            }
        }
    } while (true)
}
private fun main() {
    loadCharacterFromFile()
    println("Lancement du jeu.....")
    connexion()
    menu()
}

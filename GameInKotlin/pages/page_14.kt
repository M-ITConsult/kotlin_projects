package pages
import menu
internal fun page14() {
        val message =
            """
                
            Page 14 : Le Remplissage de la Gourde

            Vous remplissez votre gourde avec l'eau de la fontaine, espérant qu'elle vous sera utile plus tard dans votre quête.
            
            Vous décidez de reprendre votre chemin.
            
            Rendez-vous à la page 20.
            
            Si vous voulez retournez au menu, tapez 1.
    
        """.trimIndent()
        slowPrint(message, delay)
        // Choix du joueur
    while (true) {
        print("Veuillez entrez votre choix: ")
        val choice = readln().toInt()
        when (choice) {
            20 -> page20()
            1 -> menu()
            else -> println("Choix incorrect")
        }
    }
}
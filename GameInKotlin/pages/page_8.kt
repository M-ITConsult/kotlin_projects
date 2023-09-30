package pages
import menu
internal fun page8() {
        val message =
            """
                
            Page 8 : La Fontaine Magique

            Vous approchez de la fontaine cristalline. 
            L'eau semble étrangement lumineuse, comme si elle renfermait un pouvoir mystique. 
            Vous pouvez sentir une énergie apaisante émaner de l'eau.

            Si vous choisissez de boire de l'eau de la fontaine, rendez-vous à la page 13.
            Si vous préférez remplir votre gourde et continuer votre chemin, rendez-vous à la page 14.
            
            Si vous voulez retournez au menu, tapez 1.
    
        """.trimIndent()
        slowPrint(message, delay)
        // Choix du joueur
    while (true) {
        print("Veuillez entrez votre choix: ")
        val choice = readln().toInt()
        when (choice) {
            13 -> page13()
            14 -> page14()
            1 -> menu()
            else -> println("Choix incorrect")
        }
    }
}
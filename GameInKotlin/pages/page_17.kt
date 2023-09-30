package pages
import menu
internal fun page17() {
        val message =
            """
                
            Page 17 : Le Trésor Enchanté

            En ouvrant le coffre, vous découvrez un artefact ancien brillant d'une lueur mystique. 
            Il semble posséder un pouvoir incommensurable.
            
            Vous décidez de prendre l'artefact avec vous.
            
            Rendez-vous à la page 22.
            
            Si vous voulez retournez au menu, tapez 1.
    
        """.trimIndent()
        slowPrint(message, delay)
        // Choix du joueur
    while (true) {
        print("Veuillez entrez votre choix: ")
        val choice = readln().toInt()
        when (choice) {
            22 -> page22()
            1 -> menu()
            else -> println("Choix incorrect")
        }
    }
}
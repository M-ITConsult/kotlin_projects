package pages
import menu
internal fun page21() {
        val message =
            """
                
            Page 21 : L'Épreuve des Esprits

            Vous vous retrouvez face à une série d'épreuves posées par les esprits de la forêt. 
            Chaque défi teste votre courage et votre sagesse.
            
            Vous relevez les défis avec détermination.
            
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
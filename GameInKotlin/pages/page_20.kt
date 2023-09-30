package pages
import menu
internal fun page20() {
        val message =
            """
                
            Page 20 : Le Rendez-vous Fatidique

            Alors que vous continuez votre chemin, vous tombez sur un carrefour où une silhouette encapuchonnée vous attend. 
            Elle semble connaître votre destinée.
            
            Vous décidez d'approcher la mystérieuse silhouette.
            
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
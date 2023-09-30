package pages
import menu
internal fun page19() {
        val message =
            """
                
            Page 19 : Le Cœur de la Tempête

            Alors que vous avancez, le ciel s'assombrit rapidement et des nuages menaçants s'amoncellent. 
            Une violente tempête éclate, vous enveloppant dans une furie incontrôlable.
            
            Vous cherchez un abri pour attendre que la tempête passe.
            
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
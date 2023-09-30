package pages
import menu
internal fun page11() {
        val message =
            """
                
            Page 11 : La Découverte du Trésor

            En fouillant la salle, vous découvrez un coffre ancien orné de gemmes scintillantes. 
            Il semble renfermer un trésor précieux.
            
            Si vous choisissez d'ouvrir le coffre, rendez-vous à la page 17.
            Si vous préférez quitter la salle et continuer votre exploration, rendez-vous à la page 7.
            
            Si vous voulez retournez au menu, tapez 1.
    
        """.trimIndent()
        slowPrint(message, delay)
        // Choix du joueur
    while (true) {
        print("Veuillez entrez votre choix: ")
        val choice = readln().toInt()
        when (choice) {
            17 -> page17()
            7 -> page7()
            1 -> menu()
            else -> println("Choix incorrect")
        }
    }
}
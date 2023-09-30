package pages
import menu
internal fun page15() {
        val message =
            """
                
            Page 15 : La Découverte Cachée

            En vérifiant le buisson, vous découvrez un passage secret dissimulé derrière lui. 
            Il semble mener à une zone inexplorée de la forêt.
            
            Vous choisissez de suivre le passage secret.
            
            Rendez-vous à la page 21.
            
            Si vous voulez retournez au menu, tapez 1.
    
        """.trimIndent()
        slowPrint(message, delay)
    while (true) {
        // Choix du joueur
        print("Veuillez entrez votre choix: ")
        val choice = readln().toInt()
        when (choice) {
            21 -> page21()
            1 -> menu()
            else -> println("Choix incorrect")
        }
    }
}
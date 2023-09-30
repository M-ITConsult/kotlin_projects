package pages
import menu
internal fun page7() {
        val message =
            """
                
            Page 7 : La Lueur Espérée

            Vous prenez le chemin légèrement éclairé, vous sentant un peu plus à l'aise. 
            Au fur et à mesure que vous avancez, la lumière devient de plus en plus vive, 
            jusqu'à ce que vous atteigniez une salle illuminée par des cristaux étincelants.
            
            Si vous choisissez de fouiller la salle, rendez-vous à la page 11.
            Si vous préférez retourner à l'extérieur, rendez-vous à la page 4.
            
            Si vous voulez retournez au menu, tapez 1.
    
        """.trimIndent()
        slowPrint(message, delay)
        // Choix du joueur
    while (true) {
        print("Veuillez entrez votre choix: ")
        val choice = readln().toInt()
        when (choice) {
            11 -> page11()
            4 -> page4()
            1 -> menu()
            else -> println("Choix incorrect")
        }
    }
}
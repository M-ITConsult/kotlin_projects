package pages
import menu
internal fun page18() {
        val message =
            """
                
            Page 18 : La Clémence de la Créature

            La créature s'incline devant vous, acceptant votre demande de passage pacifique. 
            Elle vous laisse continuer votre chemin sans vous causer de tort.
            
            Vous remerciez la créature et poursuivez votre quête.
            
            Rendez-vous à la page 19.
            
            Si vous voulez retournez au menu, tapez 1.
    
        """.trimIndent()
        slowPrint(message, delay)
        // Choix du joueur
    while (true) {
        print("Veuillez entrez votre choix: ")
        val choice = readln().toInt()
        when (choice) {
            19 -> page19()
            1 -> menu()
            else -> println("Choix incorrect")
        }
    }
}
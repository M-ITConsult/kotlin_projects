package pages
import characters
import menu
internal fun page22() {
    characters.forEachIndexed { index, character ->
        val message =
            """
                
            Page 22 : La Fin de l'Aventure

            Après de nombreuses épreuves et découvertes, vous atteignez enfin le cœur de la forêt. 
            Une lumière éclatante irradie de l'endroit où repose le trésor légendaire que vous cherchiez.
            
            Vous avez réussi votre quête et accompli l'histoire. 
            Le trésor que vous avez découvert apportera prospérité et paix à votre royaume.
            
            Félicitations ${character.name}! 
            Pour votre courage et votre détermination !
            
            Pour retournez au menu, tapez 1.
    
        """.trimIndent()
        slowPrint(message, delay)
    }
        // Choix du joueur
    while (true) {
        print("Veuillez entrez votre choix: ")
        val choice = readln().toInt()
        when (choice) {
            1 -> menu()
            else -> println("Choix incorrect")
        }
    }
}
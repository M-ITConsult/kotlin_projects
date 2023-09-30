package pages
import menu
internal fun page13() {
        val message =
            """
                
           Page 13 : La Bénédiction de l'Eau

            Vous buvez de l'eau de la fontaine et sentez immédiatement une énergie revitalisante vous envahir. 
            Vos forces sont régénérées, vous vous sentez prêt pour les défis à venir.
            
            Vous décidez de reprendre votre chemin.
            
            Rendez-vous à la page 5.
            
            Si vous voulez retournez au menu, tapez 1.
    
        """.trimIndent()
        slowPrint(message, delay)
        // Choix du joueur
    while (true) {
        print("Veuillez entrez votre choix: ")
        val choice = readln().toInt()
        when (choice) {
            5 -> page5()
            1 -> menu()
            else -> println("Choix incorrect")
        }
    }
}
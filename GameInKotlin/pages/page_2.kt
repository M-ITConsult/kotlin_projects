package pages
import menu
internal fun page2() {
        val message =
            """
        
            Page 2 : Le Croisement
            
            Alors que vous pénétrez plus profondément dans les bois, le sentier se divise en un croisement. 
            À votre gauche, des murmures sinistres semblent provenir de l'obscurité. 
            À droite, la lueur d'une faible lueur émane à travers les arbres.
            Devrez-vous prendre la voie de gauche vers l'inconnu ou suivre la lueur réconfortante sur la droite ? 
            Votre choix pourrait changer le cours de votre quête.
        
            Si vous empruntez le chemin de gauche, rendez-vous à la page 7.
            Si vous prenez le sentier de droite, rendez-vous à la page 8.
            Si vous faites demi-tour, rendez-vous à la page 9.
           
            Si vous voulez retournez au menu, tapez 1.
        
    """.trimIndent()
        slowPrint(message, delay)

        // Choix du joueur
    while (true) {
        print("Veuillez entrez votre choix: ")
        val choice = readln().toInt()
        when (choice) {
            7 -> page7()
            8 -> page8()
            9 -> page9()
            1 -> menu()
            else -> println("Choix incorrect")
        }
    }
}



package pages

import menu

internal fun page6() {
        val message =
            """
              
            Page 6 : Le Mystère des Profondeurs

            Vous marchez plus profondément dans la grotte, l'obscurité vous enveloppant. 
            Soudain, vous entendez un grondement sourd, comme celui d'une créature endormie. 
            Vous pouvez à peine discerner une lueur faible à l'horizon.
            
            Si vous choisissez de suivre la lueur, rendez-vous à la page 10.
            Si vous préférez rebrousser chemin, rendez-vous à la page 4.
            
            Si vous voulez retournez au menu, tapez 1.
    
        """.trimIndent()
        slowPrint(message, delay)

        // Choix du joueur
    while (true) {
        print("Veuillez entrez votre choix: ")
        val choice = readln().toInt()
        when (choice) {
            10 -> page10()
            4 -> page4()
            1 -> menu()
            else -> println("Choix incorrect")
        }
    }
}
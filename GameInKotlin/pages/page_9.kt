package pages
import menu
internal fun page9() {
        val message =
            """
                
            Page 9 : L'Exploration de la Clairière

            Vous explorez les environs de la clairière. 
            Vous découvrez des plantes médicinales rares et des indices sur les créatures qui habitent la forêt. 
            Soudain, vous entendez un bruit étrange venant d'un buisson.

            Si vous décidez de vérifier le buisson, rendez-vous à la page 15.
            Si vous préférez retourner à la clairière centrale, rendez-vous à la page 5.
            
            Si vous voulez retournez au menu, tapez 1.
    
        """.trimIndent()
        slowPrint(message, delay)
        // Choix du joueur
    while (true) {
        print("Veuillez entrez votre choix: ")
        val choice = readln().toInt()
        when (choice) {
            15 -> page15()
            5 -> page5()
            1 -> menu()
            else -> println("Choix incorrect")
        }
    }
}
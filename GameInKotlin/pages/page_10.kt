package pages
import menu
internal fun page10() {
        val message =
            """
                
            Page 10 : Le Passage Mystique

            Vous suivez la lueur jusqu'à une étrange porte de pierre, couverte de symboles mystiques. 
            Elle semble mener à un autre lieu, peut-être même à un autre monde.
            
            Si vous décidez de franchir la porte, rendez-vous à la page 16.
            Si vous préférez rebrousser chemin, rendez-vous à la page 4.
            
            Si vous voulez retournez au menu, tapez 1.
    
        """.trimIndent()
        slowPrint(message, delay)
        // Choix du joueur
    while(true) {
        print("Veuillez entrez votre choix: ")
        val choice = readln().toInt()
        when (choice) {
            16 -> page16()
            4 -> page4()
            1 -> menu()
            else -> println("Choix incorrect")
        }
    }
}
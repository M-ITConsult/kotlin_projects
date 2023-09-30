package pages
import menu
internal fun page4() {
        val message =
            """
            
           Page 4 : La Grotte Sombre

           Vous entrez dans une grotte sombre, les parois ruisselantes d'humidité. 
           Des chauves-souris s'envolent à votre approche, faisant résonner leur cri strident. 
           Le chemin semble bifurquer en deux directions : l'un mène plus profondément dans les ténèbres, 
           tandis que l'autre semble s'éclaircir légèrement.
           
           Si vous choisissez de continuer plus profondément, rendez-vous à la page 6.
           Si vous préférez rebrousser chemin, rendez-vous à la page 2.
           Si vous préférez prendre la direction légèrement éclairée, rendez-vous à la page 7.
           
           Si vous voulez retournez au menu, tapez 1.
   
        """.trimIndent()
        slowPrint(message, delay)

        // Choix du joueur
    while (true) {
        print("Veuillez entrez votre choix: ")
        val choice = readln().toInt()
        when (choice) {
            6 -> page6()
            2 -> page2()
            7 -> page7()
            1 -> menu()
            else -> println("Choix incorrect")
        }
    }
}
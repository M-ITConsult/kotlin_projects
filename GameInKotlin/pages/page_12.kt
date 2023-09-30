package pages
import menu
internal fun page12() {
        val message =
            """
                
            Page 12 : La Communication avec la Créature

            Vous tentez de parler à la créature, espérant qu'elle comprendra votre intention pacifique. 
            À votre surprise, la créature semble réceptive à vos paroles.
            
            Si vous lui demandez de vous laisser passer, rendez-vous à la page 18.
            Si vous choisissez de faire demi-tour, rendez-vous à la page 3.
            
            Si vous voulez retournez au menu, tapez 1.
    
        """.trimIndent()
        slowPrint(message, delay)
        // Choix du joueur
    while (true) {
        print("Veuillez entrez votre choix: ")
        val choice = readln().toInt()
        when (choice) {
            18 -> page18()
            3 -> page3()
            1 -> menu()
            else -> println("Choix incorrect")
        }
    }
}
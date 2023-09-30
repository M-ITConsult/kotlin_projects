package pages
import menu
internal fun page16() {
    val message =
        """
                
            Page 16 : L'Énigme du Monde Mystique

            Vous franchissez la porte mystique et vous retrouvez dans un monde étrange et enchanteur. 
            Des créatures fantastiques errent dans des prairies verdoyantes et des rivières de lumière coulent 
            sous des cieux violets.
            
            Vous décidez d'explorer ce nouveau monde.
            
            Rendez-vous à la page 22.
            
            Si vous voulez retournez au menu, tapez 1.
    
        """.trimIndent()
    slowPrint(message, delay)
    // Choix du joueur
    while (true) {
        print("Veuillez entrez votre choix: ")
        val choice = readln().toInt()
        when (choice) {
            22 -> page22()
            1 -> menu()
            else -> println("Choix incorrect")
        }
    }
}
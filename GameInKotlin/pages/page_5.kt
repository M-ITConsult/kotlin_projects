package pages
import menu
internal fun page5() {
        val message =
            """
            
            Page 5 : La Clairière Enchantée

            Vous émergez de la forêt dense dans une clairière éblouissante de beauté. 
            Des fleurs aux couleurs éclatantes tapissent le sol et le chant mélodieux des oiseaux remplit l'air. 
            Au centre de la clairière se trouve une fontaine d'eau cristalline.

            Si vous choisissez de vous approcher de la fontaine, rendez-vous à la page 8.
            Si vous préférez explorer les environs de la clairière, rendez-vous à la page 9.
            
            Si vous voulez retournez au menu, tapez 1.
            
        """.trimIndent()
        slowPrint(message, delay)

        // Choix du joueur
    while (true) {
        print("Veuillez entrez votre choix: ")
        val choice = readln().toInt()
        when (choice) {
            8 -> page8()
            9 -> page9()
            1 -> menu()
            else -> println("Choix incorrect")
        }
    }
}
package pages

import characters
import menu


// Delay d'affichage du message en millisecondes pour tous les textes de toutes les pages
    const val delay = 50L
   internal fun page1() {
       // Début de la page 1
       characters.forEachIndexed { index, character ->
           val message =
               """
        
                Page1: Le Début de l'Aventure ${character.name},
                
                Vous vous tenez à l'orée de la sombre forêt de Néréthil, votre épée à la main et votre cœur battant la chamade. 
                Des rumeurs circulent selon lesquelles d'horribles monstres hantent ces bois, semant la terreur parmi les villageois. 
                Vous êtes leur dernier espoir.
        
                Devant vous s'étend un sentier obscur, enveloppé d'ombres menaçantes. 
                Chaque pas résonne, semblant annoncer l'inconnu qui vous attend au-delà. 
                Vous sentez l'acier froid de votre épée contre votre paume, prêt à répondre à tout danger qui se présenterait.
                
                Si vous avancez prudemment, rendez-vous à la page 4.
                Si vous décidez de rebrousser chemin, rendez-vous à la page 5.
                Si vous vous arrêtez pour observer les alentours, rendez-vous à la page 6.
                
                Si vous voulez retournez au menu, tapez 1.
        
    """.trimIndent()
           slowPrint(message, delay)

           // Choix du joueur
           while (true) {
               print("Veuillez entrez votre choix: ")
               val choice = readln().toInt()
               when (choice) {
                   4 -> page4()
                   5 -> page5()
                   6 -> page6()
                   1 -> menu()
                   else -> println("Choix incorrect")
               }
           }
       }
   }
    // Fonction pour afficher un texte plus lentement, voir const delay pour la vitesse d'affichage//
    internal fun slowPrint(text: String, delay: Long) {
    for (char in text) {
        print(char)
        Thread.sleep(delay)
    }
    println()
}
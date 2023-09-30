package pages
import menu
internal fun page3() {
        val message =
            """
            
            Page 3 : L'Embûche Mortelle
            
            Vous suivez le sentier vers la gauche, où les murmures semblent les plus forts. 
            Soudain, une créature immonde surgit des ombres, sa gueule baveuse dévoilant des crocs acérés. 
            C'est un cauchemar vivant, un monstre que même les plus courageux redouteraient.
    
            Votre cœur bat la chamade, mais vous n'avez pas le choix. 
            Vous armez votre épée et vous préparez au combat. 
            La vie de ceux que vous défendez repose sur vos épaules.
            
            Si vous vous préparez mentalement au combat, rendez-vous à la page 10.
            Si vous cherchez un moyen de contourner la créature, rendez-vous à la page 11.
            Si vous tentez de communiquer avec la créature, rendez-vous à la page 12.
            
            Si vous voulez retournez au menu, tapez 1.
            
        """.trimIndent()
        slowPrint(message, delay)

        // Choix du joueur
    while (true) {
        print("Veuillez entrez votre choix: ")
        val choice = readln().toInt()
        when (choice) {
            10 -> page10()
            11 -> page11()
            12 -> page12()
            1 -> menu()
            else -> println("Choix incorrect")
        }
    }
}
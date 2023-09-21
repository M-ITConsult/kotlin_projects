var prixchocNoir = 5.50
var prixchocLait = 4.50

fun main() {
    // Entrée du prénom de la personne
    println("Bonjour, quel est votre prénom?")
    val name = readln()
    println("Bienvenue dans notre Boutique de Chocolats $name," +
            " voici les deux sortes de Chocolat que nous proposons > ")

    // Choix des deux sortes de Chocolat
    println("Chocolat Noir: $prixchocNoir€ la tablette")
    println("Chocolat au Lait: $prixchocLait€ la tablette")

    // Demander combien de tablettes
    println("Voulez-vous du Chocolat Noir? Si Oui, tapez le nombre de tablettes, Si Non mettez 0")
    val nbtabNoir = readln().toInt()
    println("Voulez-vous du Chocolat au Lait? Si oui, tapez le nombre de tablettes, Si Non mettez 0")
    val nbtabLait = readln().toInt()
    //Calculer le prix total que le client devra payer
    var totalPrix = nbtabNoir * prixchocNoir + nbtabLait * prixchocLait

    // Si le montant total est de 0
    if (totalPrix == 0.0) {
        println("Merci à bientôt! $name, vous pouvez sortir du magasin :) ")
    } else {
        println("Le prix total à payer est de: $totalPrix€")
    }

    // Si le prix total atteint 50€ et plus
    if (totalPrix >= 50) run {
        totalPrix *= 0.80 // Baisse le prix total de 20%
    }
    // Afficher le nouveau prix après la remise
    println("Vous avez atteint 50€ ou plus! Vous obtenez 20% de réduction, le nouveau prix est de $totalPrix€")
}
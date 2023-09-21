import java.util.*

object calculPrixPoids {
    const val kilo = 1000

    // Pour connaître le prix au kg de l'article
   private fun prixAuKg() {
        val sc = Scanner(System.`in`)
        print("Entrez le prix de votre article: ")
        val price = sc.nextDouble()
        print("Entrez le poids de votre article: ")
        val poids = sc.nextDouble()
        val result = price * kilo / poids
        System.out.printf("Voici le prix au kilo de votre article: %.2f€%n", result)
    }

    // Pour connaître le prix de l'article en connaissant le prix au kg et le poids de l'article
    private fun prixPiece() {
        val sc = Scanner(System.`in`)
        print("Entrez le prix au kg de votre article: ")
        val priceKg = sc.nextDouble()
        print("Entrez le poids de votre article: ")
        val poids = sc.nextDouble()
        val result = priceKg / kilo * poids
        System.out.printf("Voici le prix au kilo de votre article: %.2f€%n", result)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        while (true) {
            println("\nEntez votre choix:\n1. Prix au KG\n2. Prix de l'article\n3. Exit")
            val choice = sc.nextInt()
            when (choice) {
                1 -> prixAuKg()
                2 -> prixPiece()
                3 -> System.exit(0)
            }
        }
    }
}

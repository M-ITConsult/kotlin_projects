
const val pourcent = 100

private fun calculNombre() {
  print("Entrez le prix: ")
    val prix = readln().toDouble()
  print("Entrez le pourcentage: ")
    val pourcentage = readln().toDouble()
    val resultPourcent = prix * pourcentage / pourcent
    val resultFinal = String.format("%.2f", prix - resultPourcent)
    print("Le prix après la reduction est de $resultFinal€")
}


fun main() {
    calculNombre()
}
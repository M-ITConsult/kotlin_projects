
const val pourcent = 100

private fun calculNombre() {
  print("Entrez le prix: ")
    val price = readln().toDouble()
  print("Entrez le pourcentage: ")
    val pourcentage = readln().toDouble()
    val pourcentResult = price * pourcentage / pourcent
    val finalResult = String.format("%.2f", price - pourcentResult)
    print("Le prix après la reduction est de $finalResult€")
}


fun main() {
    calculNombre()
}